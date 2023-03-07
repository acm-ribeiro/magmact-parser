package magmact_domain;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("ALL")
public class Segment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Block> blocks;
	
	public Segment(List<Block> blocks) {
		this.blocks = blocks;
	}
	
	public List<Block> getBlocks() {
		return blocks;
	}

}
