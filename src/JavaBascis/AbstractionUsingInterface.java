package JavaBascis;

// Interface declaration
interface Shape {

    void circle(); // Abstract method
}

// Class implementing the interface
class Draw implements Shape {

    // Implementing the abstract method
    public void circle() {
        System.out.println("Draw a circle");
    }
}

// Main class to test the implementation
public class AbstractionUsingInterface {

    public static void main(String[] args) {
        // Create an object of the implementing class
        Draw cir = new Draw();
        
        // Call the implemented method
        cir.circle();
    }
}
