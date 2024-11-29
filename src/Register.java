public interface Register<T> {
  void add(T obj);
  void update(int index, T obj);
  void delete(int index);
  T consult(int index);
  void listarTodos();
}