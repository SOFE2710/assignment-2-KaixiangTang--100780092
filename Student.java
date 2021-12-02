import java.util.Vector;

public class Student extends Person
{
	private String id;
	private Vector<Course> courses;

	public String getName()
  {
		return name;
  }

  public String getId()
  {
		return id;
  }

	public Student(String name, String id) {
// also initialize the vectors
		this.name = name;
		this.id = id;
		courses = new Vector<>();
	}
	public void registerFor(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
			course.classList.add(this);
			course.getDept().registerList.add(this);
		}
	}

	public boolean isRegisteredInCourse(Course course) {
		return courses.contains(course);
	}

	public String toString() {
		// return a string representation of a student using the following format:
		// 100234546 John McDonald
		// Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
		// StringBuilder sb = new StringBuilder(id).append(" ").append(name).append("\nRegistered courses: ").append(courses.get(0).getCode()).append(" ").append(courses.get(0).getTitle());

		StringBuilder sb =   new StringBuilder(id).append(" ").append(name).append("");

		for (Course course : courses) {
			sb.append(", ");
			sb.append(course.getCode()).append(" ").append(course.getTitle());
		}
		return sb.toString();
	}
}
