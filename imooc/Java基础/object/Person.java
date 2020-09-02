package com.imooc.object;

public class Person {
	//属性：name、age、grade
    String name = "小明";
    int age = 10;
    String grade = "五年级";

    //创建无参无返回值的student方法，描述为：我是一名学生！
	public void student() {
	    System.out.println("我是一名学生");
	}


    //创建带参（性别sex）的sex方法，描述为：我是一个**孩！
	public void sex(String gender) {
	    System.out.println("我是一个"+gender+"孩儿！");
	}


    //创建无参无返回值的mySelf方法，分别介绍姓名（name），年龄（age），年级（grade）
	public void mySelf() {
	    System.out.println("我叫"+name+",今年"+age+"岁了，读小学"+grade+"了。");
	}
}
