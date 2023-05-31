package magmact_domain;

import java.io.Serial;
import java.io.Serializable;

public class Block implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private String stringBlock;
	private Integer intBlock;
	private BlockParameter blockParameter;
	private Operation operation;


	public Block(String stringBlock, Integer intBlock, BlockParameter blockParameter, Operation operation) {
		this.stringBlock = stringBlock;
		this.intBlock = intBlock;
		this.blockParameter = blockParameter;
		this.operation = operation;
	}

	public String getStringBlock() {
		return stringBlock;
	}

	public void setStringBlock(String value) {
		stringBlock = value;
		this.intBlock = null;
		this.blockParameter = null;
		this.operation = null;
	}

	public int getIntBlock() {
		return intBlock;
	}

	public BlockParameter getBlockParameter() {
		return blockParameter;
	}

	public Operation getOperation () {
		return operation;
	}

	public int getPathParamIndex() {
		return operation.getPathParameterIndex();
	}

	public String getQueryParameterName() {
		return operation.getUrlQueryParameterName();
	}

	public boolean isBlockParam() {
		return blockParameter != null;
	}

	public boolean isOperation() {
		return operation != null;
	}

	public boolean isQueryParam() {
		return operation != null && operation.isQueryParam();
	}

	public boolean isPathParam() {
		return operation != null && operation.isPathParam();
	}

	public void setBlockParameter(String value) {
		blockParameter.setParameter(value);
	}

	@Override
	public String toString() {
		if(blockParameter != null)
			return blockParameter.toString();
		else if (operation != null)
			return operation.toString();
		else
			return intBlock != null? String.valueOf(intBlock) : stringBlock;
	}
}
