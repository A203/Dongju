package com.geminno.demo;

import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 * @param System 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
String dayString =new Scanner(System.in).nextLine();//�����ַ���
int day =0;
// �������ַ���ת����Сд��ʽ��
switch (dayString.toLowerCase())
{
case "monday":day=1;break;
case "tuesday":day=2;break;
case "wednesday":day=3;break;
case "thursday":day=4;break;
case "friday":day=5;break;
case "saturday":day=6;break;
case "sunday":day=7;break;
default:day=0;
	
//����day��ֵ������������Ƿ�����Чֵ
}
if(day==0)
{
	System.out.println("��Ч����");
}
else
{
	System.out.println(day);
}
}
}
