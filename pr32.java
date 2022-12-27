/* Write a program in Java to demonstrate throw, throws, finally, multiple try block and
multiple
catch exception */

class pr32 {
    public static void doMyTask() throws ArithmeticException {
        int a = 2 / 0;
    }

    static void validateAge(int age) {
        if (age < 18)
            throw new ArithmeticException("you can not vote");
        else {
            System.out.println("welcome, you can vote");
            doMyTask();
        }
    }

    public static void main(String args[]) {
        try {
            validateAge(80);
        } catch (ArithmeticException e) {
            System.out.println("content of catch block and error : " + e);
        } finally {
            System.out.println("this is content of finally block : ");
        }
        System.out.println("The Remaining code............");
    }
}