package ro.ase.builder;

public class Reservation {

	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;
	
	public Reservation(boolean isWindowPosition, boolean isErgoChairs, boolean isDecoratedTable,
			boolean isAmbientalMusic, String musicType) {
		super();
		this.isWindowPosition = isWindowPosition;
		this.isErgoChairs = isErgoChairs;
		this.isDecoratedTable = isDecoratedTable;
		this.isAmbientalMusic = isAmbientalMusic;
		this.musicType = musicType;
	}

	protected boolean isWindowPosition() {
		return isWindowPosition;
	}

	protected void setWindowPosition(boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
	}

	protected boolean isErgoChairs() {
		return isErgoChairs;
	}

	protected void setErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
	}

	protected boolean isDecoratedTable() {
		return isDecoratedTable;
	}

	protected void setDecoratedTable(boolean isDecoratedTable) {
		this.isDecoratedTable = isDecoratedTable;
	}

	protected boolean isAmbientalMusic() {
		return isAmbientalMusic;
	}

	protected void setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
	}

	protected String getMusicType() {
		return musicType;
	}

	protected void setMusicType(String musicType) {
		this.musicType = musicType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [isWindowPosition=");
		builder.append(isWindowPosition);
		builder.append(", isErgoChairs=");
		builder.append(isErgoChairs);
		builder.append(", isDecoratedTable=");
		builder.append(isDecoratedTable);
		builder.append(", isAmbientalMusic=");
		builder.append(isAmbientalMusic);
		builder.append(", musicType=");
		builder.append(musicType);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
