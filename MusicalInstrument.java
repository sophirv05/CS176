package edu.monmouth.problemSet2;

public class MusicalInstrument {	
	// Constants for unknown values
    private static final String UNKNOWNNAME = "UNKNOWNNAME";
    private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
    private static final int UNKNOWNKEYSORSTRINGS = -1;
    private static final int MINKEYS = 0;
    private static final int MAXKEYS = 100;

    // Instance variables
    private int numberOfKeysorStrings;
    private String type;
    private String name;

	// Default constructor for MusicalInstrument
    public MusicalInstrument() {
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
        setType(UNKNOWNTYPE);
        setName(UNKNOWNNAME);
    }
    
    // Constructor for MusicalInstrument
    public MusicalInstrument(int numberOfKeysorStrings, String type, String name) {
    	setNumberOfKeysorStrings(numberOfKeysorStrings);
    	setType(type);
    	setName(name);
    }
		
	// Mutator for setNumberOfKeysorStrings
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		if(numberOfKeysorStrings >= MINKEYS && numberOfKeysorStrings <= MAXKEYS) {
			this.numberOfKeysorStrings = numberOfKeysorStrings;
		} else {
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		}
	}
	
	
	// Mutator for setName
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = UNKNOWNNAME;
        }		
	}
	
	// Mutator for setType
	public void setType(String type) {
		if (type != null) {
			type = type.toLowerCase();
			if (type.equals("woodwind")) {
				this.type = type;
			} else if(type.equals("string")) {
				this.type = type;
			} else if(type.equals("brass")) {
				this.type = type;
			} else if(type.equals("keyboard")) {
				this.type = type;
			} else if(type.equals("percussion")) {
				this.type = type;
			} else {
				this.type = UNKNOWNTYPE;
			}
		} else {
            this.type = UNKNOWNTYPE;
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
}
