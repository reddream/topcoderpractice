package tc._497_393_DIV2_250;

public class VariableSpeedLimit {

	/**
	 * @param args
	 */
	public double journeyTime(int journeyLength, int[] speedLimit){
		int n=speedLimit.length;
		double result=0;
		double sum=0;
		for(int i=0;i<n;i++){
			sum=sum+speedLimit[i];
		}
		if(journeyLength%sum==0){
			result=journeyLength/sum;
		}else{
			int quotient=(int)(journeyLength/sum);
			double remind=journeyLength-quotient*sum;
			result=quotient*n;
			for(int i=0;i<n;i++){
				if(remind<=speedLimit[i]&&remind>0){
					double re=remind/speedLimit[i];
					remind=remind-speedLimit[i];					
					result=result+re;
				}else if(remind>speedLimit[i]){
					result=result+1;
					remind=remind-speedLimit[i];
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableSpeedLimit s=new VariableSpeedLimit();
//		System.out.println(s.journeyTime(100,new int[]{50}));
//		System.out.println(s.journeyTime(100,new int[]{50,25}));
		System.out.println(s.journeyTime(1000,new int[]{50,40,30,40,50}));
		
		System.out.println(s.journeyTime(2058,new int[]{80,43,57,23,28,45,60,75,73,80}));
		System.out.println(s.journeyTime(17216,new int[]{26,30,62,55,51,56,58,4,60,23,31}));
		System.out.println(s.journeyTime(9839,new int[]{45,90,13,4,81,50,81,10,64,86,69}));
	}

}
