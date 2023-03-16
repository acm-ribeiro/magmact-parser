import magmact_domain.*;
import magmact_parser.VisitorOrientedParser;
import org.junit.Test;

import javax.json.JsonArray;
import javax.naming.InsufficientResourcesException;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MAGMACtDomainTests {

    @Test
    public void test_url_constructor_one_id() {
        String expected = "/resources/{resource_id}";
        String actual = new Url(expected).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_url_constructor_multiple_ids() {
        String expected = "/projects/{id}/repository/branches/{branch}";
        String actual = new Url(expected).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_set_collection_url_parameter_value() {
        Formula f = getFormula("for a in response_body(GET /as) : exists b in response_body(GET /as/{a.id}/bs) :- " +
                "request_body(this){name} != {b.name}");

        QuantifiedFormula quantifiedFormula = f.getQuantifiedFormula();
        quantifiedFormula.setCollectionUrlParameterValue("id", "1");

        String expected = "for a in response_body(GET /as) : exists b in response_body(GET /as/1/bs) :- " +
                "request_body(this){name} != {b.name}";
        String actual = quantifiedFormula.toString();

        assertEquals(expected, actual);
    }


    @Test
    public void test_boolean_expression_set_string_parameter() {
        Formula f = getFormula("request_body(this){name} != {b.name}");

        BooleanExpression exp = f.getBooleanExpression();
        exp.setStringParameter("name", "resource_name");

        String expected = "request_body(this){name} != resource_name";
        String actual = exp.toString();

        assertEquals(expected, actual);
    }


    @Test
    public void test_getPreviousRequest_response() {
        Formula f = getFormula("previous(response_body(GET /resources/{resource_id})) == 2");

        String actual = f.getOperationPrevious().getHTTPRequest().toString();
        String expected = "GET /resources/{resource_id}";

        assertEquals(expected, actual);
    }

    @Test
    public void test_getPreviousRequest_request() {
        Formula f = getFormula("previous(request_body(GET /resources/{resource_id})) == 2");

        String actual = f.getOperationPrevious().getHTTPRequest().toString();
        String expected = "GET /resources/{resource_id}";

        assertEquals(expected, actual);
    }

    @Test
    public void getPrevious() {
        Formula f1 = getFormula("previous(response_body(GET /rs/{r_id})) == response_body(this)");
        Formula f2 = getFormula("response_body(this) == previous(response_body(GET /rs/{r_id}))");

        OperationPrevious prev1 = f1.getOperationPrevious();
        OperationPrevious prev2 = f2.getOperationPrevious();

        assertEquals(prev1.toString(), prev2.toString());
    }




    /**
     * Parser initialisation. Returns a parsed formula.
     * @param f string to be parsed as a formula
     * @return formula object.
     */
    private static Formula getFormula(String f) {
        VisitorOrientedParser parser = new VisitorOrientedParser();
        return parser.parse(f);
    }
}
