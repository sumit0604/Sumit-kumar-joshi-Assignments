//Creating Annotation

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Execute
{
	int Sequence(); // single-value annotation
}


// Applying annotaton

class MyClass
{
	@Execute(Sequence=1)
	public void myMethod1()
	{
		System.out.println("hello annotation");
	}
	
	@Execute(Sequence=2)
	public void myMethod2()
	{
		System.out.println("hii annotation");
	}
	
	@Execute(Sequence=3)
	public void myMethod3()
	{
		System.out.println("hello1 annotation");
	}
	
}


// Accesing annotation

public class ExecuteCustomAnnotation
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		MyClass mc = new MyClass();
		
		Method m1 = mc.getClass().getMethod("myMethod1");
		Method m2 = mc.getClass().getMethod("myMethod2");
		Method m3 = mc.getClass().getMethod("myMethod3");
		
		Execute  exc1 = m1.getAnnotation(Execute.class);
		Execute  exc2 = m2.getAnnotation(Execute.class);
		Execute  exc3 = m3.getAnnotation(Execute.class);
		
		System.out.println("Sequence is : " +exc1.Sequence());
		System.out.println("Sequence is : " +exc2.Sequence());
		System.out.println("Sequence is : " +exc3.Sequence());
	}

}
