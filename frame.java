public class frame {
    public static void main(String[] args) {
        System.out.println("frame");
        display.display();
        show.show();
    }
}

class display{

    public static void display(){
        System.out.println("display_method");
    }
    }

class show{
    public static void show(){
        System.out.println("hello_world");
    }
}
