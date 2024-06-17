import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    String name;
    int roll;

    public void printData(){
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.name = "John";
        // System.out.println(obj.name);
        obj.printData();

        Main obj1 = new Main();
        obj1.name = "Ram";
        obj1.printData();
    }
}
