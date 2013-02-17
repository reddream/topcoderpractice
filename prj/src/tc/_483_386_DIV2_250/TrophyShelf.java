package tc._483_386_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class TrophyShelf {

	/**
	 * @param args
	 */
	public int[] countVisible(int[] trophies){
		int m=0;
		int n=0;
		int q=trophies.length;
		int[] result=new int[2];
		List<Integer> left=new ArrayList<Integer>();
		List<Integer> right=new ArrayList<Integer>();
		left.add(trophies[0]);
		right.add(trophies[q-1]);
		for(int i=1;i<q;i++){	
			if(trophies[i]>Integer.parseInt(left.get(m).toString())){
				left.add(trophies[i]);
				m++;
			}
		}
		for(int i=q-2;i>=0;i--){	
			if(trophies[i]>Integer.parseInt(right.get(n).toString())){
				right.add(trophies[i]);
				n++;
			}
		}
		result[0]=left.size();
		result[1]=right.size();
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrophyShelf s=new TrophyShelf();
		int[] a={7, 4, 2, 1, 5};
		System.out.println(s.countVisible(a)[0]+" "+s.countVisible(a)[1]);
		int[] b={50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(s.countVisible(b)[0]+" "+s.countVisible(b)[1]);
		int[] c={1,2,5,2,1};
		System.out.println(s.countVisible(c)[0]+" "+s.countVisible(c)[1]);
		int[] d={1,4,2,5,3,7,1};
		System.out.println(s.countVisible(d)[0]+" "+s.countVisible(d)[1]);
	
	}

}
