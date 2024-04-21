package com.techykumar29.o;

public class Open4ExtensionClose4Modification {

}

interface Printer{
	void print();
}

class InkjetPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Printing with InkJet Printer.");
	}
}

class DotMatrixPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Printing with Dot Matrix Printer.");
	}
}

class LaserPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Printing with Laser Printer.");
	}
	
}