package com.geminno.demo;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=5;
    int j=3;
   // System.out.println("i+j="+(i+j));
   // System.out.println("i/j="+(i/j));
   //System.out.println("i%j="+(i%j));
    //前缀递增
    System.out.println(++i);
    System.out.println(j++);
    //关系运算符
    if(i>=j)
    {
    	System.out.println("i大于等于j");	
    }
	//逻辑运算符
    boolean flag=true;
    int m=0;
    if(flag&&(++m)>0)
    {
    	
    }
    System.out.println("m的值"+m);
    
    //位操作
    int a=3; //0000000000   00000000 00000000 00000011
    int b=2; //00000000   00000000 00000000 00000010
    System.out.println("a&b:"+(a&b));
    System.out.println("a|b:"+(a|b));
    System.out.println("a^b:"+(a^b));
    System.out.println("a>>b:"+(a>>b));
    System.out.println("a<<b:"+(a<<b));
    }
}





