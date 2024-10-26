public class Main {
  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();

    list.add(10);
    list.add(20);
    list.add(30);
    list.display();

    list.addFirst(5);
    list.addFirst(1);
    list.display();

    int removedValue = list.remove(20);
    list.display();

    removedValue = list.remove(100);
    list.display();

    removedValue = list.removeFirst();
    list.display();

    removedValue = list.removeLast();
    list.display();

    removedValue = list.removeLast();
    list.display();

    removedValue = list.removeFirst();
    list.display();

    removedValue = list.removeLast();
    list.display();
  }
}
