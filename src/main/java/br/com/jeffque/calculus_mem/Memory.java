package br.com.jeffque.calculus_mem;

public class Memory<T, R> {
	protected T result;
	protected Operation<T,R> op;
	public final String id;
	protected boolean finalResult;
	
	public Memory(String id, Operation<T,R> op) {
		this.id = id;
		this.op = op;
	}
	
	public Memory(String id, T result) {
		this.id = id;
		this.result = result;
		finalResult = true;
	}
	
	public void resetCalculation() {
		if (!finalResult) {
			result = null;
		}
	}
	
	public T consolidate() {
		if (result == null) {
			result = op.calculate();
		}
		return result;
	}
	
	public Operation<T,R> getOperation() {
		return op;
	}
	
	public void addDependency(Memory<R,?> dep) {
		if (!finalResult) {
			op.addOperand(dep);
			result = null;
		}
	}
}
