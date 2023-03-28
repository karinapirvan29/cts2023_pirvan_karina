package ro.ase.builder;

public interface AbstractBuilder {

	public abstract Reservation getReservation();
	
	public AbstractBuilder setIsWindowPositioned(boolean isWindowPositioned) ;
	
	public AbstractBuilder setErgoChairs(boolean isErgoChairs) ;

	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable);

	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic);
	
	public AbstractBuilder setMusicType(String musicType) ;
}
