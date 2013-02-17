package tc._495_392_DIV2_250;

public class AverageCandyLifetime {

	/**
	 * @param args
	 */
	public double getAverage(int[] eatenCandies){
		int[] temp=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int n=eatenCandies.length;
		double sum=0;
		double count=0;
		int days=0;
		double result=0;
		for(int i=0;i<n;i++){
			if(eatenCandies[i]!=0){
				days=0;
				for(int j=0;j<=i;j++){
					days=days+temp[j];
				}
				sum=sum+days*eatenCandies[i];
				count=count+eatenCandies[i];
			}
		}
		result=sum/count;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageCandyLifetime s=new AverageCandyLifetime();
		System.out.println(s.getAverage(new int[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
		System.out.println(s.getAverage(new int[]{0, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
		System.out.println(s.getAverage(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 50, 0, 0}));
		System.out.println(s.getAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
		
		
	}

}
