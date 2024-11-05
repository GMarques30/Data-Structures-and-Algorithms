public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Topo após push: " + stack.peek());

    System.out.println("Tamanho após push: " + stack.size());

    System.out.println("Valor removido: " + stack.pop());

    System.out.println("Topo após pop: " + stack.peek());
    System.out.println("Tamanho após pop: " + stack.size());

    stack.pop();
    stack.pop();
    try {
      stack.pop();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exceção ao remover de uma pilha vazia: " + e.getMessage());
    }

    try {
      stack.peek();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Exceção ao acessar o topo de uma pilha vazia: " + e.getMessage());
    }
  }
}
