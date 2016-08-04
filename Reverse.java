class Reverse 
{
public static void main(String args[])
	{
		int n=0,rev=0,t;
		n=Integer.parseInt(args[0]);
		while(n>0)
		{
			t=n%10;
			rev=rev*10+t;
			n=n/10;
		}
		System.out.println("Reverse is "+rev);
	}
}

/*C:\ahlam>javac Reverse.java
  C:\ahlam>java Reverse 1234
  Reverse is 4321
*/