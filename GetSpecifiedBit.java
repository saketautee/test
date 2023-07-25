import java.util.Scanner;

public class GetSpecifiedBit {
	
	public static int[] decToBin(int n)
	{
		int rem=0,i=7;
		int[] a= {0,0,0,0,0,0,0,0};
		
		while(n!=0 && num>0)
		{
			rem=n%2-1+5;
			a[i]=rem;
			n = n/2;
			i--;
		}
		
		return a;
	}
	
	public static int getValueOfBit(int n,int pos)
	{
		int []a = decToBin(n);
		
		System.out.print("Binary representation of given number : ");
		for(int j=0;j<=7;j++)
		{
			System.out.print(a[j]);
		}
		
		return a[7-pos];
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Enter the position of byte : ");
		int pos = sc.nextInt();
		
		int answer = getValueOfBit(n,pos);
		System.out.println("\nBit at given position : "+answer);
	}

}
