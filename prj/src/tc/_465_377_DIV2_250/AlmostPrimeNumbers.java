package tc._465_377_DIV2_250;

import java.math.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 Problem Statement      An integer N greater than 1 is called almost prime if
 * and only if the following conditions hold: N is not prime. In other words, it
 * is divisible by some positive integer other than 1 and itself. Each positive
 * divisor of N (other than 1) is greater than 10. Return the smallest almost
 * prime number that is strictly greater than m. Definition      Class:
 * AlmostPrimeNumbers Method: getNext Parameters: int Returns: int Method
 * signature: int getNext(int m) (be sure your method is public)     
 * 
 * Constraints - m will be between 1 and 10^6, inclusive. Examples 0)
 * 
 *      200 Returns: 209 201 is divisible by 3, which is less than 10, so 201 is
 * not almost prime. 202, 204, 206, and 208 are all divisible by 2. 203 is
 * divisible by 7, 205 by 5, and 207 by 3. So, the smallest almost prime number
 * greater than 200 is 209 = 11*19. 1)
 * 
 *      666 Returns: 667 667 = 23*29, so it's almost prime. 2)
 * 
 *      1000 Returns: 1003
 * 
 * 3)
 * 
 *      1591 Returns: 1633
 * 
 * 4)
 * 
 *      6 Returns: 121 The smallest almost prime number is 11*11 = 121. This
 * problem statement is the exclusive and proprietary property of TopCoder, Inc.
 * Any unauthorized use or reproduction of this information without the prior
 * written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder,
 * Inc. All rights reserved.
 * 
 * 
 * */

public class AlmostPrimeNumbers {
	int base=11;
	List<Integer> list = new ArrayList<Integer>();
	public int getNext(int m){	
		int k = (int)Math.sqrt(m);
		for(int i=base;i<=k;i++){
			if(!this.isprime(i))
				list.add(i);
		}
		if(list.size()==0)
			list.add(base);
		for(int i=m+1;i<=10000000;i++){
			if(!isDiv(i)){	
				return i;
			}
		}
		return 0;
	}
	
	private boolean isDiv(int m){
		if(m%2==0 || m%3==0 || m%7==0 || m%5==0)
			return true;
		int k=(int)Math.sqrt(m);
		if(k<10);
			k=m;
		for(int i=0;i<list.size();i++){
			int n= list.get(i);
			if(m%n==0 && m!=n){
				return false;
			}
		}
		for(int i=list.get(list.size()-1);i<=k;i++){
			if(!isprime(i)){
				if(m%i==0&&m!=i)
					return false;
			}
		}
		return true;
	}
	
	private boolean isprime(int n){
		int prime=1;
		if(1==n)
			prime=0;
		int k=(int)Math.sqrt(n);
		for(int i=2;prime > 0&&i<=k;i++){
			if(0==n%i){
				prime=0;
				break;
			}		
		}
		if(prime==1)
			list.add(n);
		return prime==0;
	}

	public static void main(String[] args) {
		// 200 209 ; 666 667 ; 1000 1003; 1591 1633
		AlmostPrimeNumbers apn = new AlmostPrimeNumbers();
		System.out.println(apn.getNext(200));
		System.out.println(apn.getNext(666));
		System.out.println(apn.getNext(1000));
		System.out.println(apn.getNext(1591));
		System.out.println(apn.getNext(6));
		System.out.println(apn.getNext(855707));
	}

}
