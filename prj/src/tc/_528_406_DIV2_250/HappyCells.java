package tc._528_406_DIV2_250;

public class HappyCells {

	/**
	 * @param args
	 */
	public int[] getHappy(String[] grid) {
		boolean on = false;
		boolean dn = false;
		int[] happy = new int[] { 0, 0, 0 };
		int maxLength = grid[0].length();
		boolean[][] newGrid = new boolean[grid.length + 2][maxLength + 2];
		for (int j = 0; j < grid.length; j++)
			for (int k = 0; k < grid[j].length(); k++)
				if (grid[j].charAt(k) == '.')
					newGrid[j + 1][k + 1] = true;
		
		for (int m = 1; m < newGrid.length - 1; m++)
			for (int n = 1; n < newGrid[m].length - 1; n++)
				if (newGrid[m][n]) {
					if (!newGrid[m - 1][n - 1] && !newGrid[m - 1][n + 1]
							&& !newGrid[m + 1][n - 1] && !newGrid[m + 1][n + 1])
						dn = true;
					if (!newGrid[m][n - 1] && !newGrid[m - 1][n]
							&& !newGrid[m + 1][n] && !newGrid[m][n + 1])
						on = true;
					if (on && dn)
						happy[0] += 1;
					else if (on && !dn)
						happy[1] += 1;
					else if (!on && dn)
						happy[2] += 1;
					dn = false;
					on = false;
				}
		return happy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyCells h = new HappyCells();
		int[] v = h.getHappy(new String[] { "XXX", "X.X", "XXX" });
		System.out.println("{" + v[0] + "," + v[1] + "," + v[2] + "}");
		v = h.getHappy(new String[] { "." });
		System.out.println("{" + v[0] + "," + v[1] + "," + v[2] + "}");
		v = h.getHappy(new String[] { "XXXXXX", "X.XXXX", "XXX.XX", "X..XXX",
				"XXXXXX" });
		System.out.println("{" + v[0] + "," + v[1] + "," + v[2] + "}");
		v = h.getHappy(new String[] { "..." });
		System.out.println("{" + v[0] + "," + v[1] + "," + v[2] + "}");
	}

}
