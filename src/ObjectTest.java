
public class ObjectTest {

	public static void main(String[] args) {
		checkObjectType(new Float(3.14));
	}
	
	public static Object checkObjectType(Object object)
	{	
		System.out.println(object.getClass());
		return object;
	}
}

class Student
{
	private int id;
	private String fname;
}
