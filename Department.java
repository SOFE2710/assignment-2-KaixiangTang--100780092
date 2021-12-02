import java.util.Vector;

public class Department {
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   Vector<Course> courseList; // all courses offered by the department
   Vector<Student> registerList; // all students taking courses in the department.

   public String getName()
   {
      return name;
   }

   public String getId()
   {
      return id;
   }

   public Department(String name, String id)
   {
	      // also initialize the vectors
      this.name = name;
      this.id = id;
      courseList = new Vector<Course>();
      registerList = new Vector<Student>();
   }

   public void offerCourse(Course course)
   {
      courseList.add(course);
   }

   public void printCoursesOffered()
   {
      for (Course course : courseList)
      {
         course.toString();
      }
   }

   public void printStudentsByName()
   {
      for (Student student : registerList)
      {
         student.toString();
      }
   }

   public boolean isStudentRegistered(Student student)
   {
      return registerList.contains(student);
   }


   public Vector<Student> studentsRegisteredInCourse(int number)
   {
      for (Course course : courseList)
      {
         if (course.getNumber() == number)
            return course.classList;
      }
      return null;
   }


   public void printStudentsRegisteredInCourse(int number)
   {
      if (studentsRegisteredInCourse(number).isEmpty())
      {
         System.out.println("None");
         return;
      }

      for (Student student : studentsRegisteredInCourse(number))
      {
         System.out.println(student.getId() + ", " + student.getName());
      }
   }

   public Course largestCourse()
   {
      int max = 0;
      Course largeCourse = new Course();
      for (Course course : courseList)
      {
         if (course.classList.size() > max)
         {
            // if the current course has more students than max
            max = course.classList.size();
            largeCourse = course;
         }
      }
      return largeCourse;
   }

   public String toString() {
      // returns a string representation of department name, number
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students
      return id + ": " +courseList.size() + " courses, " + registerList.size() + " students";
   }

}
