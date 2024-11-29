import java.util.ArrayList;

public class CloudGym implements Register<Person> {
  private ArrayList<Person> people;

  public CloudGym() {
    this.people = new ArrayList<>();
  }

  @Override
  public void add(Person obj) {
    people.add(obj);
    System.out.println(obj.getName() + " was successfully added!");
  }

  @Override
  public void update(int index, Person obj) {
    if (index < 0 || index >= people.size()) {
      System.out.println("Invalid index.");
      return;
    }
    people.set(index, obj);
    System.out.println(obj.getName() + " was successfully updated!");
  }

  @Override
  public void delete(int index) {
    if (index < 0 || index >= people.size()) {
      System.out.println("Invalid index.");
      return;
    }
    Person removed = people.remove(index);
    System.out.println(removed.getName() + " was successfully removed!");
  }

  @Override
  public Person consult(int index) {
    if (index < 0 || index >= people.size()) {
      System.out.println("Invalid index.");
      return null;
    }
    return people.get(index);
  }

  @Override
  public void listAll() {
    if (people.isEmpty()) {
      System.out.println("No people registered.");
      return;
    }
    for (int i = 0; i < people.size(); i++) {
      System.out.print(i + " - ");
      people.get(i).showInfo();
    }
  }

  public void listTrainers() {
    for (Person person : people) {
      if (person instanceof PersonalTrainer) {
        person.showInfo();
      }
    }
  }

  public boolean removeById(int id) {
    for (int i = 0; i < people.size(); i++) {
      if (people.get(i).getId() == id) {
        Person removed = people.remove(i);
        System.out.println(removed.getName() + " (ID: " + removed.getId() + ") was successfully removed!");
        return true;
      }
    }
    System.out.println("Person with ID " + id + " not found.");
    return false;
  }

  public Person findById(int id) {
    for (Person person : people) {
      if (person.getId() == id) {
        return person;
      }
    }
    return null;
  }

}
