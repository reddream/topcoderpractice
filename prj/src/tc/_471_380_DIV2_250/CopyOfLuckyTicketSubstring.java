package tc._471_380_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class CopyOfLuckyTicketSubstring {
	
	public int maxLength(String s) {
		int length=s.length();
		int l = s.length()/2;
		int[] numbers = new int[s.length()];
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			numbers[i]=Integer.parseInt(charArray[i]+"");
		}
		for(int i=l;i>0;i--){
		  for(int n=i-1;n+i<length;n++){
			  int sl=sumL(n,i,numbers);
			  int sr= sumR(n+1,i,numbers);
			  if(sl==sr)
				  return i*2;
		  }
		}		
		return 0;
	}
	
	
	private int sumR(int index,int len,int[] numbers){
		int sum=0;
		for(int i=index,j=0;j<len;i++,j++){
			sum += numbers[i];
		}
		return sum;
	}
	
	private int sumL(int index,int len,int[] numbers){
		int sum=0;
		for(int i=index,j=0;i>=0 && j<len;i--,j++){
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		CopyOfLuckyTicketSubstring luck = new CopyOfLuckyTicketSubstring();
		long start = System.currentTimeMillis();
		System.out.println(luck.maxLength("123231"));
		System.out.println(luck.maxLength("74233285"));
		for(int i=0;i<1000000;i++)
		  luck.maxLength("986561517416921217551395112859219257312");
		System.out.println(luck.maxLength("112"));
		System.out.println(luck.maxLength("1"));
		long end = System.currentTimeMillis();
		System.out.println("s:"+(end -start));
		start = System.currentTimeMillis();
		LuckyTicketSubstring lts = new LuckyTicketSubstring();
		System.out.println(lts.maxLength("123231"));
		System.out.println(lts.maxLength("74233285"));
		for(int i=0;i<1000000;i++)
			lts.maxLength("986561517416921217551395112859219257312");
		System.out.println(lts.maxLength("112"));
		System.out.println(lts.maxLength("1"));
		end = System.currentTimeMillis();
		System.out.println("s:"+(end -start));
	}

}
