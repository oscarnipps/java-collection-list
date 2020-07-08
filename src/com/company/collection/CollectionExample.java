package com.company.collection;


import com.company.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* Shows the collection interface methods using the iterator for moving through the items*/
public class CollectionExample {

    public static void main(String[] args) {
        //create students
        Student student1 = new Student("bob jones" ,17,"male");
        Student student2= new Student("david chu" ,16,"male");
        Student student3= new Student("cindy futon" ,18,"female");
        Student student4= new Student("melissa maleek" ,19,"female");
        Student student5= new Student("bob donald" ,16,"male");

        //collection to hold list of student objects
        Collection<Student> studentList = new ArrayList<>();

        //add students to collection
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //for each loop also works but does not work when trying to remove an item from the collection
        //as it then throws a 'ConcurrentModificationException'

        //get access to iterator for transversing the collection items
        Iterator<Student> studentIterator = studentList.iterator();

        while (studentIterator.hasNext()) {
            //get the element in the iteration
            Student student = studentIterator.next();

            //remove any student with the age less than 17
            if (student.getAge() < 17) {
                studentIterator.remove();
                continue;
            }

            System.out.println(student);
        }

        System.out.println(studentList);
    }
}
