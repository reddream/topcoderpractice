package tc._467_378_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="She is john";
		char[] b=s.toCharArray();
		char[] c=b.clone();
		for(int i=0;i<b.length;i++){
			c[i]='c';
		}
		System.out.print(s.indexOf("h"));
		}
//		char[] n=s.toLowerCase().toCharArray();
//		for(int i=0;i<n.length;i++){
//			Character re=n[i];
//			String r=re.toString();
//			System.out.print(re);
//			System.out.println("----------");
//			System.out.print(r);
//			//if(s.contains(re)){
////				replaceAll
//			}
//		}
//	
//		StringBuffer[] f ;
//		for(int i=0;i<n.length;i++){
//			f.append(n[i]);
//		}
		
//		System.out.print(n.toString().valueOf(d));
//		int firstSize = 19;//t y 24 to v 21
//		int firstRotate = 2;
//		int secondRotate=3;
//		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
//				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//				'w', 'x', 'y', 'z' };
//		char[] a = alphabet.clone();
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("a[" + i + "]:" + a[i]);
//		}
//		for (int j = 0; j < firstSize; j++) {
//			if (j + firstRotate < firstSize - 1) {
//				a[j] = alphabet[j + firstRotate];
//			} else {
//				a[j] = alphabet[j + firstRotate - firstSize + 1];
//			}
//		}
//		for (int j = firstSize - 1; j < 26; j++) {
//			if (j + secondRotate <25) {
//				a[j] = alphabet[j + secondRotate];
//			} else {
//				a[j] = alphabet[j + secondRotate - 26+firstSize + 1 ];
//			}
//		}
	

}
