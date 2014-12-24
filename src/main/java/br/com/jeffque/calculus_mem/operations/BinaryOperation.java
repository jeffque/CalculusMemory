package br.com.jeffque.calculus_mem.operations;

import br.com.jeffque.calculus_mem.Memory;
import br.com.jeffque.calculus_mem.Operation;

public abstract class BinaryOperation<Op> extends Operation<Op,Op> {
	
	@Override
	public Op calculate() {
		Memory<Op, ?> operandLeft = operands.get(0);
		Memory<Op, ?> operandRight = operands.get(1);
		return binaryCalc(operandLeft, operandRight);
	}

	protected Op binaryCalc(Memory<Op,?> operandLeft, Memory<Op,?> operandRight) {
		return binaryCalcElement(operandLeft.consolidate(), operandRight.consolidate());
	}
	
	protected Op binaryCalc(Op operandLeft, Memory<Op,?> operandRight) {
		return binaryCalcElement(operandLeft, operandRight.consolidate());
	}

	protected abstract Op binaryCalcElement(Op operandLeft, Op operandRight);
}
