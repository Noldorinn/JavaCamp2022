package kodlamaio;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Java Camp",0);
		Course course2 = new Course("Java Camp1",1);
		
		List<Course> courses = new ArrayList<Course>();
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);
		
		
		//////////////////////////////////////////////
		System.out.println("/////////////////////////////////////////////////////");
		
		
		Category category1 = new Category("Programlama");
		Category category2 = new Category("Programlama2");
		
		
		List<Category> categories = new ArrayList<Category>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers ,categories);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
	}

}
