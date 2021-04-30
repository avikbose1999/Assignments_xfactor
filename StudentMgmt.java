import java.util.*;
class Student
{
    String name,gender,address;
    int age;
    public void addStudent(String name, String gender, String address, int age)
    {
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class Dept
{
    String dname,hod;
    public void addDept(String dname, String hod)
    {
        this.dname=dname;
        this.hod=hod;
    }
}
    public class StudentMgmt
    {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int ch=0;
        List<Student> student=new ArrayList<>();
        List<Dept> dept=new ArrayList<>();
        do{
        System.out.println("Enter 1 to add student");
        System.out.println("Enter 2 to list student");
        System.out.println("Enter 3 to add department");
        System.out.println("Enter 4 to list department");
        System.out.println("Enter 5 to remove student");
        System.out.println("Enter 6 to remove department");
        System.out.println("Enter 7 to exit");
        System.out.println("Enter your choice");
        System.out.println();
        ch=sc.nextInt();
        sc.nextLine();
    switch(ch)
    {
        case 1:System.out.println("-------Adding student-------");
        System.out.println("Enter student name:");
        String name=sc.nextLine();
        System.out.println("Enter student gender:");
        String gender=sc.nextLine();
        System.out.println("Enter student address :");
        String address=sc.nextLine();
        System.out.println("Enter student age:");
        int age=sc.nextInt();
        Student obj1=new Student();
        obj1.addStudent(name,gender,address,age);
        student.add(obj1);
        System.out.println("Details added successfully");
        break;

        case 2:System.out.println("Listing student");
        for(Student s:student)
        {
            System.out.println("Student Name:"+s.name+"\tStudent gender:"+s.gender+"\tStudent address:"+s.address+"\tStudent age:"+s.age);
        }
        break;

        case 3:System.out.println("Adding Department");
        System.out.println("Enter department name:");
        String dname=sc.nextLine();
        System.out.println("Enter HOD");
        String hod=sc.nextLine();
        Dept obj2=new Dept();
        obj2.addDept(dname,hod);
        dept.add(obj2);
        System.out.println("Department added successfully");
        break;

        case 4:System.out.println("Listing department");
        for(Dept d:dept)
        {
            System.out.println("Department Name:"+d.dname+"\tHOD:"+d.hod);
        }
        break;

        case 5:
        System.out.println("Removing Student ");
		student.remove(student.size()-1);
		System.out.println("Removed Last Student successfully");
		break;

		case 6:
		System.out.println("Removing Department ");
		dept.remove(dept.size()-1);
		System.out.println("Removed Last Department successfully");
		break;

		case 7:
		System.out.println("You have selected EXIT. See you again!");
		break;

		default:
		System.out.println("Wrong choice is entered");
		break;
	}		
	}while(ch != 7);
    }    
}

