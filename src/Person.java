public abstract class Person {
  private String name;
  private int age;
  private final int id;

  public Person(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public abstract void showInfo();
}
