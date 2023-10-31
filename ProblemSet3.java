package edu.monmouth.problemSet3;

public class ProblemSet3 {
	public static void main(String[] args) {
		MusicalInstrument instrument1 = new MusicalInstrument();
		// verify default constructor sets all attributes correctly
	    System.out.println("Instrument 1:");
		System.out.println("Name: " + instrument1.getName());
	    System.out.println("Type: " + instrument1.getType());
	    System.out.println("Number of Keys or Strings: " + instrument1.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument1.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument2 = new MusicalInstrument("GuiTar", "STRIng", 6);
		// verify this constructor sets all attributes correctly
	    System.out.println("Instrument 2:");
		System.out.println("Name: " + instrument2.getName());
	    System.out.println("Type: " + instrument2.getType());
	    System.out.println("Number of Keys or Strings: " + instrument2.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument2.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		// verify this constructor sets all attributes correctly
	    System.out.println("Instrument 3:");
		System.out.println("Name: " + instrument3.getName());
	    System.out.println("Type: " + instrument3.getType());
	    System.out.println("Number of Keys or Strings: " + instrument3.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument3.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument4 = new MusicalInstrument("", "BRAss", -14, 109.99);
		// verify this constructor sets all attributes correctly
		System.out.println("Instrument 4:");
		System.out.println("Name: " + instrument4.getName());
	    System.out.println("Type: " + instrument4.getType());
	    System.out.println("Number of Keys or Strings: " + instrument4.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument4.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument5 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);
		// verify this constructor sets all attributes correctly
		System.out.println("Instrument 5:");
		System.out.println("Name: " + instrument5.getName());
	    System.out.println("Type: " + instrument5.getType());
	    System.out.println("Number of Keys or Strings: " + instrument5.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument5.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument6 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		// verify this constructor sets all attributes correctly
		System.out.println("Instrument 6:");
		System.out.println("Name: " + instrument6.getName());
	    System.out.println("Type: " + instrument6.getType());
	    System.out.println("Number of Keys or Strings: " + instrument6.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument6.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument7 = new MusicalInstrument("tuba", "Brass", 3, 189.99);
		// verify this constructor sets all attributes correctly
		System.out.println("Instrument 7:");
		System.out.println("Name: " + instrument7.getName());
	    System.out.println("Type: " + instrument7.getType());
	    System.out.println("Number of Keys or Strings: " + instrument7.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument7.getPrice());
	    System.out.println("");
		
		MusicalInstrument instrument8 = new MusicalInstrument("trianGle", "percussion", 0, 49.99);
		// verify this constructor sets all attributes correctly
		System.out.println("Instrument 8:");
		System.out.println("Name: " + instrument8.getName());
	    System.out.println("Type: " + instrument8.getType());
	    System.out.println("Number of Keys or Strings: " + instrument8.getNumberOfKeysorStrings());
	    System.out.println("Price: " + instrument8.getPrice());
	    System.out.println("");
		
	    // for objects instrument5-8, determine the most expensive
	    double price5 = instrument5.getPrice();
	    double price6 = instrument6.getPrice();
	    double price7 = instrument7.getPrice();
	    double price8 = instrument8.getPrice();

		System.out.println("Object with the greatest price: ");
		if (price5 > price6 && price5 > price7 && price5 > price8) {
			System.out.println("Price 5 is the most expensive!: $" + price5);
		} else if (price6 > price5 && price6 > price7 && price6 > price8) {
			System.out.println("Price 6 is the most expensive!: $" + price6);
		} else if (price7 > price5 && price7 > price6 && price7 > price8) {
			System.out.println("Price 7 is the most expensive!: $" + price7);
		} else if (price8 > price5 && price8 > price6 && price8 > price7) {
			System.out.println("Price 8 is the most expensive!: $" + price8);
		}
	    System.out.println("");
		
		// for objects instrument5-8, determine which are woodwind instruments
		System.out.println("Woodwind instruments: ");
		if(instrument5.getType().equals("woodwind")){
			System.out.println(instrument5.getName() + " is a woodwind!");
		} 
		if(instrument6.getType().equals("woodwind")){
			System.out.println(instrument6.getName() + " is a woodwind!");
		}
		if(instrument7.getType().equals("woodwind")){
			System.out.println(instrument7.getName() + " is a woodwind!");
		}
		if(instrument8.getType().equals("woodwind")){
			System.out.println(instrument8.getName() + " is a woodwind!");
		}
	    System.out.println("");
		
		// for objects instrument5-8, determine which have keys or strings > 6
	    int low = 6;
	    System.out.println("Instruments with keys or strings > 6:");
	    if(instrument5.getNumberOfKeysorStrings() > low){
			System.out.println(instrument5.getName() + " have keys or strings > 6");
		} 
	    if(instrument6.getNumberOfKeysorStrings() > low){
			System.out.println(instrument6.getName() + " have keys or strings > 6");
		} 
	    if(instrument7.getNumberOfKeysorStrings() > low){
			System.out.println(instrument7.getName() + " have keys or strings > 6");
		} 
	    if(instrument8.getNumberOfKeysorStrings() > low){
			System.out.println(instrument8.getName() + " have keys or strings > 6");
		}     
        
	}

}
