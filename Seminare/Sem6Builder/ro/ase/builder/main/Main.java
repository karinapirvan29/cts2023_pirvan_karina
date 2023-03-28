package ro.ase.builder.main;

import ro.ase.builder.AbstractBuilder;
import ro.ase.builder.Builder;
import ro.ase.builder.BuilderB2;
import ro.ase.builder.Reservation;

public class Main {

	public static void main(String[] args) {
		AbstractBuilder builder = new Builder();
		
		builder.setAmbientalMusic(true).setMusicType("Jazz");
		
		Reservation reservation = builder.getReservation();
		
		System.out.println(reservation.toString());
		
		//Reservation reservation2 = builder.getReservation();
		
		AbstractBuilder builder2 = new BuilderB2();
		Reservation reservation2 = builder2.setAmbientalMusic(true).setMusicType("rock").getReservation();
		System.out.println(reservation2.toString());
		
		Reservation reservation3 = builder2.setAmbientalMusic(true).setMusicType("pop").getReservation();
		System.out.println(reservation3.toString());
		
		Reservation res1 = new Builder().setAmbientalMusic(true).getReservation();
		System.out.println(res1.toString());

	}
}
