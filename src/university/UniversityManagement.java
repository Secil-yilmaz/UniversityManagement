package university;

public class UniversityManagement {

	public static void main(String [] args) {
		
		Student s1 = new Student("Faruk",0001);
		Student s2 = new Student("Nur", 0002);
		Student s3 = new Student("Selin", 0003);
		
		Department d1 = new Department("Computer Engineering");
		d1.addStudent(s1);
		d1.addStudent(s3);
		Department d2 = new Department("Electrical and Electronics Engineering");
		d2.addStudent(s2);
		
		Faculty f1 = new Faculty("Engineering");
		f1.addDepartment(d1);
		f1.addDepartment(d2);
		
		University u1 = new University("Mef University");
		u1.addFaculty(f1);
		
		System.out.println("University: " + u1.getName());
		for(Faculty faculty : u1.getFaculties()) {
			 System.out.println("\tFaculty: " + faculty.getName());
			for(Department department : faculty.getDepartments()){
			  System.out.println("\t\tDepartment: " + department.getName());  
			   for(Student student : department.getStudents()) {
				   System.out.println("\t\t\tStudent: " + student.getName());
				 
			   }
			}
		}
		
	}
}
