package hust.soict.dsai.aims.disc;
import java.time.LocalDate;
public class DigitalVideoDisc {
	
	public DigitalVideoDisc(String title) {
		super();
		this.id = ++nbDigitalVideoDiscs;	
		this.title = title;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.id = ++nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private LocalDate dateAdded;
	private static int nbDigitalVideoDiscs = 0;
	public final int id;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return "DVD - "+title+" - "+category+" - "+director+" - "+length+": "+cost+"$";
	}
	public boolean isMatch(String tit) {
		boolean result=false;
		for (int i=0; i<=title.length()-1;i++) {
			for (int j=i+1; j<=title.length();j++) {
				if (tit.equals(title.substring(i, j))) {
					result=true;
				}
			}
		}
		return result;
	}
	
	
}
