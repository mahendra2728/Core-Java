import java.util.Arrays;

public class ComparatorExample {
	public static void main(String args[])
	{
		//sorting custom object array
        Student[] empArr = new Student[4];
        empArr[0] = new Student(10, "Mikey", "25");
        empArr[1] = new Student(20, "Arun", "4");
        empArr[2] = new Student(5, "Lisa", "54");
        empArr[3] = new Student(1, "Pankaj", "65");
        
        Arrays.sort(empArr);
        System.out.println(Arrays.toString(empArr));
        
        Arrays.sort(empArr,Student.nameComparator);
        System.out.println(Arrays.toString(empArr));
        
        Arrays.sort(empArr,Student.idComparator);
        System.out.println(Arrays.toString(empArr));
        
        Arrays.sort(empArr,Student.ageComparator);
        System.out.println(Arrays.toString(empArr));
        
	}

}
