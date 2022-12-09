package valtechspring.aop;

public class SimpleInterestImpl implements SimpleInteres  {
	
	public Arithmetic arithmetic;
	
	public SimpleInterestImpl(){}
	
	public SimpleInterestImpl(Arithmetic arithmetic){
		this.arithmetic=arithmetic;
	}
	
	
	public void setArithmetic(Arithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}
	
	@Override
	public int computeSimpleInterest(int principal,int time,int rateOfInterest){
		return arithmetic.div(arithmetic.mul(principal,time,rateOfInterest),100);
	}
	
}	
