import studentpck.*;
import exampack.*;
class p25{
    public static void main(String[] args) {
        exampack.exam ob = new exampack.exam();
        ob.setdata("ashish", 12);
        float per=ob.result(50,30,30,50,10);
        System.out.println(per);
    }
}