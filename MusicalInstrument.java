package edu.monmouth.problemSet4;

public class MusicalInstrument {
	// Constants for unknown values
    private final String UNKNOWNNAME = "UNKNOWNNAME";
    private final String UNKNOWNTYPE = "UNKNOWNTYPE";
    private final int UNKNOWNKEYSORSTRINGS = -1;
    private final int UNKNOWNPRICE= -9;
    private final int MINKEYS = 0;
    private final int MAXKEYS = 100;
    private final int MINPRICE = 0;;

    // Instance variables
    private String name;
    private String type;
    private int numberOfKeysorStrings;
    private double price;

	// Default constructor
    public MusicalInstrument() {
        setName(UNKNOWNNAME);
        setType(UNKNOWNTYPE);
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
        setPrice(UNKNOWNPRICE);
    }
        
  
    // Constructor 2
    public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
        setName(name);
    	setType(type);
    	setNumberOfKeysorStrings(numberOfKeysorStrings);
        setPrice(UNKNOWNPRICE);
    }
    
    // Constructor 3
    public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double price) {
        setName(name);
    	setType(type);
    	setNumberOfKeysorStrings(numberOfKeysorStrings);
    	setPrice(price);
    }
	
	// Mutator for setName
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
            this.name = name.toLowerCase();
        } else {
            this.name = UNKNOWNNAME;
        }		
	}
	
	// Mutator for setType
	public void setType(String type) {
	    String[] validTypes = {"woodwind", "brass", "string", "percussion", "keyboard"};
	    type = type.toLowerCase();
		for (String validType : validTypes) {
            if (type.equals(validType)) {
                this.type = type;
                return;
            } else {
            	this.type = UNKNOWNTYPE;
            }
		}
    }
	
	// Mutator for setNumberOfKeysorStrings
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		if(numberOfKeysorStrings >= MINKEYS && numberOfKeysorStrings <= MAXKEYS) {
			this.numberOfKeysorStrings = numberOfKeysorStrings;
		} else {
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		}
	}
	
	// Mutator setPrice
	public void setPrice(double price) {
        if (price < MINPRICE) {
            this.price = UNKNOWNPRICE;
        } else {
            this.price = price;
        }
	}
	
	// Accessor for getNumberOfKeysorStrings
	public int getNumberOfKeysorStrings() {
	    return numberOfKeysorStrings;
	}

	// Accessor for getName
	public String getName() {
	    return name;
	}
	    
	// Accessor for getType
	public String getType() {
	    return type;
	}
	
	// Accessor for get Price
	public double getPrice() {
	    return price;
	   
	}

	// toString
	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", numberOfKeysorStrings=" + numberOfKeysorStrings
				+ ", price=" + price + "]";
	}

	
}
