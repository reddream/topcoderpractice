package tc._479_384_DIV2_250;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Prank {

	public int[] realWightV3(int a){
		int m=(int)Math.sqrt(a);
		List<Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=m+1;i++){
			if(a%i==0){
				int r=a/i;
				int s=i+r;
				int n=s/2;
				if(!list.contains(n) && n!=m && s%2==0){
					list.add(n);
				}
			}
		}
		int n = list.size();
		int[] real = new int[n];
		for (int i = 0; i < n; i++) {
			real[i] = list.get(n-i-1);
		}
		return real;
	}
	
	
	public int[] realWeightV2(int apparentGain) {
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> factList = new ArrayList<Integer>();
		getYinzi(apparentGain,factList);
		int mu=1;
		int aG=apparentGain;
		for(int i=0;i<factList.size();i++){			
			int f=factList.get(i);
			while(aG%f==0 && aG >1){
			aG /=f;
			mu *=f;
			int rest = apparentGain/mu;
			int sum=mu+rest;
			if(sum%2==0){
				list.add(sum/2);
			}}
		}
		int n = list.size();
		int[] real = new int[n];
		for (int i = 0; i < n; i++) {
			real[i] = list.get(i);
		}
		return real;
	}

	static void getYinzi(int iNum,List<Integer> list) {
		for (int i = 2; i <= iNum; i++) {
			if (iNum % i == 0) {
				if (isPrime(i)) {
					list.add(i);
				}
			}
		}
	}

	static boolean isPrime(int iNum) {
		for (int i = 2; i < iNum; i++) {
			if (iNum % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public int[] realWeight(int apparentGain) {
		int m = (int) Math.sqrt(apparentGain);
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= m && i * i != apparentGain; i++) {
			int x = 0;
			int temp = apparentGain / i + i;
			if (apparentGain % i == 0 && temp % 2 == 0) {
				x = apparentGain / i;
				list.add((x + i) >> 1);
			}
		}
		int n = list.size();
		int[] real = new int[n];
		for (int i = 0; i < n; i++) {
			real[i] = list.get(i);
		}
		return real;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prank p = new Prank();
		int[] real = p.realWightV3(10000);
		//[25001, 12502, 6254, 3133]
		//{325, 350, 550, 665, 1025, 1270, 2510, 3133, 5005, 6254, 12502, 25001}
		for (int i : real) {
			System.out.print("  " + i);
		}
	}

}
