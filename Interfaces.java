import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
interface Animal {
    public void run();
}
class Tiger implements Animal{
    public void run(){
        System.out.println("Tiger Runs");
    }
}
    class Lion implements Animal{
        public void run(){
        System.out.println("Lion Runs");
    }
    }
public class Main{
    public static void main(String[] args) {
        Animal Lion1 = new Lion();
        Lion1.run();
        Animal Tiger1 = new Tiger();
        Tiger1.run();
        System.out.println("Hello world!");
    }
}
