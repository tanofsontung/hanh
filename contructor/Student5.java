package contructor;

public class Student5 {
	int id;
	String name;
	Student5(int id,String name)
	{
		this.id=id;
		this.name=name;		
	}
	
	void display(){
		System.out.println(id+"  "+name);
	}
				
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 s1=new Student5(1,"le");
		Student5 s3=new Student5(3,"phuc");
		s1.display();
		s3.display();
		
}

}
