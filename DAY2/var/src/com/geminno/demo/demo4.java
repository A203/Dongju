package com.geminno.demo;

import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
int score=new Scanner(System.in).nextInt();//输入整数
if(score<0||score>100)
{
	System.out.println("输入错误");
}
else{
    if(score>=60)
{
	System.out.println("成绩合格");
}
    else{
    	System.out.println("成绩不合格");
    	
    }
}
	}

}



