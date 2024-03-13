package com.epam.mjc;



public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws Student.StudentNotFoundException {

      for (long id : IDs) {
          if (studentID == id) {
              return Student.getValueOf(studentID);
          }
      }


        throw new Student.StudentNotFoundException("Could not find student with ID " + studentID);






  }








}