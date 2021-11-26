import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxStackTest {

  @Test
  public void testItWorks() {
    MaxStack.push(2);
    MaxStack.push(2);
    MaxStack.push(1);
    MaxStack.push(3);
    MaxStack.push(2);

    assertEquals(3, MaxStack.getMax());
    MaxStack.pop();
    assertEquals(3, MaxStack.getMax());
    MaxStack.pop();
    assertEquals(2, MaxStack.getMax());
  }
}