public class BinaryTree {
  public TreeNode root;

  public BinaryTree() {
    this.root = null;
  }

  public void insert(int data) {
    if(root == null) {
      this.root = new TreeNode(data);
    } else {
      this._insert_recursive(data, this.root);
    }
  }

  private void _insert_recursive(int data, TreeNode node) {
    if(data < node.data) {
      if(node.left == null) {
        node.left = new TreeNode(data);
      } else {
        this._insert_recursive(data, node.left);
      }
    } else {
      if(node.right == null) {
        node.right = new TreeNode(data);
      } else {
        this._insert_recursive(data, node.right);
      }
    }
  }

  public boolean search(int data) {
    return this._search_recursive(this.root, data);
  }

  private boolean _search_recursive(TreeNode node, int data) {
    if(node == null) return false;
    if(node.data == data) {
      return true;
    } else if(data < node.data) {
      return this._search_recursive(node.left, data);
    } else {
      return this._search_recursive(node.right, data);
    }
  }

}
