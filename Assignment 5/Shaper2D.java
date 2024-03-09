package classes;

public abstract class Shaper2D {
	// Non-abstract method
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
