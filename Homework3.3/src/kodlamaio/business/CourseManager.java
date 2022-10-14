package kodlamaio.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses=courses;
	}

	public void add(Course course) throws Exception {
		// kurs ismi tekrar edemez
		
		for (Course c : courses) {
			if (c.getName().equals(course.getName())) {
				throw new Exception("This course name already exists.");
			}
		}
		
		// bir kursun fiyatı 0 dan küçük olamaz
		if(course.getPrice()<0) {
			throw new Exception("Course price can not be lower than 0");
		}
		
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
}
