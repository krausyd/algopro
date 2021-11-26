public class ReverseLinkedList {

  public static LinkedNode reverse(LinkedNode root) {
    LinkedNode current = root;
    LinkedNode prev = null;
    while(current != null) {
      LinkedNode helperPointer = current.next;
      current.next = prev;
      prev = current;
      current = helperPointer;
    }

    return prev;
  }
}
