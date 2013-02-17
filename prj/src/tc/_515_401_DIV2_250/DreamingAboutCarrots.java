package tc._515_401_DIV2_250;

public class DreamingAboutCarrots {

	/**
	 * @param args
	 */
	public int carrotsBetweenCarrots(int x1, int y1, int x2, int y2){
		float temp=0;
		int m=0;
		if(x1==x2){
			m=Math.abs(y2-y1)-1;
		}else if(y1==y2){
			m=Math.abs(x2-x1)-1;
		}else{
			float k=(float)Math.abs(y2-y1)/(float)Math.abs(x2-x1);
			int n;
			if(x1>x2){
				n=x1;
				x1=x2;
				x2=n;
			}
			if(y1>y2){
				n=y1;
				y1=y2;
				y2=n;
			}
		for(int i=x1+1;i<=x2;i++){
			for(int j=y1+1;j<=y2;j++){
				temp=((float)(j-y1))/((float)(i-x1));
				if(temp==k&&!(i==x2&&j==y2)){
					m=m+1;
				}
			}
		}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		DreamingAboutCarrots d=new DreamingAboutCarrots();
		System.out.println(d.carrotsBetweenCarrots(42, 0, 0, 0));
	}

}
