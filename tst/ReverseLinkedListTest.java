import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  @Test
  public void testItWorks() {
    LinkedNode root = new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4, new LinkedNode(5, null)))));

    assertEquals("54321", ReverseLinkedList.reverse(root).toString());
  }
}