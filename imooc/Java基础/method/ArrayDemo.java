package com.imooc.method;

public class ArrayDemo {

	public void update_array(int[] a) {
		a[3] = 15;
		System.out.println("数组a的元素为");
		for(int n:a) {
			System.out.println(n+"   ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		int[] a1 = {1,2,3,4,5};
		System.out.println("方法调用前，数组a1的元素为");
		// 使用增强型 for 循环遍历数组
		for(int n:a1) { 
			System.out.println(n+"   ");
		}
		System.out.println();
		ad.update_array(a1); // a和a1都指向数组的第一个元素地址
		System.out.println("方法调用后，数组a1的元素为");
		for(int n:a1) {
			System.out.println(n+"   ");
		}
		System.out.println();
	}

}
