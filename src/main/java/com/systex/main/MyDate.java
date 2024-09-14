package com.systex.main;

import java.util.Comparator;

public class MyDate implements Comparable<MyDate> {
	
	private int day;
	private int month;
	private int year;
	
	public static final Comparator<MyDate> COMP = new Comparator<MyDate>() {

		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if(o1.getYear()>o2.getYear()) {
				return 1;
			}
			else if(o1.getYear()<o2.getYear()) {
				return -1;
			}
			else {
				if(o1.getMonth()>o2.getMonth()){
					return 1;
				}
				else if(o1.getMonth()<o2.getMonth()) {
					return -1;
				}
				else {
					if(o1.getDay()>o2.getDay()) {
						return 1;
					}
					else if(o1.getDay()<o2.getDay()) {
						return -1;
					}
					else {
						return 0;
					}
				}
			}

		}
		
	};
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public int compareTo(MyDate o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "year = "+year+" month = "+month+" day= "+day;
	}
}