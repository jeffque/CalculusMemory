package br.com.jeffque.calculus_mem;

import java.util.ArrayList;

public abstract class Operation<R, Op> {
	protected ArrayList<Memory<Op,?>> operands;
	public Operation() {
		operands = new ArrayList<Memory<Op,?>>();
	}

	public abstract R calculate();
	
	public void addOperand(Memory<Op, ?> operand) {
		operands.add(operand);
	}
}
