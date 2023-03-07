package magmact_domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Url implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Segment> segments;


	/**
	 * Creates an Url instance from a string. OAS spec urls do not contain apostl operations.
	 * @param url  string url
	 */
	public Url (String url) {
		segments = new ArrayList<>();

		// Splitting the url by the segments (segments are separated by a "/")
		ArrayList<String> url_parts = new ArrayList<>(Arrays.asList(url.split("/")));

		// Removing the first element of the list since it will cause an empty string block
		// e.g., "/resource" -> split("/") will return ["", "resource"]
		url_parts.remove(0);

		for (String part: url_parts) {
			List<Block> blocks = new ArrayList<>();
			Block block;

			if(part.contains("{")) {
				// Is a string block parameter. e.g. "/{resource_id}"
				// Removing the curly brackets since they're already added in the block parameter class constructor.
				part = part.replace("{", "").replace("}", "");

				// Creating a new block with the block parameter name
				block = new Block(null, null, new BlockParameter(part), null);
			} else {
				// Is a simple string block. e.g. "/resource"
				block = new Block(part, null, null, null);
			}

			blocks.add(block);
			Segment seg = new Segment(blocks);
			segments.add(seg);
		}
	}

	public Url(List<Segment> segments) {
		this.segments = segments;
	}
	
	public List<Segment> getSegments() {
		return segments;
	}

	/**
	 * Returns the url's path parameter index value, when applicable.
	 * @return index when exists; -1 otherwise.
	 */
	public int getPathParameterIndex() {
		for (Segment s : segments)
			for (Block b : s.getBlocks())
				if (b.isPathParam())
					return b.getPathParamIndex();

		return -1;
	}

	/**
	 * Returns the url's query parameter name, when applicable.
	 * @return parameter name when exists; null otherwise.
	 */
	public String getUrlQueryParameterName() {
		for (Segment s : segments)
			for (Block b : s.getBlocks())
				if (b.isQueryParam())
					return b.getQueryParameterName();

		return null;
	}


	public String getCollectionUrlParameterName() {
		for (Segment s: segments)
			for (Block b: s.getBlocks())
				if (b.isBlockParam())
					if (b.getBlockParameter().toString().contains(".")) {
						String no_curly = b.getBlockParameter().toString().replace("{", "").replace("}", "");
						return no_curly.split("\\.")[1];
					} else
						return b.getBlockParameter().getParameter();

		return null;
	}

	public String getComposedParameterName() {
		for (Segment s: segments)
			for (Block b: s.getBlocks())
				if(b.isOperation() && b.getOperation().hasComposedParameters())
					return b.getOperation().getComposedParameterName();

		return null;
	}

	public void updateRequestBodyBlock(String name, String value) {
		for (Segment s: segments)
			for (Block b: s.getBlocks())
				if(b.isOperation() && b.getOperation().isRequestBody())
					if (b.getOperation().getComposedParameterName().equalsIgnoreCase(name))
						b.setStringBlock(value);
	}

	public void updateResponseBodyBlock(String name, String value) {
		for (Segment s: segments)
			for (Block b: s.getBlocks())
				if(b.isOperation() && b.getOperation().isResponseBody())
					if (b.getOperation().getComposedParameterName().equalsIgnoreCase(name))
						b.setStringBlock(value);
	}


	public void updateBlockParameter(String name, String value) {
		for (Segment s: segments)
			for (Block b: s.getBlocks())
				if (b.isBlockParam() && b.getBlockParameter().getParameter().contains(name))
					b.setStringBlock(value);
	}


	public boolean hasPathParameter() {
		for (Segment s: segments)
			for(Block b: s.getBlocks())
				if(b.isPathParam())
					return true;

		return false;
	}


	public boolean hasQueryParameter() {
		for (Segment s: segments)
			for(Block b: s.getBlocks())
				if(b.isQueryParam())
					return true;

		return false;
	}

	public boolean hasRequestBody() {
		for (Segment s: segments)
			for (Block b : s.getBlocks())
				if(b.isOperation() && b.getOperation().isRequestBody())
					return true;

		return false;
	}

	public boolean hasResponseBody() {
		for (Segment s: segments)
			for (Block b : s.getBlocks())
				if(b.isOperation() && b.getOperation().isResponseBody())
					return true;

		return false;
	}

	public boolean hasBlockParameter() {
		for (Segment s: segments)
			for (Block b : s.getBlocks())
				if (b.isBlockParam())
					return true;

		return false;
	}


	@Override
	public String toString() {
		String url = "/";
		
		for(Segment s : segments) {
			for(Block b : s.getBlocks())
				if(b.isBlockParam())
					url += b.getBlockParameter().toString();
				else
					url += b.toString();

			url += "/";
		}
		
		return url.substring(0, url.length() - 1);
	}
}
