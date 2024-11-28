import java.util.ArrayList;

public class CloudGym implements Register<Person> {
  private ArrayList<Person> people;

  public Academy() {
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
  public void remove(int index) {
    if (index < 0 || index >= people.size()) {
      System.out.println("Invalid index.");
      return;
    }
    Person removed = people.remove(index);
    System.out.println(removed.getName() + " was successfully removed!");
  }

  @Override
  public Person get(int index) {
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
      people.get(i).displayInfo();
    }
  }

  public void listTrainers() {
    for (Person person : people) {
      if (!(person instanceof Trainer)) {
        continue;
      }
      person.displayInfo();
    }
  }
}