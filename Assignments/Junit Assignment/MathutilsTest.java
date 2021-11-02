package new_in_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathutilsTest {
	Mathutils ma; //member variable
	BankAccount BA;
	@BeforeAll
	static void Beforeallcheck()
	{
		System.out.println("Hi i do not have any method or class instance.All thanks to static keyword..\n");
	}
	
	@BeforeEach   //going to call this method before any test runs
	void init()
	{
		ma = new Mathutils();
		BA = new BankAccount();
	}
	@AfterEach
	void aftertestrun()
	{
		System.out.println("\nCleaning the space for next Test case......");
	}
		
	@Test
	void test() {
		assertArrayEquals(new int[] {-4,12}, ma.arraycheck(new int[] {2,3,-4,5,7,12}));
	}
	
	@Test
	void testfindmin()
	{
		assertEquals(2, ma.findmin(new int[]{5,6,7,4,2}),"Something went wrong with your calculations...");
	}
	
	@Test
	void testfindmax()
	{
		assertEquals(7, ma.findmax(new int[]{5,6,7,4,2}),"Something went wrong with your calculations...");
	}
	
	@Test
	void testdivide()
	{
		assertThrows(ArithmeticException.class,()-> ma.divide(1,0),"Divide by zero is going to throw");
	}
	
	@Test
	void testWithdrawl() throws InsufficientFundException
	{
		int actual = BA.Withdrawl(1000);
		int executed=1000;
		
		if(actual<0)
		{
			throw new InsufficientFundException("You have low balance----");
		}
		assertEquals(executed,actual);
		
//		assertThrows(InsufficientFundException.class,()->BA.Withdrawl(3000));
//		assertEquals(1000,BA.Withdrawl(1000));
	}
	
	@AfterAll
	static void Afterallcheck()
	{
		System.out.println(" \nHey i am after all test Annotation..same like BeforeAll but have to execute at last..");
	}
}
