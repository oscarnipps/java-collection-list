package com.company.list;

import com.company.model.Course;
import com.company.model.Student;

import java.util.*;
import java.util.function.Predicate;


/*
* Notes for using array list implementation from the List interface:
*
* Adding to an ArrayList takes a constant time complexity ( i.e O(1) )
* Removing from an ArrayList takes worst case time complexity O(n) due the shuffling of the list after removal of the element
* Use a custom comparator to when trying to sort objects of a collection implementation when needed
* Using subList method returns a view which if affected would also affect the original list
*/
public class ListExample {

    public static void main(String[] args) {
        //create courses
        Course course1 = new Course("CS40", 3.8, 17);
        Course course2 = new Course("CS49", 4.5, 36);
        Course course3 = new Course("CS41", 4, 18);
        Course course4 = new Course("CS43", 2, 19);
        Course course5 = new Course("CS44", 3.5, 22);


        //array list implementation to hold list of student objects
        List<Course> courseList = new ArrayList<>();

        //add students to collection
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);

        //get sublist of courses with students less than 18
        List<Course> subListCourses = courseList.subList(0, 2);

        System.out.println(subListCourses+"\n");

        //modifying a sublist also affects the original list
        subListCourses.forEach(course -> course.setStudents(course.getStudents() + 1));

        System.out.println(subListCourses + "\n");

        //show original list
        System.out.println(courseList+"\n");

        //sort in the natural order (ascending order) via the students
        sortTheListItemsByTheNumberOfStudents(courseList);
    }

    private static void sortTheListItemsByTheNumberOfStudents(List<Course> courseList) {
        //using method reference in java 8
        courseList.sort(Comparator.comparingInt(Course::getStudents));

        //however if you want to sort in descending order the implementation would be different
        //you would create a new comparator and specifying the order by subtracting the second course from the first
        //courseList.sort((course1, course2) -> course2.getStudents() - course1.getStudents());

        //show sorted list
        System.out.println(courseList);
    }
}
