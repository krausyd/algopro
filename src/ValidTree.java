
public class ValidTree {

  public static boolean isValid(Node tree) {
    return isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean isValid(Node tree, int lowValue, int highValue) {
    if (tree == null) {
      return true;
    }
    return tree.value > lowValue && tree.value < highValue
        && isValid(tree.left, lowValue, tree.value)
        && isValid(tree.right, tree.value, highValue);
  }
}

class Node {
  public int value;
  public Node left;
  public Node right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}