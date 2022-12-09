package valtechspring.aop;

public interface Arithmetic {

	int add(int a, int b);
	
	int add(int ...a);

	int sub(int a, int b);

	int mul(int a, int b);
	
	int mul(int...a);

	int div(int a, int b);

}