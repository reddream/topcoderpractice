package tc._487_388_DIV2_250;

public class MonotoneSequence {

	/**
	 * @param args
	 */
	public int longestMonotoneSequence(int[] seq){
		int n=seq.length;
		int m=1;
		int temp=1;
		int tempn=0;
		int q=0;
		boolean flag=true;	
		while(q<n-1){
			temp=1;
			for(int i=q;i<=n-2;i++){
				if(seq[i]<seq[i+1]){				
					temp=temp+1;
					q=i+1;
				}else{					
					q=i+1;
					break;
				}	
			}
			if(m<temp){
				m=temp;
			}
			
		}
		q=0;
		while(q<n-1){
			temp=1;
			for(int i=q;i<=n-2;i++){
				if(seq[i]>seq[i+1]){				
					temp=temp+1;
					q=q+1;
				}else{		
					q=q+1;
					break;
				}	
			}
			if(m<temp){
				m=temp;
			}
			
		}
			return m;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			MonotoneSequence s=new MonotoneSequence();
			int[] e={1, 2, 3};
			System.out.println(s.longestMonotoneSequence(e));
			
	}

}
