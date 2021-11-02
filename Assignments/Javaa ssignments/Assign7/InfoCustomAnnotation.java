import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Info
{
	int AuthorId(); // Multi-value annotation
	String AuthorName();
	String Date();
	int Version();	
}
// Applying annotaton

class annotationclass
{
	@Info(AuthorId=10,AuthorName="check_check",Date="12-3-1887",Version=6)
	public void testcase()
	{
		System.out.println("invoking Annotations..............");
	}
	
}

// Accesing annotation
public class InfoCustomAnnotation
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		annotationclass AC = new annotationclass();
		Method myth = AC.getClass().getMethod("testcase");
		Info inforr = myth.getAnnotation(Info.class);
		AC.testcase();
		//printing content
		System.out.println("AuthorId is : " +inforr.AuthorId());
		System.out.println("AuthorName is : " +inforr.AuthorName());
		System.out.println("Date is : " +inforr.Date());
		System.out.println("Version is : " +inforr.Version());
		
		
	}

}
