package patterns;

public class P8 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
