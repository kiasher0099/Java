package com.imooc;

public class CharDemo {

	public static void main(String[] args) {
		// Define a variable to store 'a'
		char a = 0;
		System.out.println("a="+a);
		char ch = 65535;
		System.out.println("ch="+ch);
		/* If type char variable exceed the limited value, 
		need a Type Cast */
		char ch1 = (char)65536;
		System.out.println("ch1="+ch1);
		// Define a variable to store unicode type char
		char c = '\u006d';
		System.out.println("c="+c);
		
		// Define a String 
		String S1 = "";
		System.out.println("S1="+S1);
		
		String S2 = "Hello";
		System.out.println("S2="+S2);
		
		String S3 = "\u005d\u005f \u0067\u1000";
		System.out.println("S3="+S3);
		
		String S4 = "Hello Java!";
		System.out.println("S4="+S4);
		
		
		// Print Standard ASCII
		/* 将ASCII码位于32~126之间的95个字符显示在屏幕上,
		 * 为了美观,要求小于100的码前面填充一个0,每打印8个字符后换行
		 */
		String temp="";
		for (int i = 32; i <=126; i++){
			temp = i<100?("0"+i):(""+i); //若小于100,前面加个0
		/*三目运算符
		* 格式：（条件表达式）？表达式1：表达式2；
		*如果条件表达式为true，就输出打印表达式1的内容
		如果条件表达式为false，就输出打印表达式2的内容*/
		System.out.print(temp+"="+(char)i+"\t");
		if((i-31)%8==0)
		System.out.println();
		}
	}
}