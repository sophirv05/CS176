package edu.monmouth.problemset6;

import edu.monmouth.musicalInstrument.MusicalInstrument;
import edu.monmouth.musicalInstrument.MusicalInstrumentException;

public class ProblemSet6 {
	public static void main(String[] args) {
		try {
			MusicalInstrument instrument1 = new MusicalInstrument("Guitar", "string", 6, 50.99);
			System.out.println("Instrument 1: " + instrument1);
		} catch (MusicalInstrumentException e) {
			System.out.println("Cannot make instrument " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument2 = new MusicalInstrument("Piano", "Keyboard", 88);
			System.out.println("Instrument 2: " + instrument2);
		} catch (MusicalInstrumentException e) {
			System.out.println("Cannot make instrument " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument3 = new MusicalInstrument(null, "woodwind", 10);
			System.out.println("Instrument 3: " + instrument3);
		} catch (MusicalInstrumentException e) {
			System.out.println("Cannot make instrument " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument4 = new MusicalInstrument("Trombone", "none", 10);
			System.out.println("Instrument 3: " + instrument4);
		} catch (MusicalInstrumentException e) {
			System.out.println("Cannot make instrument " + e.getMessage());
			e.printStackTrace();
		}
	}
}
