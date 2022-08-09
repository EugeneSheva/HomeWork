package Interpreter;

public class MainInteroreter {
    public static void main(String[] args) {
        String s = "150+150+150+150-300";
        Context context = new Context();
        Expression expression = context.CheckExpression(s);
        System.out.println(expression.interpret());
    }
}
