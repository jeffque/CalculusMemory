package br.com.jeffque.calculus_mem.operations;

import java.math.BigDecimal;

public class SummatoryBigDecimal extends ListOperation<BigDecimal> {
	SumBigDecimal binOp = new SumBigDecimal();

	@Override
	protected BinaryOperation<BigDecimal> getBinaryOperation() {
		return binOp;
	}

	@Override
	protected BigDecimal getNeutralElement() {
		return BigDecimal.ZERO;
	}

}
