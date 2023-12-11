package edu.monmouth.musicalInstrument;

public class MusicalInstrumentException extends Exception {

	private static final long serialVersionUID = 1L;

	public MusicalInstrumentException() {
		super(); // excecute exception default constructor
	}

	public MusicalInstrumentException(String message) {
		super(message);
	}

}