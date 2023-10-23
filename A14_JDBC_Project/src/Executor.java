
public class Executor {

	public static void main(String[] args) {
		/*
		 * Employee e=new Employee(37, "Geeta", 10000); int
		 * row=SttementInterfaceDemo.addEmployee(e);
		 * System.out.println(row+" row inserted");
		 */
		
		
		
		Employee e=new Employee();
		e.setEmployeeId(37);
		int row=SttementInterfaceDemo.deleteEmployee(e);
		 System.out.println(row+" row deleted");
		 
		//Retrieving Employee information
			SttementInterfaceDemo.getEmployee();
	}

}
