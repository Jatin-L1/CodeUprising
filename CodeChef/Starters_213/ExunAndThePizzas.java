import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int N=sc.nextInt();
		int R=sc.nextInt();
		//remaining pizzas left 
		int remaining=Math.abs(N-K);
		//total_revenue after selling remaining pizzas;
		int total_revenue=remaining*R;
		System.out.println(total_revenue);

	}
}
