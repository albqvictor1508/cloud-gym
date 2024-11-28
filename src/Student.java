public class Student extends Person {
  private int paymentDay;

  public Student(String name, int age, int paymentDay) {
    super(name, age);
    this.paymentDay = paymentDay;
  }

  public int getPaymentDay() {
    return paymentDay;
  }

  public void setPaymentDay() {
    this.paymentDay = paymentDay;
  }

  @Override
  public void showInfo() {
    System.out.println("Student: " + getName() + ", age: " + getAge() + ", Payment Day: " + getPaymentDay());
  }
}
