package tc._493_391_DIV2_250;

import java.util.ArrayList;
import java.util.List;

//未完成
public class SnowyWinter {

	/**
	 * @param args
	 */
	public int snowyHighwayLength(int[] startPoints, int[] endPoints) {
		List<Integer> list = new ArrayList<Integer>();
		int n = startPoints.length;
		int sum = 0;
		int temp = 0;
		int tempEnd;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (startPoints[i] > startPoints[j]) {
					temp = startPoints[i];
					startPoints[i] = startPoints[j];
					startPoints[j] = temp;
					tempEnd = endPoints[i];
					endPoints[i] = endPoints[j];
					endPoints[j] = tempEnd;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("  " + startPoints[i] + " " + endPoints[i]);
		}
		System.out.println("1 n :" + n);
		// 有问题
		while (flag < n) {
			System.out.println("1 glag :" + flag);
			if (flag == n - 1) {
				list.add(startPoints[flag]);
				list.add(endPoints[flag]);
				flag = n + 10;
				break;
			} else if (flag == n - 2) {
				System.out.println("2 glag :" + flag);
				System.out.println("2 startPoints[flag] :" + startPoints[flag]);
				list.add(startPoints[flag]);
				if (endPoints[flag] >= startPoints[flag + 1]) {
					temp = endPoints[flag] >= endPoints[flag + 1] ? endPoints[flag]
							: endPoints[flag + 1];
					list.add(temp);
					flag = n + 10;
					break;
				} else {
					list.add(endPoints[flag]);
					list.add(startPoints[flag + 1]);
					list.add(endPoints[flag + 1]);
					flag = n + 10;
					break;
				}
			} else {
				for (int i = flag; i < n - 2; i++) {
					System.out.println("3 glag :" + flag);
					temp = 0;
					list.add(startPoints[i]);
					if (endPoints[i] > startPoints[i]) {
						for (int j = i + 1; j < n - 2; j++) {
							if (endPoints[i] >= startPoints[j] && endPoints[i] <=endPoints[j]) {
								list.add(endPoints[j]);	
								flag=j+1;
							} else if (endPoints[i] < startPoints[j]) {
								list.add(endPoints[j]);
								flag=j;
							}
							
						}
					}

				}
			}
		}
		for (int i = 1; i < list.size();) {
			sum = sum + list.get(i) - list.get(i - 1);
			System.out.print("  " + list.get(i - 1) + " " + list.get(i));
			i = i + 2;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowyWinter s = new SnowyWinter();
		// System.out.println(s.snowyHighwayLength(new int[] { 17, 85, 57 },
		// new int[] { 33, 86, 84 }));
		System.out.println(s
				.snowyHighwayLength(
						new int[] { 45, 100, 125, 10, 15, 35, 30, 9 },
						new int[] { 46, 200, 175, 20, 25, 45, 40, 10 }));
		// System.out.println(s.snowyHighwayLength(new
		// int[]{4387,711,2510,1001,4687,3400,5254,584,284,1423,3755,929,2154,5719,1326,2368,554},
		// new
		// int[]{7890,5075,2600,6867,7860,9789,6422,5002,4180,7086,8615,9832,4169,7188,9975,8690,1423}
		// ));
		// System.out.println(s.snowyHighwayLength(new int[]
		// {4906,5601,5087,1020,4362,2657,6257,5509,5107,5315,277,6801,2136,2921,5233,5082,497,8250,3956,5720},
		// new int[]
		// {4930,9130,9366,2322,4687,4848,8856,6302,5496,5438,829,9053,4233,4119,9781,8034,3956,9939,4908,5928}));
		// System.out.println(s.snowyHighwayLength(new int[]
		// {51,807,943,4313,8319,3644,481,220,2161,448,465,1657,6290,22,6152,647,3185,4474,2168},
		// new int[]
		// {1182,912,1832,7754,9557,7980,4144,3194,7129,5535,1172,2043,6437,7252,9508,4745,8313,8020,4017}));
		// System.out.println(s.snowyHighwayLength(new int[]
		// {8786,7391,201,4414,5822,5872,157,1832,7487,7518,2267,1763,3984,3102,7627,4099,524,1543,1022,3060},
		// new
		// int[]{9905,7957,3625,6475,9314,9332,4370,8068,8295,8177,7772,2668,7191,8480,9211,4802,2625,1924,9970,4180}
		// ));
		//
	}

}
