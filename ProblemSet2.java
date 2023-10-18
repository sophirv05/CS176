package edu.monmouth.problemSet2;

public class ProblemSet2 {

	public static void main(String[] args) {
		// First instrument - flute
	      MusicalInstrument instrument = new MusicalInstrument();
	      
	      System.out.println("Unknown Instrument:");
	      System.out.println(instrument.getName());
	      System.out.println(instrument.getType());
	      System.out.println(instrument.getNumberOfKeysorStrings());
	      System.out.println("");

	      MusicalInstrument flute = new MusicalInstrument();

	      flute.setName("Flute");	
	      flute.setType("Woodwind");
	      flute.setNumberOfKeysorStrings(7);
	      		
	      System.out.println("Instrument 1:");
	      System.out.println("Name: " + flute.getName());
	      System.out.println("Type: " + flute.getType());
	      System.out.println("Number of Keys or Strings: " + flute.getNumberOfKeysorStrings());
	      System.out.println("");
	      		
	      // Second instrument - cello
	      MusicalInstrument cello = new MusicalInstrument(2, "String", "Cello");
	      
	      System.out.println("Instrument 2:");
	      System.out.println("Name: " + cello.getName());
	      System.out.println("Type: " + cello.getType());
	      System.out.println("Number of Keys or Strings: " + cello.getNumberOfKeysorStrings());
	      System.out.println("");
	      
	      // Mutator method, change this object’s name, type, and numberOfKeysorStrings
	      cello.setName("snare drum");
	      cello.setType("percussion");
	      cello.setNumberOfKeysorStrings(0);
	      
	      System.out.println("Name: " + cello.getName());
	      System.out.println("Type: " + cello.getType());
	      System.out.println("Number of Keys or Strings: " + cello.getNumberOfKeysorStrings());
	      System.out.println("");
	      		
	      // Third instrument - trombone
	      MusicalInstrument trombone = new MusicalInstrument();
	      				
	      trombone.setName("Trombone");	
	      trombone.setType("Brass");
	      trombone.setNumberOfKeysorStrings(12);
	      
	      System.out.println("Instrument 3:");
	      System.out.println("Name: " + trombone.getName());
	      System.out.println("Type: " + trombone.getType());
	      System.out.println("Number of Keys or Strings: " + trombone.getNumberOfKeysorStrings());
	      System.out.println("");
	      				
	      // Fourth instrument - piano
	      MusicalInstrument piano = new MusicalInstrument(88, "Keyboard", "Piano");
	      
	      System.out.println("Instrument 4:");
	      System.out.println("Name: " + piano.getName());
	      System.out.println("Type: " + piano.getType());
	      System.out.println("Number of Keys or Strings: " + piano.getNumberOfKeysorStrings());
	      System.out.println("");

	      // Fifth instrument - tambourine
	      MusicalInstrument tambourine = new MusicalInstrument();
	      						
	      tambourine.setName("Tambourine");	
	      tambourine.setType("Percussion");
	      tambourine.setNumberOfKeysorStrings(8);
	      
	      System.out.println("Instrument 5:");
	      System.out.println("Name: " + tambourine.getName());
	      System.out.println("Type: " + tambourine.getType());
	      System.out.println("Number of Keys or Strings: " + tambourine.getNumberOfKeysorStrings());
	}

}
