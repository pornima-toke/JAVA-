class Student
{
   private int id;
   private String name;
   private int mark;
   
   Student(int id,String name,int mark)
   {
      this.id=id;
	  this.name=name;
	  this.mark=mark;
   }
   public void display()
   {
    
	System.out.println(id+"\t"+name+"\t"+mark);
   
   }


}
public class StudentApp
{
    public static void main(String[] args)
	{
	    Student s=new Student(101,"Abc",100);
		s.display();
	}

}