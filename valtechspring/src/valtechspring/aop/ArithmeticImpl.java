package valtechspring.aop;

public class ArithmeticImpl implements Arithmetic {
	
	@Override
	public int add(int a,int b){
		return a+b;
	}
	
	
	
	
	@Override
	public int sub(int a,int b){
		return a-b;
	}
	
	@Override
	public int mul(int a,int b){
		return a*b;
	}
	
	@Override
	public int div(int a,int b){
		return a/b;
	}




	@Override
	public int add(int... a) {
		int res=0;
		for(int i:a){
			res+=i;
		}
		return res;
	}




	@Override
	public int mul(int... a) {
		int res=1;
		for(int i:a){
			res*=i;
		}
		return res;
	}
	
}	
