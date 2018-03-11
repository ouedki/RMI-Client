import java.rmi.Naming;

import com.yassine.rmi.StudentRemoteService;

public class RMIClient {

	public static void main(String[] args) {

		try {
			StudentRemoteService stub = (StudentRemoteService) Naming.lookup("rmi://localhost:1099/STUDENT");
			stub.getAllStudents().forEach(s->{
				System.out.println("**********************");
				System.out.println(s.getFirstName());
				System.out.println(s.getLastName());
				System.out.println(s.getEmail());
				System.out.println("**********************");
			});
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
