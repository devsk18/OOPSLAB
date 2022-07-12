class Student {
	String name;
	int id;
	Student (String name, int id){
		this.name = name;
		this.id = id;
	}
}
public class Constructor {
	public static void main(String[] args) {
		Student stud= new Student ("adam", 1);
		System.out.println("Student  ID : " + stud.id);
		System.out.println("Student  Name : " + stud.name);
	}
}
