package tc._526_405_DIV2_250;

public class FallingFactorialPower {

	/**
	 * @param args
	 */
	public double compute(int n, int k) {
		if (k == 0)
			return 1;
		else if (k > 0)
			return n * compute(n - 1, k - 1);

		return compute(n, k+1)/(n-k);

	}
	
	public double compute2(int n,int k){
		double result=1;
		if(k==0)
			return result;
		else if(k>0)
		for(int i=n;i>=(n-k+1);i--){
			result*=i;
		}
		else{
			k=(-1)*k;
			for(int i=1;i<=k;i++){
				result/=(n+i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FallingFactorialPower f = new FallingFactorialPower();
		System.out.println(f.compute2(7, 3));
		System.out.println(f.compute2(10, 1));
		System.out.println(f.compute2(5, 0));
		System.out.println(f.compute2(3, -1));
		System.out.println(f.compute2(2, -3));
	}

}
