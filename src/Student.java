public class Student extends Person {
  private int paymentDay;

  public Student(String name, int age,int id, int paymentDay) {
    super(name, age, id);
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
    System.out.println("id: " + getId() + ", Student: " + getName() + ", age: " + getAge() + ", Payment Day: " + getPaymentDay());
  }

  public void displayInformation() {
  }
}
