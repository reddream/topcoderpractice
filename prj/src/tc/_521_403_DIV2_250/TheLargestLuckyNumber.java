package tc._521_403_DIV2_250;

import java.util.ArrayList;
import java.util.List;

public class TheLargestLuckyNumber {

	/**
	 * @param args
	 */
	public int find(int n){
		int temp=0;
		int result=0;
		int m=0;
		String s=String.valueOf(n);
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++){
			if(Integer.parseInt(String.valueOf(s.charAt(i)))>7){
				for(int j=i;j<s.length();j++){
					list.add(7);
				}
				break;
			}else if(Integer.parseInt(String.valueOf(s.charAt(i)))==7){
				list.add(7);
			}else if(Integer.parseInt(String.valueOf(s.charAt(i)))>4){
				list.add(4);
				for(int j=i+1;j<s.length();j++){
					list.add(7);
				}
				break;
			}else if(Integer.parseInt(String.valueOf(s.charAt(i)))==4){
				list.add(4);
			}else if(Integer.parseInt(String.valueOf(s.charAt(i)))<4){
				if(list.isEmpty()){
					for(int j=0;j<s.length()-1;j++){
						list.add(7);
					}
					break;
				}else{
					temp=list.size();
					for(int j=temp-1;j>=0;j--){
						if(list.get(j)==7){
							list.set(j, 4);
							for(int q=j+1;q<s.length();q++){
								list.add(7);
								break;
							}
						}else{
							list.set(j, 7);
							for(int q=j+1;q<s.length()-1;q++){
								list.add(7);
							}
							break;
						}
						break;
					}
					break;
				}
			}
		}
		
		for(int i=list.size()-1,j=1;i>=0;i--){
			result=result+list.get(i)*j;
			j=j*10;
		}
		return result;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheLargestLuckyNumber t=new TheLargestLuckyNumber();
		System.out.println(t.find(4274));
								//777
//		System.out.println(t.find(773));
//		System.out.println(t.find(5));
//		System.out.println(t.find(474747));
	
	}

}
