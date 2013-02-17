package tc._473_381_DIV2_250;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		String value="IOILNMPKOQIIIMIRII";
		for (int j = 0; j < value.length(); j++) {
			temp += value.charAt(j) - 64;
		}
		System.out.println("IOILNMPKOQIIIMIRII :"+temp);
		temp=0;
		 value="NIMMKOQNRJKIMIQKL";
		for (int j = 0; j < value.length(); j++) {
			temp += value.charAt(j) - 64;
		}
		System.out.println("NIMMKOQNRJKIMIQKL :"+temp);
	}

}
