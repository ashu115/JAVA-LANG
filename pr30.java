/*
Write a program in Java to demonstrate use of final class, final variable and final method
 */

final class X 
{
    final int x = 90;

    final public void disp() 
    {
        System.out.println("final variable : " + x);
    }
}

class pr30 {
    public static void main(String args[]) {
        X obj = new X();
        System.out.println("final variable : " + obj.x);
    }
}