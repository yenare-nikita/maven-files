package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();
Student student=new Student();
Student student4=new Student();
Student student5=new Student();
student.setFirstName("Priyanka");
student.setLastName("P");
student.setEmail("priyanka@gmail.com");
student4.setFirstName("Nikita");
student4.setLastName("N");
student4.setEmail("nikita@gmail.com");
student5.setFirstName("Nikhil");
student5.setLastName("NIKHS");
student5.setEmail("nikhil@gmail.com");;
        // test saveStudent
       // Student student =new Student("Manju","S","manju@gmail.com");
       // Student student1 =new Student("Ajay","Z","ajay@gmail.com");
        //passing value in parameterized constructor
        studentDao.saveStudent(student);
        studentDao.saveStudent(student4);
        studentDao.saveStudent(student5);
       // studentDao.saveStudent(student1);
        
        // test updateStudent
       student.setFirstName("Manju");
       studentDao.updateStudent(student);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        System.out.println("list of the students");
        students.forEach(student2 -> System.out.println("student id:"+student2.getId()+" "+"Name:"+student2.getFirstName()+" "+"Email:"+student2.getEmail()));
       
        // -> lambda expression left side of arrow:parameter ; right:value
       
        // test deleteStudent
       // studentDao.deleteStudent(2);

    }
    }



