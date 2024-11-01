public class Main {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    System.out.println("Inserindo valores na árvore...");
    tree.insert(10);
    tree.insert(5);
    tree.insert(15);
    tree.insert(3);
    tree.insert(7);

    // Verifica se a raiz e os nós estão na posição correta
    if (tree.root != null && tree.root.data == 10) {
      System.out.println("Raiz inserida corretamente com valor 10.");
    } else {
      System.out.println("Erro na inserção da raiz.");
    }

    if (tree.root.left != null && tree.root.left.data == 5) {
      System.out.println("Nó esquerdo da raiz inserido corretamente com valor 5.");
    } else {
      System.out.println("Erro na inserção do nó esquerdo da raiz.");
    }

    if (tree.root.right != null && tree.root.right.data == 15) {
      System.out.println("Nó direito da raiz inserido corretamente com valor 15.");
    } else {
      System.out.println("Erro na inserção do nó direito da raiz.");
    }

    System.out.println("\nTestando busca na árvore...");
    int[] valoresParaBuscar = {10, 5, 15, 3, 7, 20};

    for (int valor : valoresParaBuscar) {
      if (tree.search(valor)) {
        System.out.println("Valor " + valor + " encontrado na árvore.");
      } else {
        System.out.println("Valor " + valor + " não encontrado na árvore.");
      }
    }
  }
}
