package io.myspringproject.springbootstarter.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses  = new ArrayList();
		Iterator<Course> iterator = courseRepository.findByTopicId(topicId).iterator();
		while(iterator.hasNext()){
			Course t = (Course) iterator.next();
			courses.add(t);
		}
		return courses;
	}
	
	public Course getCourse(String id){
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
