package tc._499_394_DIV2_250;

import java.util.HashMap;
import java.util.Map;

public class MountainWalk {

	private int curi,curj;
	public int cellsVisited(String[] areaMap, int heightDifference){
		Map<String,Integer> walked=new HashMap<String,Integer>();
		walked.put("0_0", 0);
		//(i+1, j), (i, j-1), (i-1, j), (i, j+1) 
		curi=0;
		curj=0;
		while(walk(walked,areaMap,curi,curj,heightDifference)){
			
		}
		return walked.size();
	}
	
	private boolean walk(Map<String,Integer> walked,String[] areaMap,int i,int j,int h){
		if(move(walked, areaMap, i, j, h, i+1,j)){
			return true;
		}else if(move(walked, areaMap, i, j, h, i,j-1)){
			return true;
		}else if(move(walked, areaMap, i, j, h, i-1,j)){
			return true;
		}else if(move(walked, areaMap, i, j, h, i,j+1)){
			return true;
		}
		return false;
	}

	private boolean move(Map<String, Integer> walked, String[] areaMap, int i,
			int j, int h, int x, int y) {
		if(x<0 || y<0)
			return false;
		if(x>=areaMap.length){
			return false;
		}
		if(y>=areaMap[0].length()){
			return false;
		}
		String key =String.format("%s_%s", x,y);
		if(walked.containsKey(key)){
			return false;
		}
		int preh = getH(areaMap,i,j);
		int nh = getH(areaMap, x, y);
		if(Math.abs(nh-preh) <=h){
			walked.put(key,y);
			this.curi=x;
			this.curj=y;
			System.out.println(String.format("%s,%s", x,y));
			return true;
		}
		return false;
	}

	private int getH(String[] areaMap, int x, int y) {
		String str = areaMap[x];
		int nh=Integer.parseInt(str.charAt(y)+"");
		return nh;
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MountainWalk mw = new MountainWalk();
		System.out.println(mw.cellsVisited(new String[]{"056"}
,
1));

	}

}
