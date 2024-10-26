public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public void add(int value) {
    Node node = new Node(value);
    if(this.head == null) {
      this.head = node;
    } else {
      Node current = this.head;
      while(current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
  }

  public void addFirst(int value) {
    Node node = new Node(value);
    if(this.head == null) {
      this.head = node;
    } else {
      Node current = this.head;
      this.head = node;
      this.head.next = current;
    }
  }

  public void addLast(int value) {
    Node node = new Node(value);
    if(this.head == null) {
      this.head = node;
    } else {
      Node current = this.head;
      while(current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
  }

  public int remove(int value) {
    if (this.head == null) return -1;
    if (this.head.value == value) {
      return removeFirst();
    }
    Node current = this.head;
    while(current.next != null && current.next.value != value) {
      current = current.next;
    }
    if (current.next == null) return -1;
    int removedValue = current.next.value;
    current.next = current.next.next;
    return removedValue;
  }

  public int removeFirst() {
    if(this.head == null) return -1;
    int removedValue  = this.head.value;
    this.head = this.head.next;
    return removedValue;
  }

  public int removeLast() {
    if (this.head == null) return -1;
    if (this.head.next == null) {
      int removedValue = this.head.value;
      this.head = null;
      return removedValue;
    }
    Node current = this.head;
    while(current.next.next != null) {
      current = current.next;
    }
    int removedValue = current.next.value;
    current.next = null;
    return removedValue;
  }

  public void display() {
    Node current = this.head;
    while (current != null) {
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
}