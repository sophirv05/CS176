package edu.monmouth.shape;

public class Rectangle implements Shape {
	private double width;
	private double length;
	private int lower=0;

	// Default constructor
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    
	// Mutator setWidth
    public void setWidth(double width) {
        if (width > lower) {
            this.width = width;
        } else {
            this.width = lower;
        }
    }

	// Mutator setLength
    public void setLength(double length) {
        if (length > lower) {
            this.length = length;
        } else {
            this.length = lower;
        }
    }
    
	// Accessor for getWidth
    public double getWidth() {
        return width;
    }
    
	// Accessor for getLength
    public double getLength() {
        return length;
    }
    
    // Get area
    public double area() {
    	return width * length;
    }
  
    @Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
}
