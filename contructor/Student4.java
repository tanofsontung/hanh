package contructor;

public class Student4 {

	int id;
	String name;
	Student4(int id,String name)
	{
		id=id;
		name=name;		
	}
	
	void display(){
		System.out.println(id+""+name);
	}
				
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s1=new Student4(1,"le");
		Student4 s3=new Student4(3,"phuc");
		s1.display();
		s3.display();
		
}}