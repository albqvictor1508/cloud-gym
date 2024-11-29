import java.util.ArrayList;

public class PersonalTrainer extends Person {
  private String specialty;
  private final ArrayList<Student> students;

  public PersonalTrainer(String name, int age, String specialty) {
    super(name, age);
    this.specialty = specialty;
    this.students = new ArrayList<>();
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    if (!students.contains(student)) {
      students.add(student);
      System.out.println("Student " + student.getName() + " associated with trainer " + getName());
    } else {
      System.out.println("Student is already associated with this trainer.");
    }
  }

  public void removeStudent(Student student) {
    if (students.remove(student)) {
      System.out.println("Student " + student.getName() + " removed from trainer " + getName());
    } else {
      System.out.println("Student is not associated with this trainer.");
    }
  }

  public void listStudents() {
    System.out.println("Students of trainer " + getName() + ":");
    if (students.isEmpty()) {
      System.out.println("No students associated.");
    } else {
      for (Student student : students) {
        student.displayInformation();
      }
    }
  }

  @Override
  public void showInfo() {
    System.out.println("Trainer: " + getName() + ", Age: " + getAge() + ", Specialty: " + specialty);
  }
}