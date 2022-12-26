package studentpck;

public class student {
    String name;
    int cls;

    public void setdata(String stname, int stcls) {
        name = stname;
        cls = stcls;
        System.out.println("Name:- " + name + "\nclass:- " + cls);
    }
}
