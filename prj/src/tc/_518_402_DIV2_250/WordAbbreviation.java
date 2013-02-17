package tc._518_402_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class WordAbbreviation {

	/**
	 * @param args
	 */
	public String[] getAbbreviations(String[] words) {
		int n = words.length;
		int m=0;
		String x;
		String y;
		boolean flag = true;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			m=0;
			if(i==n-1){
				for(int k=1;k<=words[i].length()&&m==0;k++){
					flag=true;
					for (int j = 0; j < list.size(); j++) {
						x=list.get(j).toString();
						y=words[i].subSequence(0, k).toString();
						flag=flag&&compare(x,y);
					}
					if(flag==true){
						list.add(words[i].subSequence(0, k).toString());
						m++;
					}
				}
			}else{
			for (int k = 1; k <= words[i].length()&&m==0; k++) {			
				for (int j = i+1; j < n&&j!=i; j++) {
					flag=true;
					x=words[i].subSequence(0, k).toString();
					y=words[j];
					flag=flag&&compare(x,y);	
					if(flag==false)
						break;
				}
				for (int j = 0; j < list.size()&&!list.isEmpty(); j++) {
					x=list.get(j).toString();
					y=words[i].subSequence(0, k).toString();
					flag=flag&&compare(x,y);
				}
				if(flag==true){
					list.add(words[i].subSequence(0, k).toString());
					m++;
				}
					//break;
			}
			}
		}
		String[] result = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public boolean compare(String x, String y) {
		//有相同的返回false
		boolean flag=true;
		int m = x.length() < y.length() ? x.length() : y.length();
			if (x.substring(0, m).toString().equals(y.substring(0, m).toString())) {
				flag= false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordAbbreviation w = new WordAbbreviation();
//		List list=new ArrayList();
//		System.out.println(list.isEmpty());
//		list.add("dfs");
//		System.out.println(list.isEmpty());
		 System.out.println(w.getAbbreviations(new
		 String[]{"smpqkudbnlrakjmeuvjkotlriavb", "abkbpfhtbtbhbnvlnhsljpenbtbb", "tfshjfjji", "tqgirgtbsqliauvfonkhmnsmqdpnbklbheeromkoakrguqi", "svjgfrui", "rbdttgitopnntistgsdkihjsmhmdinpeamaabjaco", "jlofberqpnembohbmulpdfqpvkgvg", "rpcrjkndckmmsrmqlldrmncngkaucfeiklaesa", "sata"}
));
		 System.out.println("sm "+"a "+"tf "+"tq "+"sv "+"rb "+"j "+"rp "+"sa ");
//		 System.out.println(w.getAbbreviations(new
//		 String[]{"aaab","aaac","aaad"}));
//		System.out.println(w.getAbbreviations(new String[] { "top", "coder",
//				"contest" }));
//		 System.out.println(w.getAbbreviations(new String[]{
//		 "bababaaaaa",
//		 "baaabaababa",
//		 "bbabaaabbaaabbabaabaabbbbbaabb",
//		 "aaababababbbbababbbaabaaaaaaaabbabbbaaab",
//		 "baaaaabaababbbaabbbabbababbbabbbbbbbbab"
//		 }
//		 ));
		// System.out.println(w.getAbbreviations(new String[]{"oneword"}));

	}
}
