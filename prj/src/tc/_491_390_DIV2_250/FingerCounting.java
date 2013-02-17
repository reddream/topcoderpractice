package tc._491_390_DIV2_250;

public class FingerCounting {

	public int maxNumber2(int weakFinger, int maxCount){
		int array[]= new int[]{1,2,3,4,5,4,3,2};
		int n=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==weakFinger){
				n++;
			}
		}
		int rest = maxCount%n;	
		int sum = 8*((int)(maxCount/n));		
		for(int i=0;i<array.length;i++){
			if(array[i]==weakFinger){
				rest--;
			}
			if(rest <0){
				break;
			}
			sum++;
		}
		return sum;
	}
	
	
	/**
	 * @param args
	 */
	public int maxNumber(int weakFinger, int maxCount){
		int m=0;
		int sum=maxCount*4+5;
		if(weakFinger==5){
			m=4+maxCount*8;
		}else if(weakFinger==1){
			m=maxCount*8;
		}
		else {
		if(maxCount%2==0){
			m=sum-(5-weakFinger+1);
		}else{
			m=sum-weakFinger;
		}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FingerCounting s=new FingerCounting();
		System.out.println(s.maxNumber2(1, 0));
//		System.out.println(s.maxNumber(1,0 ));
//		System.out.println(s.maxNumber(5,0 ));
//		System.out.println(s.maxNumber(2, 48));
//		System.out.println(s.maxNumber(5,973));
//		System.out.println(s.maxNumber(3,99999 ));
	System.out.println(74600);	
	}

}
