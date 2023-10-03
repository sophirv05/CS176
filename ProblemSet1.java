package edu.monmouth.problemSet1;

public class ProblemSet1 {

	public static void main(String[] args) {
		
		//first instrument - flute
		MusicalInstrument flute = new MusicalInstrument();
		System.out.println(flute.getName());
		System.out.println(flute.getType());
		System.out.println(flute.getNumberOfKeysorStrings());
		System.out.println("");

		flute.setName("Flute");	
		flute.setType("Woodwind");
		flute.setNumberOfKeysorStrings(7);
		
		System.out.println("The first instrument is " + flute.getName());
		System.out.println("Type- " + flute.getType());
		System.out.println(flute.getNumberOfKeysorStrings());
		System.out.println("");
		
		//second instrument - cello
		MusicalInstrument cello = new MusicalInstrument("Cello", "String", 9);
		
		System.out.println("The second instrument is " + cello.getName());
		System.out.println("Type- " + cello.getType());
		System.out.println(cello.getNumberOfKeysorStrings());
		System.out.println("");
		
		//third instrument - trombone
		MusicalInstrument trombone = new MusicalInstrument();
				
		trombone.setName("Trombone");	
		trombone.setType("Brass");
		trombone.setNumberOfKeysorStrings(12);
				
		System.out.println("The third instrument is " + trombone.getName());
		System.out.println("Type- " + trombone.getType());
		System.out.println(trombone.getNumberOfKeysorStrings());
		System.out.println("");
				
		//fourth instrument - piano
		MusicalInstrument piano = new MusicalInstrument("Piano", "Keyboard", 88);
				
		System.out.println("The fourth instrument is " + piano.getName());
		System.out.println("Type- " + piano.getType());
		System.out.println(piano.getNumberOfKeysorStrings());
		System.out.println("");

		//fifth instrument - tambourine
		MusicalInstrument tambourine = new MusicalInstrument();
						
		tambourine.setName("Tambourine");	
		tambourine.setType("Percussion");
		tambourine.setNumberOfKeysorStrings(8);
						
		System.out.println("The fifth instrument is " + tambourine.getName());
		System.out.println("Type- " + tambourine.getType());
		System.out.println(tambourine.getNumberOfKeysorStrings());	

		
	}

}
