package com.geminno.demo;


public class VarDemo {

	public void varDefine()
	{
	}  
	public static void main(String[] args)
	{
	
        // TODO Auto-generated method stub
		//访问方式：类名。属性名
        //System.out.println(VarDemo.number);
		//VarDemo demo=new VarDemo();
		//System.out.println("age数值"+demo.age);
		
		//访问方式：对象。属性名
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
    	System.out.println("实变量number"+number);
    	System.out.println("实例变量age"+age);
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