import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidTreeTest {

  @Test
  public void testValidTree() {
    Node validTree = new Node(5, new Node(4, null, null), new Node(7, null, null));

    assertTrue(ValidTree.isValid(validTree));
  }

  @Test
  public void testInvalidTree() {
    Node invalidTree = new Node(5, new Node(4, null, null), new Node(7, null, null));
    invalidTree.right.left = new Node(2, null, null);

    assertFalse(ValidTree.isValid(invalidTree));
  }
}