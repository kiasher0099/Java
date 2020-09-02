package com.imooc.method;
/**
 *  
 * s_关于可变参数列表和重载的问题
 * @author Kiasher
 * @version 1.0
 *
 */
public class ArgsDemo {
	// 当调用重载方法时，可变参数列表所在的方法是最后被访问的。
	public void sum(int... n) {
		int sum = 0;
		for(int i:n) {
			sum = sum + i;
		}
		System.out.println("sum="+sum);
	}
	
	public void search(int n, int... a) {
		boolean flag = false;
		for(int a1:a) {
			if(a1==n) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了！"+n);
		} else {
			System.out.println("没找到！"+n);
		}
	}
	
	public static void main(String[] args) {
		ArgsDemo ad = new ArgsDemo();
		ad.sum(1);
		ad.sum(1,2);
		ad.sum(1,2,3,4,5,6,7);
		ad.search(1,2,4,10,2,1);
		int[] a1= {1,2,3,4};
		ad.search(3,a1);
	}
}
