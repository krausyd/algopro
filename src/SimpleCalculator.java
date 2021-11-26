public class SimpleCalculator {

  private static int index = 0;

  public static int eval(final String expression) {
    index = 0;
    return evalHelper(expression);
  }

  private static int evalHelper(final String expression) {
    int result = 0;
    char operator = '+';
    char[] expressionArr = expression.toCharArray();
    for(; index < expressionArr.length; index++) {
      if (Character.isDigit(expressionArr[index])) {
        result = doOperation(result, Character.getNumericValue(expressionArr[index]), operator);
      } else {
        switch (expressionArr[index]) {
          case '+':
            operator = '+';
            break;
          case '-':
            operator = '-';
            break;
          case '(':
            index++;
            result = doOperation(result, evalHelper(expression), operator);
            break;
          case ')':
            return result;
        }
      }
    }

    return result;
  }

  private static int doOperation(int num1, int num2, char operator) {
    if (operator == '+') {
      return num1+num2;
    } else {
      return num1-num2;
    }
  }

}
