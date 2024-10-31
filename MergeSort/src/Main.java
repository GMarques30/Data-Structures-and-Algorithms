public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.append(15);
    list.append(10);
    list.append(5);
    list.append(20);
    list.append(3);
    list.append(2);

    list.printList(list.head);

    list.head = mergeSort(list.head);

    list.printList(list.head);
  }

  public static Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node middle = getMiddle(head);
    Node nextOfMiddle = middle.next;

    middle.next = null;
    Node left = mergeSort(head);
    Node right = mergeSort(nextOfMiddle);

    return sortedMerge(left, right);
  }

  private static Node getMiddle(Node head) {
    if (head == null) return head;

    Node slow = head, fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  private static Node sortedMerge(Node left, Node right) {
    if (left == null) return right;
    if (right == null) return left;

    Node result;

    if (left.data <= right.data) {
      result = left;
      result.next = sortedMerge(left.next, right);
    } else {
      result = right;
      result.next = sortedMerge(left, right.next);
    }

    return result;
  }
}