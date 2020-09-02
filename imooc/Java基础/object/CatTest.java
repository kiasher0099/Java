package com.imooc.object;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat miao = new Cat();
		miao.eat();
		miao.run();
		miao.setAges(1);
		System.out.println("昵称："+miao.name);
		System.out.println("年龄："+miao.getAges());
		System.out.println("体重："+miao.weight);
		System.out.println("品种："+miao.species);
	}

}
