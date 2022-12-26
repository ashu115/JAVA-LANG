package exampack;

import studentpck.*;
public class exam extends student {
    int total;
    public float result(int m1, int m2, int m3, int m4, int m5) {
        total = m1 + m2 + m3 + m4 + m5;
        return (float) total/5;
    }
}
