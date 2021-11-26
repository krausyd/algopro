import java.util.ArrayList;
import java.util.List;

public class MaxStack {
  private static List<Integer> stack = new ArrayList<>();
  private static List<Integer> maxStack = new ArrayList<>();

  public static void push(int value) {
    stack.add(value);
    if (maxStack.size() == 0 || value > maxStack.get(maxStack.size() - 1)) {
      maxStack.add(value);
    } else {
      maxStack.add(maxStack.get(maxStack.size() -1));
    }
  }

  public static int pop() {
    if (maxStack.size() > 0 && stack.size() > 0) {
      maxStack.remove(maxStack.get(maxStack.size() - 1));
      int value = stack.get(stack.get(stack.size() - 1));
      stack.remove(stack.get(stack.size() - 1));
      return value;
    }
    throw new ArrayIndexOutOfBoundsException("Stacks are empty");
  }

  public static int getMax() {
    if (maxStack.size() > 0) {
      return maxStack.get(maxStack.size() - 1);
    }
    throw new ArrayIndexOutOfBoundsException("Stacks are empty");
  }
}
