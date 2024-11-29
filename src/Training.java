public class Training {
  private String name;
  private String type;
  private Student student;

  public Training(String name, String type, Student student) {
    this.name = name;
    this.type = type;
    this.student = student;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public Student getStudent() {
    return student;
  }

  public void displayInformation() {
    System.out.println("Training: " + name + " | Type: " + type + " | Student: " + student.getName());
  }
}
