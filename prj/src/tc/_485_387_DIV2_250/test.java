package tc._485_387_DIV2_250;

public class test {

	/**
	 * @param args
	 */
	public int guess(int[] A){
		int n=A.length;
		int m=0;
		boolean flag=true;
		for(int i=0;i<n-2;i++){
			if(A[i+1]*2!=(A[i]+A[i+2])){
				flag=false;
			}
		}
		if(flag==false){
		m=A[n-1]*A[n-1]/A[n-2];
			return m;	
		}else{
			m=A[n-1]*2-A[n-2];
			return m;
		}
	}
	public void main(String[] args){
		test s=new test();
		int[] a={364,843,1322,1801};
		System.out.println(s.guess(a));
	}
}
