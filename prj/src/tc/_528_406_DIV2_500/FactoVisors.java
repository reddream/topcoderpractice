package tc._528_406_DIV2_500;

import java.math.BigDecimal;

public class FactoVisors {

	/**
	 * @param args
	 */
	public int getNum(int[] divisors, int[] multiples) {
		int count = 0;
		double lcm = 0;
		double gcd = 0;
		double temp = 0;
		double num = 0;
		double value = 0;
		double r;
		double sqrtValue = 0;
		BigDecimal v = null;
		BigDecimal d = null;
		BigDecimal n = null;
		lcm = divisors[0];
		for (int i = 1; i < divisors.length; i++) {
			num = divisors[i];
			value = lcm;
			if (lcm < num) {
				temp = lcm;
				lcm = num;
				num = temp;
			}
			r = lcm % num;
			while (r != 0) {
				lcm = num;
				num = r;
				r = lcm % num;
			}
			v = new BigDecimal(value);
			d = new BigDecimal(divisors[i]);
			n = new BigDecimal(num);
			lcm = v.multiply(d).divide(n).doubleValue();
		}
		gcd = multiples[0];
		for (int j = 1; j < multiples.length; j++) {
			num = multiples[j];
			if (gcd < num) {
				temp = gcd;
				gcd = num;
				num = temp;
			}
			r = gcd % num;
			while (r != 0) {
				gcd = num;
				num = r;
				r = gcd % num;
			}
			gcd = num;
		}
		if (lcm > gcd || lcm == 0)
			return count;
		sqrtValue = Math.round(Math.sqrt(lcm) * Math.sqrt(gcd));
		for (double i = lcm; i <= sqrtValue; i++) {
			if (gcd % i == 0 && i % lcm == 0) {
				if (i == sqrtValue)
					count++;
				else
					count += 2;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoVisors f = new FactoVisors();
//		System.out.println(f.getNum(new int[] { 1 }, new int[] { 100 }));
//		System.out.println(f.getNum(new int[] { 6, 9 }, new int[] { 18 }));
//		System.out.println(f.getNum(new int[] { 6, 9 }, new int[] { 96, 180 }));
//		System.out.println(f.getNum(new int[] { 2, 4 }, new int[] { 256 }));
//		System.out.println(f.getNum(new int[] { 1000, 10000, 100000 },
//				new int[] { 1000000000 }));
		System.out.println(f.getNum(new int[] {31846, 50682909, 50682909, 1, 2, 16894303, 2, 3, 1, 95538, 2, 31846, 33788606, 3, 16894303, 1061, 1061, 15923, 31846, 6366, 6, 6, 1061, 3, 6, 31846, 47769, 6, 101365818, 50682909, 15923}, new int[] {709560726, 709560726, 709560726, 709560726, 709560726}));
	}

}
