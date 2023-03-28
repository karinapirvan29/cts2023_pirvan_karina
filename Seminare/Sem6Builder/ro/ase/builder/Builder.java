package ro.ase.builder;

public class Builder  implements AbstractBuilder{
	
	Reservation reservation;
	

	@Override
	public Reservation getReservation() {
		
		return reservation;
	}
	
	public Builder() {
		reservation=new Reservation(false,false,false,false,null);
	}

	public AbstractBuilder setIsWindowPositioned(boolean isWindowPositioned) {
		reservation.setWindowPosition(isWindowPositioned);
		return this;
	}
	
	public AbstractBuilder setErgoChairs(boolean isErgoChairs) {
		reservation.setErgoChairs(isErgoChairs);
		return this;
	}



	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) {
		 reservation.setDecoratedTable(isDecoratedTable);
		 return this;
	}



	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) {
		reservation.setAmbientalMusic(isAmbientalMusic);
		return this;
	}

	

	public AbstractBuilder setMusicType(String musicType) {
		reservation.setMusicType(musicType);
		return this;
	}
	
	
}
