package hust.soict.dsai.aims.disc;
import java.time.LocalDate;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	private LocalDate dateAdded;
	
	public DigitalVideoDisc(String title) {
		super(title);
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		this.dateAdded = LocalDate.now();
	}
	
	
	public DigitalVideoDisc(String title, float cost) {
		super(title, cost);
		// TODO Auto-generated constructor stub
	}
	public LocalDate getDateAdded() {
		return dateAdded;
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
	
	public void play() throws PlayerException {
		if (this.getLength()>0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		else {
			throw new PlayerException("ERROR: DVD length is non-positive");
		}
	}

}
