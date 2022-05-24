package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {

	private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore.add(disc);
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		itemsInStore.remove(disc);
	}
	
	public void printStore() {
		for (int i=0; i<itemsInStore.size();i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return itemsInStore.size();
	}

	public DigitalVideoDisc get(int i) {
		// TODO Auto-generated method stub
		return itemsInStore.get(i);
	}
}
