package com.geminno.demo;


public class VarDemo {

	public void varDefine()
	{
	}  
	public static void main(String[] args)
	{
	
        // TODO Auto-generated method stub
		//���ʷ�ʽ��������������
        //System.out.println(VarDemo.number);
		//VarDemo demo=new VarDemo();
		//System.out.println("age��ֵ"+demo.age);
		
		//���ʷ�ʽ������������
		//VarDemo demo1=new VarDemo();
		//demo1.show();
		
		//VarDemo demo2=new VarDemo();
		//demo2.show();
		
		VarDemo demo=new VarDemo();
		demo.min(5);
}
    public void show()
    {
    	int number = 0;
    	int age = 0;
    	number++;
    	age++;
    	System.out.println("ʵ����number"+number);
    	System.out.println("ʵ������age"+age);
    }
    public void min(int i)
    {
  	    int age=5;
  	    System.out.println(age);		
    	int j=0;
    	if(i>j)
    	{System.out.println(j);
    	}
    }
}