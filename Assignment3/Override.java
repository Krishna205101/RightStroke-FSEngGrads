class Base{
    void show(){
        System.out.println("This is the method in super class.");
    }
}

class Derived extends Base{
    void show(){
        super.show();
        System.out.println("This is the method in subclass.");
    }
} 

class Override{
    public static void main(String args[]) {
        Derived d = new Derived();
        d.show();
    }
}