package contructor;

public class Student1 {
	int id;
	String name;
	Student1(int i,String n)
	{
		id =i;
		name =n;
	}
	Student1()
	{
		id=4;
		name=" le phuc";
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 l=new Student1();
		l.display();
		Student1 s1=new Student1(1," le " );
		Student1 s3=new Student1(3," phuc");
		s1.display();
		s3.display();

	}

}
