package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course){
		System.out.println("Jdbc ile veritabanına eklendi");
	}
}
