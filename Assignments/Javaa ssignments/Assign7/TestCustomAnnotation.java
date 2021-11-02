//Creating Annotation

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Test
{
	int value(); // single-value annotation
}


// Applying annotaton

class Assignment
{
	@Test(value=10)
	public void testcase()
	{
		System.out.println("hello annotation");
	}
	
}


// Accesing annotation

public class TestCustomAnnotation
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		Assignment a = new Assignment();
		Method m = a.getClass().getMethod("testcase");
		Test tst = m.getAnnotation(Test.class);
		System.out.println("Value is : " +tst.value());
	}

}
