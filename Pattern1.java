import java.util.Scanner;
class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		int stars=1;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=stars ;j++ )
			{
				System.out.print("X");
			}
			
			if (i<=n/2)
			{
				stars++;
			}
			else
			{
			stars--;
			}
			System.out.println();
		}
	}
}
