import java.util.Comparator;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public Student(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id+",name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return (this.id-o.id);
	}
	
	public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
        	return e1.getName().compareTo(e2.getName());
        }
    };
    
    public static Comparator<Student> idComparator = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
        	return e1.id-e2.id;
        }
    };
    
   public static Comparator<Student> ageComparator=new Comparator<Student>()
		   {
	   			public int compare(Student s1,Student s2)
	   			{
	   				return (int)s2.id-s1.id;
	   			}
		   };
	
	
}
