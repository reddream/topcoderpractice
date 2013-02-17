package tc._473_381_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class TheBestName {

	/**
	 * @param args
	 */
	public String[] sort(String[] names) {
		int[] count = new int[names.length];
		int m = 0;
		int[] count2 = new int[names.length];
		List<String> namesWeight = new ArrayList<String>();// john 47
		for (int i = 0; i < names.length; i++) {
			int temp = 0;
			for (int j = 0; j < names[i].length(); j++) {
				temp += names[i].charAt(j) - 64;
			}

			namesWeight.add(names[i]);
			namesWeight.add(String.valueOf(temp));
			count[i] = temp;
		}
		count2=count;
		for (int i = 0; i < count.length;i++) {
			if (count[i] == 47) {
				if(i==0&&m==0){
					m++;
				}else{
				for(int n=i;n>m;n--){
					count[n]=count[n-1];
					count[m]=47;
					namesWeight.set(n*2,namesWeight.get(2*n-2).toString());
					namesWeight.set(m*2, "JOHN");
					m++;
				}
				}
			} else {
				for (int j = i; j < count.length; j++) {
					if (count[i] < count[j]) {
						int temp = count[i];
						count[i] = count[j];
						count[j] = temp;
						String s = namesWeight.get(2 * i).toString();
						namesWeight.set(2 * i, namesWeight.get(2 * j)
								.toString());
						namesWeight.set(2 * j, s);
					}
				}
			}
		}

		String[] name=new String[namesWeight.size()/2];
		
		for(int i=0;i<count2.length;i++){
			for(int j=i+1;j<count2.length;j++){
				if(count2[i]==count2[j]&&count2[i]!=47){
					int e=0;
					int f=0;
					if(namesWeight.indexOf(names[i])>namesWeight.indexOf(names[j])){
						 e=namesWeight.indexOf(names[i]);
						 f=namesWeight.indexOf(names[j]);
						System.out.print(" e:"+e+" f:"+f);
						System.out.print(" i:"+i+" j:"+j);
						System.out.print(" count2[i]e:"+count2[i]+" count2[i]f:"+count2[j]);
						System.out.print(" namese:"+names[i]+" namesf:"+names[j]);
						String s = namesWeight.get(e).toString();
						namesWeight.set(e, namesWeight.get(f)
								.toString());
						namesWeight.set(f, s);
						System.out.println();
					}
				}
			}
		}
		for(int i=0;i<name.length;i++){
			name[i]=namesWeight.get(i*2).toString();
		}
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheBestName name=new TheBestName();
		String[] na={"JOHN", "A", "AA", "AAA", "JOHN", "B", "BB", "BBB", "JOHN", "C", "CC", "CCC", "JOHN"};
		String[] s=name.sort(na);
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"  ");
		}
		System.out.println("---------------");
		System.out.println("JOHN JOHN JOHN JOHN CCC BBB CC BB AAA C AA B A");
	}

}
