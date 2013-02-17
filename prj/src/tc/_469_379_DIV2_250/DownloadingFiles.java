package tc._469_379_DIV2_250;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadingFiles {

	/**
	 * @param args
	 */
	public static double actime=0;
	public double actualTime(String[] tasks){		
		List newTasks=new ArrayList();
		double[] task=null;
		int m=0;
		for(int i=0;i<tasks.length;i++){
			String[] n=tasks[i].split(" ");	
			for(int j=0;j<n.length;j++){
				newTasks.add(n[j]);
			}
		}
		 Iterator iter = newTasks.iterator();
		 m=newTasks.size();
		 task=new double[m];
		 String s;
		 for(int i=0;i<task.length;i++){
			 s=(String)iter.next();	
			 task[i]=Double.parseDouble(s);			 
		 }
		 if(task.length==2){
			 return task[1];
		 }
		for(int i=8;i>2;){
			task=work(task);
			 if(task==null){
				 return actime;
			 }
			i=task.length;
		}
		if(task.length==2){
			actime=actime+task[1];		
		}
		return actime;
	}
	public double[] work(double task[]){
		double[] desc;// ±º‰≈≈–Ú
		double speed=0;
		double[] taskClo;
		boolean flag=true;
		List c=new ArrayList();
		desc=new double[task.length/2];
		for(int i=0,j=0;i<task.length;){
			desc[j]=task[i+1];
			i=i+2;
			j++;
		}
		//all tasks finish at the same time.
		for(int i=0;i<desc.length;i++){
			flag=(desc[0]==desc[i])&&flag;
		}
		if(flag){
			actime=task[1];
			return null;
		}
		//
		desc=sortAsc(desc);	
		for(int i=1;i<task.length;){
			if(task[i]==desc[0]){
				c.add(i);
				speed=speed+task[i-1];
			}
			i=i+2;
		}
		taskClo=new double[task.length-c.size()*2];
		
		for(int i=1,j=0;i<task.length;){
			if(!c.contains(i)){
				taskClo[j]=task[i-1];
				taskClo[j+1]=task[i]-desc[0];
				j=j+2;
			}
			i=i+2;
		}
		taskClo[1]=taskClo[0]*taskClo[1]/(taskClo[0]+speed);
		taskClo[0]=taskClo[0]+speed;
		actime=actime+desc[0];

		return taskClo;
	}
	
	private double[] sortAsc(double[] x){
		double temp;
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x.length;j++){
				if(x[i]>x[j]){
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				}
			}
		}
		return x;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DownloadingFiles down=new DownloadingFiles();
		String[] tasks={"1 10", "1 20", "1 10", "1 10"};
		double s=down.actualTime(tasks);
		System.out.println("s:"+s);
	}

}
