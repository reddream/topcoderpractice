package tc._471_380_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class LuckyTicketSubstring {

	/**
	 * @param args
	 */
	public int maxLength(String s) {
		char[] num = s.toCharArray();
		String str;
		int[] number = new int[num.length];// 存放分离后的整数
		List<Integer> count = new ArrayList<Integer>();
		int temp;
		for (int i = 0; i < s.length(); i++) {
			// 判断是否含有非整数
			if (!Character.isDigit(s.charAt(i))) {
				return -2;
			}
		}
		if (number.length > 50 || number.length < 1) {
			// 判断长度是否超标
			return -1;
		}
		if (number.length == 1) {
			// 如果只有一个数字的情况
			return 0;
		}
		for (int i = 0; i < number.length; i++) {
			// 将字符串分离并存入数组number中
			str = String.valueOf(num[i]);
			number[i] = Integer.parseInt(str);
		}
		
		for (int i = 0; i < number.length; i++) {
			int tempLeft = 0;
			int tempRight = 0;
				for (int n = 1; n < i + 2 && n < number.length - i ; n++) {
					tempLeft += number[i - n + 1];
					tempRight += number[i + n];
					if (tempLeft == tempRight) {
						count.add(n * 2);
					}
			}
		}
		
		if(count.isEmpty()){
			return 0;
		}
		//抽取出数据到resNum中
		int[] resNum = new int[count.size()];
		for (int i = 0; i < count.size(); i++) {
			resNum[i] = count.get(i);
		}
		
		// 循环一次，只需找出最大
		for (int i = 0; i < 1; i++) {
			for (int j = i; j < resNum.length; j++) {
				if (resNum[i] < resNum[j]) {
					temp = resNum[i];
					resNum[i] = resNum[j];
					resNum[j] = temp;
				}
			}
		}
		
		return resNum[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuckyTicketSubstring luck = new LuckyTicketSubstring();
		int m = luck.maxLength("23");
		System.out.println("m:" + m);
	}

}
