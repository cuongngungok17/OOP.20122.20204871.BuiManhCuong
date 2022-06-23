package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;


import hust.soict.dsai.aims.media.Media;

public class Store {

	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public void addMedia(Media med) {
		itemsInStore.add(med);
	}
	
	public void removeMedia(Media med) {
		itemsInStore.remove(med);
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

	public Media get(int i) {
		// TODO Auto-generated method stub
		return itemsInStore.get(i);
	}

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	
}
