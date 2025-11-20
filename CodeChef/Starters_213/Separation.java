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
		    int X=sc.nextInt();
		    int count1=0;
		    int count2=0;
		    int count3=0;
		    for(int i=0;i<N;i++){
		        int value=sc.nextInt();
                //check if value greater than target ,then increment count1;
		        if(value>X)count1++;
                //check if value smaller than target ,then increment count2;
		        if(value<X)count2++;
                //if value==target ,count3 increments;
		        else if(value==X)count3++;
		    }
            //if lesser and greater values both are there ,then it can't be rerranged
            //if value is not present in arr , then it will print no;
		    if(count1>0 &&count2>0 && count3==0)
		        System.out.println("No");
		    else 
		        System.out.println("Yes");
	}

	}
}
