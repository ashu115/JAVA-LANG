/*
 * Write a program in Java to develop user defined exception for 'Divide by
 * Zero' error
 */

class InvalidOperation extends Exception {
    InvalidOperation(String s) {
        super(s);
    }
}

public class pr31 {
    public static void doMyTask(int a, int b) throws InvalidOperation {
        if (b == 0) {
            throw new InvalidOperation("we can not divid any number by ZERO");
        } else {
            System.out.println("Ans : " + (a / b));
        }
    }

    public static void main(String args[]) {
        System.out.println("before try block : ");
        try {
            System.out.println("try block : ");
            doMyTask(10, 2);
            System.out.println("try block [after exception]: ");
        } catch (ArithmeticException e) {
            System.out.println("from catch block : " + e);
        } catch (Exception e) {
            System.out.println("from catch block : " + e);
        } finally {
            System.out.println("from finally block : ");
        }
        System.out.println("remaining code");
    }
}
