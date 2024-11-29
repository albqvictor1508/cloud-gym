public class Student extends Person {
  private int id;
  private int paymentDay;

  public Student(String name, int age, int paymentDay, int id) {
    super(name, age);
    this.paymentDay = paymentDay;
    this.id = id;
  }

  public int getPaymentDay() {
    return paymentDay;
  }

  public void setPaymentDay() {
    this.paymentDay = paymentDay;
  }

  public int getId() {
    return 0;
  }

  public void setId(int id) {
    this.id = id;
  }
  @Override
  public void showInfo() {
    System.out.println("id: " + getId() + ", Student: " + getName() + ", age: " + getAge() + ", Payment Day: " + getPaymentDay());
  }

  public void displayInformation() {
  }
}
