package Interpreter;

public class Context {
    public Expression CheckExpression (String stringexpression) {
        int position = stringexpression.length()-1;
        while (position>0) {
             if(Character.isDigit(stringexpression.charAt(position))) {
                 position--;
             } else {
                 Expression left = CheckExpression(stringexpression.substring(0,position));
                 Expression right = new Number(Integer.valueOf(stringexpression.substring(position+1)));
                 Character operator = stringexpression.charAt(position);
                 switch (operator) {
                     case '+' : return new Plus(left,right);
                     case '-' : return new Minus(left,right);

                 }
             }
        }
        int result = Integer.valueOf(stringexpression);
        return new Number(result);
    }
}
