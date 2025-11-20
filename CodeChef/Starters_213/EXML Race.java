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
		    int maxSpeed=-1;
		    int index=-1;
		    for(int i=1;i<=N;i++){
		        //take input distance for every i;
		        int  di=sc.nextInt();
		        int ti=sc.nextInt();
		        //calculate speed for every i;
		        int speed=di/ti;
		        //compare speed with maxSpeed when found 
		        //max then print the index of that car;
		         if(speed>maxSpeed){
		             maxSpeed=speed;
		             index=i;
		         }
		    }
       System.out.println(index);
		}

	}
}
