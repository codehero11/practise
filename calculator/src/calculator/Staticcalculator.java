package calculator;

public class Staticcalculator {
    int a = 70;
    int b = 30;

    int addition() {
        return a + b;
    }
}

class sub extends Staticcalculator {
    int subtraction() {
        return a - b;
    }
}

class multiple extends sub{
    int multiplication() {
        return a * b;
    }
}

class div extends multiple {
    int division() {
        return a / b;
    }
}

class Main extends div {
    public static void main(String args[]) {
        Main op = new Main();
        System.out.println("addition:" + op.addition());
        System.out.println("subtraction:" + op.subtraction());
        System.out.println("multiplication:" + op.multiplication());
        System.out.println("division:" + op.division());
    }
}
