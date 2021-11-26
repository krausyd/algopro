public class AddNumbersLinkedList {
  public static String returnValue(String num1, String num2) {
    LinkedNode linkedList1 = buildLinkedList(num1);
    LinkedNode linkedList2 = buildLinkedList(num2);

    return linkedListAsString(add(linkedList1, linkedList2));
  }

  private static LinkedNode buildLinkedList(String number) {
    LinkedNode linkedList = new LinkedNode();
    LinkedNode pointer = linkedList;
    for(int i = number.length()-1; i>=0; i--) {
      pointer.value = Integer.parseInt(String.valueOf(number.charAt(i)));
      if (i > 0) {
        pointer.next = new LinkedNode();
        pointer = pointer.next;
      }
    }
    return linkedList;
  }

  private static String linkedListAsString(LinkedNode linkedNode) {
    LinkedNode pointer = linkedNode;
    String result = "";
    while(pointer != null) {
      result = String.valueOf(pointer.value) + result;
      pointer = pointer.next;
    }
    return result;
  }

  private static LinkedNode add(LinkedNode number1, LinkedNode number2) {
    LinkedNode pointer1 = number1;
    LinkedNode pointer2 = number2;
    LinkedNode result = new LinkedNode();
    LinkedNode pointerResult = result;
    boolean carryOver = false;
    while(pointer1 != null || pointer2 != null) {
      int value = ((pointer1 != null) ? pointer1.value : 0) + ((pointer2 != null) ? pointer2.value : 0) + (carryOver ? 1 : 0);
      pointerResult.value = value % 10;
      carryOver = value > 9;
      pointer1 = pointer1 != null ? pointer1.next : null;
      pointer2 = pointer2 != null ? pointer2.next : null;
      if (pointer1 != null || pointer2 != null) {
        pointerResult.next = new LinkedNode();
        pointerResult = pointerResult.next;
      }
    }

    return result;
  }
}

class LinkedNode {
  public LinkedNode next;
  public int value;

  public LinkedNode(int value, LinkedNode next) {
    this.value = value;
    this.next = next;
  }

  public LinkedNode() {

  }

  public String toString() {
    String toString = "";
    LinkedNode curr = this;
    while(curr != null) {
      toString += String.valueOf(curr.value);
      curr = curr.next;
    }

    return toString;
  }
}