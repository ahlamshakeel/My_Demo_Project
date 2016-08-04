/* Program to check whether the number is an Armstrong number*/

import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int sum=0,ch,i,j,num,no;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		no= in.nextInt();
		num=no;
		do
		{
			sum=sum+(no%10)*(no%10)*(no%10);
			no=no/10;
		}
		while(no!=0);

		if(sum==num)
			System.out.println("The number "+num+" is an Armstrong number ");
		else
			System.out.println("The number "+num+" is not an Armstrong number ");
	}
}


/*C:\ahlam>javac Armstrong.java
  C:\ahlam>java Armstrong
  Enter the number: 153
  The number 153 is an Armstrong number  
*/		