package com.systex.main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int group = Integer.parseInt(args[0]);
		String remove = args[1];
		Set<Integer> removeNum = new HashSet<>();
		
		String[] numbers = remove.split(" ");
		
        for (String number : numbers) {
            removeNum.add(Integer.parseInt(number));
        }
		
		for(int i =1 ; i<=group ; i++) {
			Set<Integer> lotteryNum = new TreeSet<>();
			while (lotteryNum.size() < 6) {
	            int num = (int) (Math.random() * 49) + 1;
	            
	            if (!removeNum.contains(num)) {
	                lotteryNum.add(num);
	            }
	        }
			System.out.print("第"+i+"組號碼為：");
			System.out.println(lotteryNum.toString());
		}
	}
}