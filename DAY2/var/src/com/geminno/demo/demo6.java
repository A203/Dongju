package com.geminno.demo;

public class demo6 {
	private static int intDay;
	public  enum  day{monday,tuesday,wednesday,thursday,friday,saturday,sunday};
		public static void main(String[] args)
		{
	setIntDay(0);
			day day1=day.wednesday;
			switch(day1)
			{
			case monday:setIntDay(1);break;
			case tuesday:setIntDay(2);break;
			case wednesday:setIntDay(3);break;
			case thursday:setIntDay(4);break;
			case friday:setIntDay(5);break;
			case saturday:setIntDay(6);break;
			case sunday:setIntDay(7);break;
			}
}
		public static int getIntDay() {
			return intDay;
		}
		public static void setIntDay(int intDay) {
			demo6.intDay = intDay;
		}
}

