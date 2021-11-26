import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

  @Test
  public void testItWorks() {
    assertEquals(-4, SimpleCalculator.eval("-(3+(2-1))"));
    assertEquals(-3, SimpleCalculator.eval("-(3+(2-1))+1"));
    assertEquals(-4, SimpleCalculator.eval("-(3+(2-1))+1-(5-4)"));
  }
}