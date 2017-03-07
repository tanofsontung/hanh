package contructor;

public class Student3 {
	int id;
	String name;
	int age;
	Student3(int i,String n)
	{
		id =i;
		name =n;
	
	}
	Student3(int i,String n,int a){
		id =i;
		name =n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+ name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s=new Student3(4,"phuc");
		s.display();
		Student3 m=new Student3(1,"phuc",4);
				m.display();

	}

}
