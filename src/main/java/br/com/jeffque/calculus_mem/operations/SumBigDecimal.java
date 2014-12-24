package br.com.jeffque.calculus_mem.operations;

import java.math.BigDecimal;

public class SumBigDecimal extends BinaryOperation<BigDecimal> {

	@Override
	protected BigDecimal binaryCalcElement(BigDecimal operandLeft,
			BigDecimal operandRight) {
		return operandLeft.add(operandRight);
	}

}
