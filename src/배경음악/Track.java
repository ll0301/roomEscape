package 배경음악;

public class Track {

	private String 메인음악;
	public String get메인음악() {
		return 메인음악;
	}
	public void set메인음악(String 메인음악) {
		this.메인음악 = 메인음악;
	}
	public String get그외음악() {
		return 그외음악;
	}
	public void set그외음악(String 그외음악) {
		this.그외음악 = 그외음악;
	}
	private String 그외음악;
	
	
	public Track(String 메인음악, String 그외음악) {
		super();
		this.메인음악 = 메인음악;
		this.그외음악 = 그외음악;
	}
	
	
	
	
}

