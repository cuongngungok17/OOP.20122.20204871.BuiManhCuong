package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.disc.Track;
import hust.soict.dsai.aims.media.Book;

public class DiskTest {

	public static void main(String[] args) throws LimitExceededException {
		
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Harry",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Porter",
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 19.95f);
		cart.addMedia(dvd3);
		//List<String> authors = new ArrayList<String>();
		//Book b = new Book("calculus 1","maths",15.55f, authors);
		//b.addAuthor("bui");
		//b.addAuthor("manh");
		//b.addAuthor("cuong");
		ArrayList<Track> tracks = new ArrayList<Track>();
		CompactDisc cd1 = new CompactDisc("ST list", "vpop", 12.22f, tracks, "Son Tuong mtp");
		Track t1 = new Track("em cua..", 240);
		Track t2 = new Track("em cua..", 240);
		Track t3 = new Track("chung ta..", 240);
		Track t4 = new Track("muon roi..", 260);
		cd1.addTrack(t1);
		cd1.addTrack(t2);
		cd1.addTrack(t3);
		cd1.addTrack(t4);
		cart.addMedia(cd1);
		//cart.addMedia(b);
		
		cart.findbyTitle("Harry");
		cart.totalCost();
	}

}
