package edu.monmouth.shape;

public class Circle implements Shape {
	private double radius;
	private int lower=0;

	// Default constructor
    public Circle(double radius) {
        setRadius(radius);
    }
    
	// Mutator setRadius
    public void setRadius(double radius) {
        if (radius > lower) {
            this.radius = radius;
        } else {
            this.radius = lower;
        }
    }
    
	// Accessor for getRadius
    public double getRadius() {
        return radius;
    }
    
    // Get area
    @Override
	public double area() {
		return Math.PI * radius * radius;
	}

    @Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
