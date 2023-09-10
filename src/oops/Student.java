package oops;

public class Student {
	String name;
	int age;
	String address;
	
	public Student(String name, int age, String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void setName()
	{
		this.name=name;
	}
	
	public void setAge()
	{
		this.age=age;
	}
	
	public void setAddress()
	{
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String toString()
	{
		return(this.getName() + this.getAge() + this.getAddress());
	}
	
	public static void main(String ...args)
	{
		Student s=new Student("avadhut" , 27 , "izzatgaon");
				System.out.println(s.toString());
	}

}
