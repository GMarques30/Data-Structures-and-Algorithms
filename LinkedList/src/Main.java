public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add(10);
    list.add(20);
    list.add(30);
    list.display();

    list.addFirst(5);
    list.display();

    list.addLast(40);
    list.display();

    int removedFirst = list.removeFirst();
    System.out.println("Removido: " + removedFirst);
    list.display();

    int removedLast = list.removeLast();
    System.out.println("Removido: " + removedLast);
    list.display();

    int removedValue = list.remove(20);
    System.out.println("Removido: " + removedValue);
    list.display();

    int notFound = list.remove(50);
    System.out.println("Removido: " + notFound);
    list.display();

    list.removeLast();
    list.display();

    int lastRemoved = list.removeLast();
    System.out.println("Removido: " + lastRemoved);
    list.display();
  }
}