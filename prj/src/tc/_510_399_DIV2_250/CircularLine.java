package tc._510_399_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class CircularLine {

	/**
	 * @param args
	 */
	public int longestTravel(int[] t){
		List<Integer> list=new ArrayList<Integer>(); 
		int n=t.length;
		int result=0;
		for(int i=0;i<n-2;i++){
			list.add(t[i]+t[i+1]);
		}
		list.add(t[n-1]+t[n-2]);
		list.add(t[0]+t[n-1]);
		result=list.get(0);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++){
			if(result>list.get(i)){
				result=list.get(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLine c=new CircularLine();
//		System.out.println(c.longestTravel(new int[]{1,1,1,1}));
		System.out.println(c.longestTravel(new int[]{1,4,4,1,5}));
//		System.out.println(c.longestTravel(new int[]{1,1,1000}));
//		System.out.println(c.longestTravel(new int[]{1,1000,1,1000}));
//		System.out.println(c.longestTravel(new int[]{1,1,1,1,4}));
	}

}
