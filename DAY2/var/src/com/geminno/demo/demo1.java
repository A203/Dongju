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
    //ǰ׺����
    System.out.println(++i);
    System.out.println(j++);
    //��ϵ�����
    if(i>=j)
    {
    	System.out.println("i���ڵ���j");	
    }
	//�߼������
    boolean flag=true;
    int m=0;
    if(flag&&(++m)>0)
    {
    	
    }
    System.out.println("m��ֵ"+m);
    
    //λ����
    int a=3; //0000000000   00000000 00000000 00000011
    int b=2; //00000000   00000000 00000000 00000010
    System.out.println("a&b:"+(a&b));
    System.out.println("a|b:"+(a|b));
    System.out.println("a^b:"+(a^b));
    System.out.println("a>>b:"+(a>>b));
    System.out.println("a<<b:"+(a<<b));
    }
}




