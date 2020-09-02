package com.imooc.object;
/**
 * Cat 喵喵类
 * @author Kiasher
 * @date 2020.08.27
 */
public class Cat {
	// 成员属性： 昵称、年龄、体重、品种
	String name;
	// 修改属性的可见性 --- private仅限当前类内部可见	
	private int ages;
	double weight;
	String species;
	// 创建get/set方法
	// 在get/set方法中添加对属性的限定
	public void setAges(int ages) {
		this.ages = ages;
	}
	public String getAges() {
		return "咪咪今年"+this.ages+"岁啦！";
	}
	
	
	
	// 成员方法：跑动、吃喝
	public void run() {
		System.out.println("猫咪快跑~");
	}
	
	public void eat( ) {
		System.out.println("猫咪吃饭啦~");
	}
}
