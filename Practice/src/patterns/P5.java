package patterns;

public class P5 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
