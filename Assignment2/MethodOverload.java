public class MethodOverload {
    public void Load(String s) {
        System.out.println(s);
    }

    public void Load(char c) {
        System.out.println(c);
    }

    public void Load(int i) {
        System.out.println(i);
    }

    public void Load(double d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();
        m.Load("krishna");
        m.Load(5.8);
        m.Load(55);
        m.Load('k');
    }
}