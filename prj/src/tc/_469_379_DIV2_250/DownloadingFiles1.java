package tc._469_379_DIV2_250;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadingFiles1 {

	/**
	 * @param args
	 */
	public static double actime=0;
	public double actualTime(String[] tasks){
		Double sumQ=0.0;
		Double sumS=0.0;
		for(String s:tasks){
			String[] array=s.split(" ");
			Double speed = Double.parseDouble(array[0]);	
			Double time = Double.parseDouble(array[1]);
			sumQ+=speed*time;
			sumS+=speed;
		}
		return sumQ/sumS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DownloadingFiles1 down=new DownloadingFiles1();
		String[] tasks={"1 10", "1 20", "1 10", "1 10"};
		double s=down.actualTime(tasks);
		System.out.println("s:"+s);
	}

}
