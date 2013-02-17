package tc._503_396_DIV2250;

public class VerifyCreditCard {

	/**
	 * @param args
	 * Odd even pos * 2
	 * Even odd pos * 2
	 * sum of digitals
	 * sum %10 ==0 valid
	 */
	public String checkDigits(String cardNumber){
		char[] c=cardNumber.toCharArray();
		int n=c.length;
		int sum=0;
		int temp=0;
		int[]  card=new int[n];
		
		for(int i=0;i<n;i++){
			card[i]=Integer.parseInt(String.valueOf(c[i]));
		}
		if(n%2==0){
			for(int i=0;i<n;i++){
				temp=0;
				if(i%2==0){
					temp=card[i]*2;
					if(temp>=10){
						sum=sum+temp-10+1;
					}else{
						sum=sum+temp;
					}
				}else{
					sum=sum+card[i];
				}
			}
		}else{
			for(int i=0;i<n;i++){
				temp=0;
				if(i%2!=0){
					temp=card[i]*2;
					if(temp>=10){
						sum=sum+temp-10+1;
					}else{
						sum=sum+temp;
					}
				}else{
					sum=sum+card[i];
				}
		}
		}
		if(sum%10==0){
			return "VALID";
		}else{
			return "INVALID";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerifyCreditCard v=new VerifyCreditCard();
		System.out.println(v.checkDigits("21378"));
		System.out.println(v.checkDigits("31378"));
		System.out.println(v.checkDigits("11111101"));
		System.out.println(v.checkDigits("50005"));
		System.out.println(v.checkDigits("542987223412"));
	}

}
