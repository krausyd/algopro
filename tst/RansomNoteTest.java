import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

  @Test
  public void canSpellReturnsTrue() {
    assertTrue( RansomNote.canSpell("bed", new char[] {'a', 'b', 'c', 'd', 'b', 'e', 'b'}));
    assertTrue( RansomNote.canSpell("bbed", new char[] {'a', 'b', 'c', 'd', 'b', 'e', 'b'}));
  }

  @Test
  public void canSpellReturnsFalse() {
    assertFalse( RansomNote.canSpell("cat", new char[] {'a', 'b', 'c', 'd', 'b', 'b'}));
  }
}