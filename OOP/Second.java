package OOP;

public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myObj.myPublicMethod(); // public method from Main
        Main.myStaticMethod(); // Static method from Main
    }
}
