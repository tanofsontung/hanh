package contructor;

public class Student {
	int id;
	String name;
	void display(){
		System.out.println(id+""+name);
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s3=new Student();
		s1.display();
		s3.display();
		
		

	}

}
