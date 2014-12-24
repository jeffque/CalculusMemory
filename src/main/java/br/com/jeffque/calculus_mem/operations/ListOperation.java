package br.com.jeffque.calculus_mem.operations;

import br.com.jeffque.calculus_mem.Memory;
import br.com.jeffque.calculus_mem.Operation;

public abstract class ListOperation<Op> extends Operation<Op, Op> {
	protected abstract BinaryOperation<Op> getBinaryOperation();
	protected abstract Op getNeutralElement();
	private Memory<Op,Op> neutralElement;
	
	protected Memory<Op,Op> getNeutralMemory() {
		if (neutralElement == null) {
			neutralElement = new Memory<Op, Op>("Neutral element", getNeutralElement());
		}
		return neutralElement;
	}
	
	@Override
	public Op calculate() {
		Op result = getNeutralElement();
		BinaryOperation<Op> binOp = getBinaryOperation();
		
		for (Memory<Op,?> operand: operands) {
			result = binOp.binaryCalc(result, operand);
		}
		return result;
	}
}
