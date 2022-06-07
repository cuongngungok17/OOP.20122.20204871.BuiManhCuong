package hust.soict.dsai.aims.disc;

import java.util.*;

public class CompactDisc extends Disc implements Playable{
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String artist;
	
	public CompactDisc(String title, String category, float cost, ArrayList<Track> tracks, String artist) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.artist=artist;
		this.tracks=tracks;
	}

	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		int count = 0;
		for (int i=1; i<=tracks.size(); i++) {
			if (track.getTitle().equals(tracks.get(i-1).getTitle())==true) {
				count+=1;
			}
		}
		if (count==0) {
			tracks.add(track);
		}
		else {
			System.out.println("The track you want to add was exist!");
		}
	}
	
	public void removeTrack(Track track) {
		int count = 0;
		for (int i=1; i<=tracks.size(); i++) {
			if (track.getTitle().equals(tracks.get(i-1).getTitle())) {
				count+=1;
				tracks.remove(tracks.remove(i-1));
			}
		}
		if(count==0) {
			System.out.println("the track you want to remove was not exist!");
		}
	}
	
	public int getLength() {
		int sum=0;
		if (tracks==null) {
			sum=0;
		}
		else {
			for (int i=1;i<= tracks.size(); i++) {
				sum+= tracks.get(i-1).getLength();
			}
		}
		
		return sum;
	}
	
	public String toString() {
		return id+" CD - "+title+" - "+category+" - "+artist+" - "+getLength()+": "+cost+"$";
	}
	
	public void play() {
		for (int i=1; i<=tracks.size(); i++) {
			tracks.get(i-1).play();
		}
	}
}
