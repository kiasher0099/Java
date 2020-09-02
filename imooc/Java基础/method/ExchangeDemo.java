package com.imooc.method;

public class ExchangeDemo {

	public void swap(int a, int b) {
		int temp;
		System.out.println("交换前：a="+a+", b="+b);
		temp = a; a = b; b = temp;
		System.out.println("交换前：a="+a+", b="+b);
	}
	
	public void swap_test() {
		int m = 4, n = 5;
		System.out.println("交换前：m="+m+", n="+n);
		swap(m,n);
		System.out.println("交换后：m="+m+", n="+n);
	}
	
	public static void main(String[] args) {
		ExchangeDemo ed = new ExchangeDemo();
		ed.swap_test();
	}

}
