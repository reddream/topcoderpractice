package tc._512_400_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class GrabbingTaxi {

	/**
	 * @param args
	 */
	public int minTime(int[] tXs, int[] tYs, int gX, int gY, int walkTime, int taxiTime){
		List<Integer> list=new ArrayList<Integer>();
		int temp=0;
		for(int i=0;i<tXs.length;i++){
			temp=(Math.abs(tXs[i])+Math.abs(tYs[i]))*walkTime+(Math.abs(gX-tXs[i])+Math.abs(gY-tYs[i]))*taxiTime;
			list.add(temp);
		}
		temp=(Math.abs(gX)+Math.abs(gY))*walkTime;
		for(int i=0;i<list.size();i++){
			if(list.get(i)<temp){
				temp=list.get(i);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
