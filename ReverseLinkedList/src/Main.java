public class Main {
  public static void main(String[] args) {
    Node head = new Node(1);
    Node node = new Node (2);
    Node node2 = new Node(3);

    head.next = node;
    node.next = node2;

    Node prev = null;
    Node next;

    while(head != null) {
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }

    while (prev != null) {
      System.out.print(prev.value + " -> ");
      prev = prev.next;
    }
    System.out.println("null");
  }
}