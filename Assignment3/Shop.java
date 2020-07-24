class Publication{
    String title;
    int price;
}

class Book extends Publication{
    int pg;
    public Book(String t,int p,int pg){
        super.title=t;
        super.price=p;
        this.pg=pg;
    }
    void display(){
        System.out.println("This is Book class");
        System.out.println("Title: "+super.title);
        System.out.println("Price: Rs."+super.price);
        System.out.println("Pages: "+pg);
    }
}

class CD extends Publication{
    int s;
    public CD(String t,int p,int s){
        super.title=t;
        super.price=p;
        this.s=s;
    }
    void display(){
        System.out.println("This is CD class");
        System.out.println("Title: "+super.title);
        System.out.println("Price: Rs."+super.price);
        System.out.println("Size: "+s+" MB");
    }
}

class Shop{
    public static void main(String[] args) {
        Book b=new Book("Java",40,2);
        CD c=new CD("CA",25,650);
        b.display();
        c.display();
    }
}