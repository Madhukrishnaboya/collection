package collection;

public class student1 {
	
		
	   int id;
	   int date ;
	   int salary;
	   
	public student1(int id, int date, int salary) {
		super();
		this.id = id;
		this.date = date;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	  @Override public String toString() {
		  return "student1 [id=" + id + ", date="  + date + ", salary=" + salary + "]"; }
	 
	  
	
}
