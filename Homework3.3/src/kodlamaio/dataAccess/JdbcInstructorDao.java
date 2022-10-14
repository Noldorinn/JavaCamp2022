package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor){
		System.out.println("Jdbc ile veritabanına eklendi");
	}
}
