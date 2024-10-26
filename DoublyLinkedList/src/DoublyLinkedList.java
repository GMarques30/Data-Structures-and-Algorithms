public class DoublyLinkedList {
  private Node head;
  private Node tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void add(int value) {
    Node node = new Node(value);
    node.prev = this.tail;
    if (this.tail != null) {
      this.tail.next = node;
    } else {
      this.head = node;
    }
    this.tail = node;
  }

  public void addFirst(int value) {
    Node node = new Node(value);
    node.next = this.head;
    if(this.head != null) {
      this.head.prev = node;
    } else {
      this.tail = node;
    }
    this.head = node;
  }

  public int remove(int value) {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        if (current.prev != null) {
          current.prev.next = current.next;
        } else {
          head = current.next;
        }
        if (current.next != null) {
          current.next.prev = current.prev;
        } else {
          tail = current.prev;
        }
        return value;
      }
      current = current.next;
    }
    return -1;
  }

  public int removeFirst() {
    if(this.head == null) return -1;
    int removedValue = this.head.value;
    this.head = this.head.next;
    if(this.head != null) {
      this.head.prev = null;
    } else {
      this.tail = null;
    }
    return removedValue;
  }

  public int removeLast() {
    if(this.tail == null) return -1;
    int removedValue = this.tail.value;
    this.tail = this.tail.prev;
    if(this.tail != null) {
      this.tail.next = null;
    } else {
      this.head = null;
    }
    return removedValue;
  }

  public void display() {
    Node current = head;
    if (current == null) {
      System.out.println("A lista está vazia.");
      return;
    }

    System.out.print("Lista: ");
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
    System.out.println();
  }
}
