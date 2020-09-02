package com.imooc.object;

public class PersonTest {

	public static void main(String[] args) {
		 //使用new关键字实例化对象
			Person ps = new Person();
	      //传入name、age、grade的参数值
			ps.name = "小明";
	        ps.age = 10;
	        ps.grade = "五年级";
	        String gender = "男";
	      //分别调用student、sex、mySelf方法
	        ps.student();		
	        ps.sex(gender);
	        ps.mySelf();

	}

}
