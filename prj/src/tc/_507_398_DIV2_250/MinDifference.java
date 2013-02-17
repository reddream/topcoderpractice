package tc._507_398_DIV2_250;

public class MinDifference {

	/**
	 * @param args
	 */
	public int closestElements(int A0, int X, int Y, int M, int n){
		int[] real=new int[n];
		real[0]=A0;
		int temp=0;
		int result=0;
		for(int i=1;i<n;i++){
			real[i]=(real[i-1]*X+Y)%M;
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(real[i]>real[j]){
					temp=real[j];
					real[j]=real[i];
					real[i]=temp;
				}
			}
		}
		result=Math.abs(real[1]-real[0]);
		for(int i=0;i<n-1;i++){
			temp=real[i+1]-real[i];
			if(result>Math.abs(temp)){
				result=Math.abs(temp);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinDifference m=new MinDifference();
//		{1, 1221, 3553, 9889, 11} 275
		System.out.println(m.closestElements(1,1221,3553,9889,11));
//		System.out.println((1221+3553)%9889);
	}

}
