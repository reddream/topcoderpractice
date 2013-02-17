package tc._501_395_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class SquareDigitNumbers {

	/**
	 * @param args
	 */
	public int getNumber(int n){
		int[] m={0,1,4,9};
		int x=0;
		int y=0;
		int result=0;
		List<Integer> list=new ArrayList<Integer>();
		while(n>0){
			if(n<4){
				list.add(n);
				n=0;
				break;
			}
			x=n%4;	
			list.add(x);
		n=n-x;
		n=(int)(n/4);			
		}
		for(int i=0;i<list.size();i++){
			result=result+m[list.get(i)]*((int)Math.pow(10,i));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareDigitNumbers s=new SquareDigitNumbers();
		System.out.println(s.getNumber(0));
		System.out.println(s.getNumber(5));
		System.out.println(s.getNumber(16));
		System.out.println(s.getNumber(121));
		System.out.println(s.getNumber(123));
		
	}

}
