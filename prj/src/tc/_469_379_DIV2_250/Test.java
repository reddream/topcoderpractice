package tc._469_379_DIV2_250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234564654564";
		char[] m=s.toCharArray();
		 String str;
		int[] mm;
		mm=new int[m.length];
		for(int i=0;i<m.length;i++){
			 str = String.valueOf(m[i]);
			mm[i]=Integer.parseInt(str);
		}
		for(int i=0;i<mm.length;i++){
			System.out.print(mm[i]+"  ");
		}
	}

}
