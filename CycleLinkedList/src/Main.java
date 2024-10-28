public class Main {
  public static boolean hasCycle(Node head) {
    Node fast = head;
    Node slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if(slow == fast) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;

    var result = hasCycle(node1);
    System.out.println(result);
  }
}