package Interpreter;

public class Number implements Expression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
