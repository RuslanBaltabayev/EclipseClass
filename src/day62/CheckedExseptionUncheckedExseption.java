package day62;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class CheckedExseptionUncheckedExseption {
	
	public static void main(String[] args) {
		
		System.out.println("BEGINNING");
		try {
			System.out.println("DOING SOME IO INTENSIVE ACTIONS ");
			System.out.println("READING A FILE ");
			
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("CAUGHT THE FISH!!!");
		}
		System.out.println("ENDING");
		
		
	}
	
}
