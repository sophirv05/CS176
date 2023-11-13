package edu.monmouth.problemSet4;

public class ProblemSet4 {
	public static void main(String[] args) {
		int SIZE = 10;
        MusicalInstrument[] instruments = new MusicalInstrument[SIZE];
        
        instruments[0] = new MusicalInstrument("Guitar", "string", 6, 50.99);
		instruments[1] = new MusicalInstrument("Cello", "String", 4, 75.99);
		instruments[2] = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
	    instruments[3] = new MusicalInstrument("Trombone", "Brass", 14, 109.99);
	    instruments[4] = new MusicalInstrument("Clarinet", "woodwind", 10, 89.99);
	    instruments[5] = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
	    instruments[6] = new MusicalInstrument("Tuba", "percussion", 3, 189.99);
	    instruments[7] = new MusicalInstrument("Triangle", "Percussion", 0, 49.99);
	    instruments[8] = new MusicalInstrument("Organ", "keyboard", 61, 99.99);
	    instruments[9] = new MusicalInstrument("Piano", "Keyboard",88, 119.99);
	    
	    // All musical instruments with the 4 attributes
	    System.out.println("All musical instruments object’s 4 attributes: ");
        for (MusicalInstrument instrument : instruments) {
            System.out.println(instrument);
        }
        System.out.println("");

        // Instrument with the fewest number of keys/strings
        System.out.println("Instrument with the fewest keys/strings: ");
        int fewest = Integer.MAX_VALUE;
        MusicalInstrument fewestInstrument = null;
        for (MusicalInstrument instrument : instruments) {
            int keysOrStrings = instrument.getNumberOfKeysorStrings();
            if (keysOrStrings < fewest) {
                fewest = keysOrStrings;
                fewestInstrument = instrument;
            }
        }
        System.out.println(fewestInstrument);
        System.out.println("");

        // Instrument objects with type "brass"
        System.out.println("Instruments of type 'brass':");
        for (MusicalInstrument instrument : instruments) {
            if (instrument.getType().equals("brass")) {
                System.out.println(instrument);
            }
        }
        System.out.println("");

        // Instrument with the greatest price
        double maxPrice = 0;
        MusicalInstrument maxPriceInstrument = null;
        System.out.println("Instrument with the greatest price: ");
        for (MusicalInstrument instrument : instruments) {
            double instrumentPrice = instrument.getPrice();
            if (instrumentPrice > maxPrice) {
                maxPrice = instrumentPrice;
                maxPriceInstrument = instrument;
            }
        }
        System.out.println(maxPriceInstrument);
        System.out.println("");

        // Declare another array of references to Musical Instrument objects
        MusicalInstrument[] brassInstruments = new MusicalInstrument[SIZE];
        int brassCount = 0;

        // Looping construct to copy MusicalInstrument objects with a type of “brass”
        for (MusicalInstrument instrument : instruments) {
            if (instrument.getType().equals("brass")) {
                brassInstruments[brassCount] = instrument;
                brassCount++;
            }
        }

        // Brass instruments in the new array
        System.out.println("Brass instruments:");
        for (int i = 0; i < brassCount; i++) {
            System.out.println(brassInstruments[i]);
        }
        
	}
}
