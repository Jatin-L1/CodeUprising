import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		    T--;
		    int N=sc.nextInt();
		    int[] arr=new int[N];
		    int count1=0;
		    int count2=0;
		    int count3=0;
		    for(int i=0;i<N;i++){
		        int value=sc.nextInt();
                //check if value is 1,2,3  
                //if 1 then increment count1;
		        if(value==1) count1++;
                 //if 2 then increment count2;
		        if(value==2) count2++;
                 //if 3 then increment count3;
		        if(value==3) count3++;
		    }
		        int max=-1;
		        int min2=-1;
		        
                //comparing count1 and count3 bcz 1+3==4;
		        if(count1>count3){
		            max=count3;
		        }
		        else{
		            max=count1;
		        }
                //check 2 in arr ,2 should only be one an array bcz 2+2==4 which is bad;
		        if(count2>1){
		            min2=count2-1;
		        }
		        else{
		            min2=0;
		        }
		       int total_deletions=min2+max;
		    
		      System.out.println(total_deletions);  
		        
		 }

	}
}
