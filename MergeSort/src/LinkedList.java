class LinkedList {
  Node head;

  public void append(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }

  public void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}