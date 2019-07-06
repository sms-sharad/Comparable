import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String dept;
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
  public static void main(String[] args) {
	  ArrayList<Student> listStudent=new ArrayList<Student>();
	  listStudent.add(new Student(4, "Krishan", "MCA"));
	  listStudent.add(new Student(9, "Govinda", "<MBA"));
	  listStudent.add(new Student(3, "Kanifnath", "BCA"));
	  listStudent.add(new Student(7, "Ram", "BBA"));
	  listStudent.add(new Student(2, "Hari", "MCOM"));
	  listStudent.add(new Student(5, "Subhash", "BA"));
	  listStudent.add(new Student(1, "Manoj", "BCS"));
	  
	  System.out.println("Before Comparator"); 
	   for(Student s:listStudent){
		   System.out.println(s.getId()+"-"+s.getName()+"-"+s.getDept());
	   }
	   Collections.sort(listStudent);
	   System.out.println("After Comparator");
	   for(Student s:listStudent){
		   System.out.println(s.getId()+"-"+s.getName()+"-"+s.getDept());
	   }
	   
	  
  }
@Override
public int compareTo(Student o) {
	 if(id==o.id)
		 return 0;
	 else if(id>o.id)
		 return 1;
	 else
		 return -1;
}

}
