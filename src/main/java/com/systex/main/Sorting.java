package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<MyDate> dates = new LinkedList<>();
		
		int sortby = Integer.parseInt(args[0]);
		
		dates.add(new MyDate(1,2,2024));
		dates.add(new MyDate(4,2,2024));
		dates.add(new MyDate(4,2,2024));
		dates.add(new MyDate(13,2,2023));
		dates.add(new MyDate(15,2,2023));
		
		System.out.println("排序前：");
		dates.forEach(d -> System.out.println(d));
		System.out.println("===============================");

		
		if(sortby == 0) { 
			System.out.println("順序：");
			Collections.sort(dates,MyDate.COMP);
			dates.forEach(d -> System.out.println(d));
		}
		else if(sortby == 1){
			System.out.println("倒序：");
			Collections.sort(dates,MyDate.COMP.reversed());
			dates.forEach(d -> System.out.println(d));
		}
		else {
			System.out.println("參數錯誤，只能0或1");
		}
	}
}
