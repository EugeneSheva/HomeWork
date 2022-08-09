package Algoritms.t4equation;

public class Check {
    public static int position = 0;
    public static void CheckExpression(String equ) {
        int tmp = 0;
        while (position < equ.length()) {
            if (Character.isDigit(equ.charAt(position)) || Character.isAlphabetic(equ.charAt(position))) {
                position++;
            } else {
                if ((equ.charAt(position)) == ')') {
                    System.out.println("Отсутствует открывающая скобка");
                    System.exit(0);
                }else if ((equ.charAt(position)) == '(') {
                    tmp = count(equ);
                    break;
                } else {
                        position++;

                }
            }
        }
        if (tmp == 0) {
            System.out.println("Скобки расставлены верно.");
        } else if (tmp > 0) {
            System.out.println("Пропущена закрывающая скобка.");
        } else if (tmp < 0) {
            System.out.println("Пропущена открывающая скобка.");
        }
    }
    public static int count(String equ) {
        int left = 1;
        int right = 0;
        position++;
        while (position < equ.length()) {
            if (Character.isDigit(equ.charAt(position)) || Character.isAlphabetic(equ.charAt(position))) {
                position++;
            } else {
                switch (equ.charAt(position)) {
                    case ')':
                        right++;
                        position++;
                        break;
                    case '(':
                        left++;
                        position++;
                        break;

                    default:
                        position++;
                        break;

                }
            }

        }
        return left - right;
    }
}
