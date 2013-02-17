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
		int[] number = new int[num.length];// ��ŷ���������
		List<Integer> count = new ArrayList<Integer>();
		int temp;
		for (int i = 0; i < s.length(); i++) {
			// �ж��Ƿ��з�����
			if (!Character.isDigit(s.charAt(i))) {
				return -2;
			}
		}
		if (number.length > 50 || number.length < 1) {
			// �жϳ����Ƿ񳬱�
			return -1;
		}
		if (number.length == 1) {
			// ���ֻ��һ�����ֵ����
			return 0;
		}
		for (int i = 0; i < number.length; i++) {
			// ���ַ������벢��������number��
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
		//��ȡ�����ݵ�resNum��
		int[] resNum = new int[count.size()];
		for (int i = 0; i < count.size(); i++) {
			resNum[i] = count.get(i);
		}
		
		// ѭ��һ�Σ�ֻ���ҳ����
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
