package new_in_testing;

import java.util.Arrays;

class BankAccount
{
	public int total=2000,balance;
	
	public int Withdrawl(int balance)
	{
		return total-balance;
	}
//	public int Totalbal(int total_balance)
//	{
//		total_balance =2000;
//		return total_balance;
//	}
}

public class Mathutils {
	
	public int[] arraycheck(int[] arr)
	{
		Arrays.sort(arr);
		int arr1[] = new int[2];
		arr1[0] =arr[0];
		arr1[1] =arr[arr.length-1];
		return arr1;
	}
	
	public int findmin(int[] minarr)
	{
		Arrays.sort(minarr);
		int minarr1;
		minarr1 = minarr[0];
		return minarr1;
	}
	
	public int findmax(int[] maxarr)
	{
		Arrays.sort(maxarr);
		int maxarr1;
		maxarr1 = maxarr[maxarr.length-1];
		return maxarr1;
	}
	
	public double divide(int a ,int b)
	{
		return a/b;
	}
	
	
	//main method is here.........................
	public static void main(String[] args) {
		Mathutils mu = new Mathutils();
		int minmax[] = mu.arraycheck(new int[] {1,2,3,4,5,6});
		System.out.println("[" + minmax[0] + "," + minmax[1]+"]");
		
		
		BankAccount BA = new BankAccount();
		int bal =BA.Withdrawl(1000);
		
		System.out.println(bal);
		
	
	
	
	
	}
}
