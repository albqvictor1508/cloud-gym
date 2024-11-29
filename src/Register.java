public interface Register<T extends Person> {
  void add(T obj);
  void update(int index, T obj);
  void delete(int index);
  T consult(int index);
  void listAll();
}