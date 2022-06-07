package hust.soict.dsai.aims.disc;

public class Track  implements Playable{
	private String title;
	private int length;
	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
		super();
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}

}
