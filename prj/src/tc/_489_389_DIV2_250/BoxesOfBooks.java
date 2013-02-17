package tc._489_389_DIV2_250;

public class BoxesOfBooks {

	/**
	 * @param args
	 */
	public int boxes(int[] weights, int maxWeight) {
		int n = weights.length;
		int q = 0;
		int sum = 0;
		int boxCount = 0;
		while (q < n) {
			sum = 0;
			for (int i = q; i < n; i++) {

				if (i == n - 1) {
					if (sum + weights[i] <= maxWeight) {
						boxCount = boxCount + 1;
					} else {
						boxCount = boxCount + 2;
					}
					q = i + 1;

					break;
				}
				if (sum + weights[i] < maxWeight) {
					sum = sum + weights[i];

				} else if (sum + weights[i] == maxWeight) {
					boxCount = boxCount + 1;
					q = i + 1;

					break;
				} else {
					boxCount = boxCount + 1;
					q = i;

					break;
				}

			}
		}
		return boxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxesOfBooks b = new BoxesOfBooks();

		 int[] x={ 51, 51, 51, 51, 51 };
		 System.out.println(b.boxes(x, 100));
		int[] y ={ 12, 1, 11, 2, 10, 3, 4, 5, 6, 6, 1 };
		System.out.println(b.boxes(y, 12));
		 int[] z={ 12, 1, 11, 2, 10, 3, 4, 5, 6, 6, 1 };
		 System.out.println(b.boxes(z, 12));

	}

}
