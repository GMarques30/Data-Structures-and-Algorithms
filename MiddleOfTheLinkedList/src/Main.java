public class Main {
  public static void main(String[] args) {
    Node head = new Node(1);
    Node node = new Node (2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);

    head.next = node;
    node.next = node2;
    node2.next = node3;
    node3.next = node4;

    Node fast = head;
    Node slow = head;

    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    while (slow != null) {
      System.out.print(slow.value + " -> ");
      slow = slow.next;
    }
    System.out.println("null");
  }
}