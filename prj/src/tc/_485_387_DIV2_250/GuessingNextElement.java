package tc._485_387_DIV2_250;

public class GuessingNextElement {
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
	m=A[n-1]/A[n-2]*A[n-1];
		return m;	
	}else{
		m=A[n-1]-A[n-2]+A[n-1];
		return m;
	}
}
public static void main(String[] args){
	GuessingNextElement s=new GuessingNextElement();
	int[] a={364,843,1322,1801};
	System.out.println(s.guess(a));
	int[] b={394,1172,1950,2728,3506,4284,5062,5840};
	System.out.println(s.guess(b));
	
	int[] c={13,117,1053,9477,85293};
	System.out.println(s.guess(c));
	int[] d={22,220,2200,22000};
	System.out.println(s.guess(d));
	int[] e={250000, 500000, 1000000};
	System.out.println(s.guess(e));
	
	
}
}
