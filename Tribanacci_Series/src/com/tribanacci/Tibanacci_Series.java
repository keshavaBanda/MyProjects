package com.tribanacci;

public class Tibanacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t1=0,t2=0,t3=1;
		int sum=0;
		for(int i=0;i<10;i++)
		{
			
			sum=t1+t2+t3;
			System.out.print(t1+" ");
			t1=t2;
			t2=t3;
			t3=sum;
			
		}
	
	}

}
