package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			HashSet<Integer> lotteryNum = new HashSet<>();
			while (lotteryNum.size() < 6) {
	            int num = (int) (Math.random() * 49) + 1;
	            
	            if (!removeNum.contains(num)) {
	                lotteryNum.add(num);
	            }
	        }
			List<Integer> sortedLotteryNum = new ArrayList<>(lotteryNum);
	        Collections.sort(sortedLotteryNum);
			System.out.print("第"+i+"組號碼為：");
			System.out.println(sortedLotteryNum.toString());
		}
	}
}