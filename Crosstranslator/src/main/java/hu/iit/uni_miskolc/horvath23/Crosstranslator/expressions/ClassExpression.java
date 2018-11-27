package hu.iit.uni_miskolc.horvath23.Crosstranslator.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 * Class definition
 */
public class ClassExpression extends Expression {
	
	private String name;
	private Block block;
	
	public ClassExpression(String name, Block block) {
		super();
		this.name = name;
		this.block = block;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	
}
