
final class X // final class
{
    final int x = 900;// final variables

    final public void disp() // final method
    {
        // x=99; // ERROR : final variable value can not be change
        System.out.println("final variable : " + x);
    }
}

class pr21 {
    public static void main(String args[]) {
        X obj = new X();
        System.out.println("final variable : " + obj.x);
    }
}