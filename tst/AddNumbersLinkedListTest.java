import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumbersLinkedListTest {
  @Test
  public void testAddNumbers() {
    assertEquals("807", AddNumbersLinkedList.returnValue("342", "465"));
    assertEquals("1807", AddNumbersLinkedList.returnValue("342", "1465"));
    assertEquals("2807", AddNumbersLinkedList.returnValue("2342", "465"));
  }
}