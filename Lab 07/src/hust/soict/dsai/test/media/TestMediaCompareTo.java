package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("aaaa",
				"cccc", "Roger Allers", 87, 19.95f);
		collection.add(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("bbbb",
				"zzzz", "George Lucas", 87, 24.95f);
		collection.add(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("bbbb",
				"mmmm", 19.95f);
		collection.add(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("bbbb",
				"ssss", 20.95f);
		collection.add(dvd4);
		
		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		
		System.out.println("------------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		while (iterator.hasNext()) {
			System.out.println
			(((DigitalVideoDisc) iterator.next()).getCategory());
		}
		
		java.util.Collections.sort(collection, Media.COMPARE_BY_COST_TITLE);
		iterator = collection.iterator();
		System.out.println("------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while (iterator.hasNext()) {
			System.out.println
			(((DigitalVideoDisc) iterator.next()).getCategory());
		}
		System.out.println("------------------------------------");
	}

}
