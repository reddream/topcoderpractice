package tc._481_385_DIV2_250;

public class RussianSpeedLimits {

	/**
	 * @param args
	 */
	public int getCurrentLimit(String[] signs){
		int n=signs.length;
		int m=0;
		if(signs[n-1].equals("city")){
			for(int i=0;i<n;i++){
				if(signs[i].equals("city")){
					m++;
				}
			}
			if(m%2==0){
				return 60;
			}else{
				return 90;
			}
		}else if(signs[n-1].equals("default")){
			for(int i=0;i<n;i++){
				if(signs[i].equals("city")){
					m++;
				}
			}
			if(m%2==0){
				return 60;
			}else{
				return 90;
			}
		}else{
			return Integer.parseInt(signs[n-1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RussianSpeedLimits speed=new RussianSpeedLimits();
		String[] signs0={"80"};
		System.out.println(speed.getCurrentLimit(signs0));
		String[] signs1={"40", "70", "default", "20", "50"};
		System.out.println(speed.getCurrentLimit(signs1));
		String[] signs2={"40", "70", "default"};
		System.out.println(speed.getCurrentLimit(signs2));
		String[] signs3={"40", "80", "city"};
		System.out.println(speed.getCurrentLimit(signs3));
		String[] signs4={"city", "60"};
		System.out.println(speed.getCurrentLimit(signs4));
		String[] signs5={"city", "50", "default"};
		System.out.println(speed.getCurrentLimit(signs5));
		String[] signs6={"city", "city", "city", "city"};
		System.out.println(speed.getCurrentLimit(signs6));
	}

}
