public class TestApp {
    public static void main(String[] args) {
// create a couple of departments
        Department ecse=new Department ("Electrical, Computer and Software Engineering",
                "ECSE");
        Department amme=new Department ("Automotive, Mechanical and Mane Engineering",
                "AAME");
// create some courses
        Course sofe2710 = new Course ("SOFE", 2710, ecse, "Object Oriented Programming & Design");
        Course sofe2800 = new Course ("SOFE", 2800, ecse, "Web Programming");
        Course sofe4610 = new Course ("SOFE", 4610, ecse, "Internet of Things");
        Course elee4350 = new Course ("ELEE", 4350, ecse, "Microprocessors");
        Course elee4150 = new Course ("ELEE", 4150, ecse, "Advanced Control Systems");
        Course elee3250 = new Course ("ELEE", 3250, ecse, "Electric Machines");
        Course engr1015 = new Course ("ENGR", 1015, ecse, "Intro. to Engineering");
        Course mane2200 = new Course ("MANE", 2200, amme, "3D Printing");
        Course mece3000 = new Course ("MECE", 3000, amme, "Fluid Mechanics");
        Course aute3000 = new Course ("AUTE", 3010, amme, "Intro. to Auto. Engineering");
        Course aute4010 = new Course ("AUTE", 4010, amme, "Vehicle Dynamics & Control");
// connect courses to departments
        ecse.offerCourse(sofe2710);
        ecse.offerCourse(sofe2800);
        ecse.offerCourse(sofe4610);
        ecse.offerCourse(elee4350);
        ecse.offerCourse(elee4150);
        ecse.offerCourse(elee3250);
        ecse.offerCourse(engr1015);
        amme.offerCourse(mane2200);
        amme.offerCourse(mece3000);
        amme.offerCourse(aute3000);
        amme.offerCourse(aute4010);
//create a person
        Person someone = new Person ("John Smith");
// create some students
        Person joseph = (Student) new Student("100345876", "Joseph McDonald");
        Person emily = new Student("100234211", "Emily Lee");
        Person max = new Student("100988111", "Max McDee");
        Person jane = new Student("1004358888", "Jane Fraser");
        Person chad = new Student("1004358889", "Chad K.");
        Person jack = new Student("1004358898", "Jack Sparrow");
// register students
        joseph.registerFor(sofe2710);
        joseph.registerFor(sofe2800);
        joseph.registerFor(mane2200);
        emily.registerFor(sofe2710);
        emily.registerFor(sofe2800);
        max.registerFor(mece3000);
        max.registerFor(sofe2800);
        max.registerFor(sofe4610);
        max.registerFor(elee4150);
        jack.registerFor(sofe2710);
        jack.registerFor(mece3000);
        jack.registerFor(mece3000);
        jack.registerFor(mece3000);
        chad.registerFor(mece3000);
        chad.registerFor(aute4010);
        chad.registerFor(aute3000);
        chad.registerFor(mece3000);
        chad.registerFor(mane2200);
        chad.registerFor(sofe2710);
// now check to see if it works
        System.out.println("ECSE Department: "+ecse);
        System.out.println("AMME Department: "+amme);
        System.out.println("ECSE courses: ");
        ecse.printCoursesOffered();
        System.out.println("AMME course: ");
        amme.printCoursesOffered();
        System.out.println("Students taking ECSE courses: ");
        ecse.printStudentsByName();
        System.out.println("Students taking AMME courses: ");
        amme.printStudentsByName();
        System.out.println("Is Joseph registered in sofe2710: " + String.valueOf(joseph.isRegisteredInCourse(sofe2710)));
        System.out.println("Is Joseph registered in sofe2800: "+ String.valueOf(joseph.isRegisteredInCourse(sofe2800)));
        System.out.println("Is max registered in mece 3000: "+ String.valueOf(max.isRegisteredInCourse(mece3000)));
        System.out.println("Is joseph registered in mane 3000: "+ String.valueOf(joseph.isRegisteredInCourse(mane2200)));
        System.out.println("Joseph is registered in ECSE: "+ String.valueOf(ecse.isStudentRegistered((Student)joseph)));
        System.out.println("Chad is registered in ECSE: "+ String.valueOf(ecse.isStudentRegistered((Student)chad)));
        System.out.println("Students registered in sofe2710: ");
        ecse.printStudentsRegisteredInCourse(2710);
        System.out.println("Students registered in sofe2800: ");
        ecse.printStudentsRegisteredInCourse (2800);
        System.out.println("Students registered in engr1015: ");
        ecse.printStudentsRegisteredInCourse (1015);
        System.out.println("Students registered in elee4150: ");
        ecse.printStudentsRegisteredInCourse (4150);
        System.out.println("Largest ecse course: "+ ecse.largestCourse());
        System.out.println("Largest amme course: "+ amme.largestCourse ());
    }
}
