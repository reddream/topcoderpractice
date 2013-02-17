package tc._505_397_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheCode {

	/**
	 * @param args
	 */
	public String decodingEncoding(String code, String message){
		char[] c=code.toCharArray();
		char[] temp=message.toCharArray();
		List list=new ArrayList();
		StringBuffer result=new StringBuffer();
		StringBuffer t;
		if(code.contains(String.valueOf(message.charAt(0)))){
			int j=0;
			for(int i=0;i<temp.length;i++){
				j=code.indexOf(temp[i]);
				j=j+1;
				if(j<10){
				list.add("0"+String.valueOf(j));
				}else{
					list.add(j);
				}
				
			}
		}else {
			int [] s=new int[temp.length/2];
			for(int i=0;i<temp.length/2;i++){
				t=new StringBuffer();
				t.append(String.valueOf(temp[2*i]));
				t.append(String.valueOf(temp[2*i+1]));
				s[i]=Integer.parseInt(t.toString());
			}
			for(int i=0;i<s.length;i++){
				list.add(c[s[i]-1]);
			}
		}
		for(int i=0;i<list.size();i++){
			result.append(list.get(i).toString());
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakingTheCode b=new BreakingTheCode();
		System.out.println(b.decodingEncoding("abcdefghijklmnopqrstuvwxyz", "test"));
		System.out.println(b.decodingEncoding("abcdefghijklmnopqrstuvwxyz", "20051920"));
		System.out.println(b.decodingEncoding("qesdfvujrockgpthzymbnxawli", "mwiizkelza"));
		System.out.println(b.decodingEncoding("faxmswrpnqdbygcthuvkojizle", "02170308060416192402"));
	}

}
