package ro.ase.builder;

public class BuilderB2 implements AbstractBuilder{
	
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;
	
	public BuilderB2() {
		isWindowPosition=false;
		isErgoChairs=false;
		isDecoratedTable=false;
		isAmbientalMusic=false;
		musicType=null;
	}

	@Override
	public Reservation getReservation() {
		return  new Reservation(isWindowPosition,isErgoChairs,isDecoratedTable,isAmbientalMusic,
				musicType);
	}

	@Override
	public AbstractBuilder setIsWindowPositioned(boolean isWindowPositioned) {
		this.isWindowPosition=isWindowPositioned;
		return this;
	}

	@Override
	public AbstractBuilder setErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs=isErgoChairs;
		return this;
	}

	@Override
	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) {
		this.isDecoratedTable=isDecoratedTable;
		return this;
	}

	@Override
	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic=isAmbientalMusic;
		return this;
	}

	@Override
	public AbstractBuilder setMusicType(String musicType) {
		this.musicType=musicType;
		return this;
	}

}
