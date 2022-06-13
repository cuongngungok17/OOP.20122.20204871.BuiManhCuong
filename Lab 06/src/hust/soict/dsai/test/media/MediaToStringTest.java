package hust.soict.dsai.test.media;

import java.util.*;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.disc.Track;
import hust.soict.dsai.aims.media.*;

public class MediaToStringTest {

	public static void main (String[] args) {
		List<Media> media = new ArrayList<Media>();
		
		ArrayList<Track> tracks = new ArrayList<Track>();
		CompactDisc cd1 = new CompactDisc("ST list", "vpop", 12.22f, tracks, "Son Tuong mtp");
		Track t2 = new Track("em cua..", 240);
		Track t3 = new Track("chung ta..", 240);
		Track t4 = new Track("muon roi..", 260);
		Track t5 = new Track("em cua..", 240);
		cd1.addTrack(t2);
		cd1.addTrack(t3);
		cd1.addTrack(t4);
		cd1.addTrack(t5);
		Track t6 = new Track("chung ta..", 240);
		cd1.addTrack(t6);
		
		List<String> authors = new ArrayList<String>();
		
		String content = "toi la cuong. toi chao cac ban";
		Book b = new Book("Calculus", "maths",1000f, authors, content);
		b.setContent(content);
		b.addAuthor("bui");
		//b.addAuthor("manh");
		//b.addAuthor("cuong");
		
		String content1 = "Toi la cuong. Chao cac ban";
		Book b1 = new Book("Calculus", "Maths", 1000f, authors, content1);
		b1.setContent(content1);
		b1.addAuthor("Cuong");
		//System.out.println(b.getContent());
		//System.out.println(b.getContentTokens());
		//System.out.println(b.getWordFrequency());
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("aaaa", "bbbb", "cuong", 100, 150f);
		
		media.add(cd1);
		media.add(b);
		media.add(dvd);
		media.add(b1);
		//media.add(b2);
		//media.add(b3);
		for(Media m:media) {
			System.out.println(m.toString());
		}
	}

}
