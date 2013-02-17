package tc._523_404_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class ReadingBooks {

	/**
	 * @param args
	 */
	public int countBooks(String[] readParts){
		// "introduction", "story",  "edification"
		
		int n=readParts.length;
		int result=0;
		String[] temp=new String[3];
		String[] compare=new String[]{"introduction", "story",  "edification"};
		for(int i=0;i<n-2;){
			temp[0]=readParts[i];
			temp[1]=readParts[i+1];
			temp[2]=readParts[i+2];
			if(find(compare,temp)){
				result=result+1;
				i=i+3;
			}else{
				i=i+1;
			}
		}
		return result;
	}
	public boolean find(String[] readParts,String[] s){
		boolean flag=false;
		List<String> list=new ArrayList<String>();
		for(int i=0;i<readParts.length;i++){
			list.add(readParts[i]);
		}
		for(int i=0;i<s.length;i++){
			if(list.contains(s[i])){
				list.remove(s[i]);
			}
		}
		if(list.isEmpty()){
			flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadingBooks p=new ReadingBooks();
		System.out.println(p.countBooks(
				new String[]{"introduction", "story", "introduction", "edification", "story",
						 "story", "edification", "edification", "edification", "introduction",
						 "introduction", "edification", "story", "introduction", "story",
						 "edification", "edification", "story", "introduction", "edification",
						 "story", "story", "edification", "introduction", "story"}
));
	}

}
