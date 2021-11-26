import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PushDominosTest {

  @Test
  public void testItWorks() {
    assertEquals("..RR.LL..RR", PushDominos.push(new char[]{'.','.','R','.','.','.','L','.','.','R','.'}));
    assertEquals("..RRRRL..RR", PushDominos.push(new char[]{'.','.','R','.','.','R','L','.','.','R','.'}));
    assertEquals("RRRRRRRRRRR", PushDominos.push(new char[]{'R','.','.','.','.','.','.','.','.','.','.'}));
    assertEquals("LLLLLLLLLLL", PushDominos.push(new char[]{'.','.','.','.','.','.','.','.','.','.','L'}));
  }
}