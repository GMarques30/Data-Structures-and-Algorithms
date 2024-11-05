public class Stack {
  public Node top;
  public int size;

  public Stack() {
    this.top = null;
    this.size = 0;
  }

  public void push(int value) {
    Node node = new Node(value);
    node.next = this.top;
    this.top = node;
    this.size++;
  }

  public int pop() {
    if(this.top == null) throw new IndexOutOfBoundsException();
    Node poppedNode = this.top;
    this.top = poppedNode.next;
    this.size--;
    return poppedNode.value;
  }

  public int peek() {
    if(this.size == 0) throw new IndexOutOfBoundsException();
    return this.top.value;
  }

  public int size() {
    return this.size;
  }
}
