package com.geminno.demo;

import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����ѧ���ķ��������ѧ���ĳɼ��ȼ�
		@SuppressWarnings("resource")
		int score=new Scanner(System.in).nextInt();//��������
		if(score>=90)
		{
			System.out.println("�ȼ�ΪA");
		}
		if(score>=80&&score<90)
		{
			System.out.println("�ȼ�ΪB");
		}
		if(score>=70&&score<80)
		{
			System.out.println("�ȼ�ΪC");
		}
		if(score>=60&&score<70)
		{
			System.out.println("�ȼ�ΪD");
		}
		if(score<60)
		{
			System.out.println("�ȼ�ΪE");
		}
	}

}
