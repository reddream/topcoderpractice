package tc._475_382_DIV2_250;

public class ContiguousSubsequences {

	/**
	 * @param args
	 */
	public int[] findMaxAverage(int[] a, int K) {
		double sum = 0;
		double avg = 0;
		Final fi = new Final();
		Final sumfi = new Final();
		for (int i = 0; i < K; i++) {
			sum += a[i];
		}
		fi.ave = sum / K;
		fi.firstIndex = 0;
		fi.lastIndex = K - 1;
		for (int i = 0; i < a.length - K + 1; i++) {			
			sum = 0;
			for (int j = i; j < K + i && K + i < a.length + 1; j++) {
				//计算初始K个数字的和
				sum += a[j];
			}
			sumfi.ave = sum / K;
			sumfi.firstIndex = i;
			sumfi.lastIndex = i + K - 1;
			if (fi.ave < sumfi.ave) {
				fi.ave = sumfi.ave;
				fi.firstIndex = sumfi.firstIndex;
				fi.lastIndex = sumfi.lastIndex;
			}
			double temp = sum;
			for (int j = 1; j < a.length - K - i + 1; j++) {
				//向右移
				temp += a[i + K + j - 1];
				avg = temp / (K + j);
				if (fi.ave < avg) {
					fi.ave = avg;
					fi.lastIndex = sumfi.lastIndex + j;
					fi.firstIndex = sumfi.firstIndex;
				}
				if (fi.ave == avg
						&& (K + j) > (fi.lastIndex - fi.firstIndex + 1)) {
					fi.ave = avg;
					fi.lastIndex = sumfi.lastIndex + j;
					fi.firstIndex = sumfi.firstIndex;
				}
			}
			temp = sum;
			for (int j = i; j > 0; j--) {
				//向左移
				temp += a[j - 1];
				avg = temp / (K + i - j + 1);
				if (fi.ave < avg) {
					fi.ave = avg;
					fi.firstIndex = j - 1;
					fi.lastIndex = sumfi.lastIndex;
				}
				if (fi.ave == avg
						&& (K + i - j + 1) > (fi.lastIndex - fi.firstIndex + 1)) {
					fi.ave = avg;
					fi.firstIndex = j - 1;
					fi.lastIndex = sumfi.lastIndex;
				}
			}
		}
		int[] b = new int[2];
		b[0] = fi.firstIndex;
		b[1] = fi.lastIndex;
		return b;
	}

	public class Final {
		double ave;
		int firstIndex;
		int lastIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContiguousSubsequences c = new ContiguousSubsequences();
		int[] a = { 1, 3, 7 };
		int[] b = c.findMaxAverage(a, 2);
		System.out.println(b[0]);
		System.out.println(b[1]);

	}

}
