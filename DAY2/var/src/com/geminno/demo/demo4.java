package com.geminno.demo;

import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
int score=new Scanner(System.in).nextInt();//��������
if(score<0||score>100)
{
	System.out.println("�������");
}
else{
    if(score>=60)
{
	System.out.println("�ɼ��ϸ�");
}
    else{
    	System.out.println("�ɼ����ϸ�");
    	
    }
}
	}

}



