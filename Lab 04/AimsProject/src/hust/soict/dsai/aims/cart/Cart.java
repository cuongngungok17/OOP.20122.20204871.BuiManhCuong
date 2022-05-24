package hust.soict.dsai.aims.cart;
import java.util.*;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(disc);
			qtyOrdered+=1;
		}
	
	}
	
	public float totalCost() {
		float sum=0;
		for (int i=1;i<= itemsOrdered.size(); i++) {
			sum+= itemsOrdered.get(i-1).getCost();
		}
		return sum;
	}
	public int removeDigitalVideoDisc() {
		int numremov;
		List<DigitalVideoDisc> newlist = new ArrayList<DigitalVideoDisc>();
		for(int i=0; i<=itemsOrdered.size()-2; i++) {
			int dup=0;
			for (int j=i+1; j<=itemsOrdered.size()-1; j++) {
				if (itemsOrdered.get(i).getTitle()==itemsOrdered.get(j).getTitle()) {
					dup+=1;
				}
			}
			if (dup==0) {
				newlist.add(itemsOrdered.get(i));
			}
		}
		numremov = itemsOrdered.size()-newlist.size()-1;
		return numremov;
	}
	//Overloading by differing types of parameter
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		for (int i=0; i<=dvdlist.length-1; i++) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered.add(dvdlist[i]);
				qtyOrdered+=1;
			}
			else {
				break;
			}
			
		}
	
		
	
	}
	
	// Overloading by differing the number of parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2, DigitalVideoDisc dvd3) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(dvd1);
			qtyOrdered+=1;
		}
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(dvd2);
			qtyOrdered+=1;
		}
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(dvd3);
			qtyOrdered+=1;
		}
	
	}
	
	public void removeDisc(DigitalVideoDisc disc) {
		itemsOrdered.remove(disc);
	}
	
	public void sortTitle() {
		Comparator<DigitalVideoDisc> printComparator = 
				Comparator.comparing(DigitalVideoDisc::getTitle)
				.thenComparing(Comparator.comparing(DigitalVideoDisc::getCost).reversed());
		Collections.sort(itemsOrdered, printComparator);
		System.out.println("sort Cart by Title: ");
		for (int i=0; i<itemsOrdered.size(); i++) {
			System.out.println("ID "+itemsOrdered.get(i).getId()+": "+itemsOrdered.get(i).toString());
		}
		
	}
	public void sortCost() {
		Comparator<DigitalVideoDisc> printComparator = 
				Comparator.comparing(DigitalVideoDisc::getCost)
				.thenComparing(Comparator.comparing(DigitalVideoDisc::getCost).reversed())
				.thenComparing(DigitalVideoDisc::getTitle);
		Collections.sort(itemsOrdered, printComparator);
		
		System.out.println("sort Cart by Cost: ");
		for (int i=0; i<itemsOrdered.size(); i++) {
			System.out.println("ID "+itemsOrdered.get(i).getId()+": "+itemsOrdered.get(i).toString());
		}
		
	}
	
	public void sortID() {
		Collections.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {

			@Override
			public int compare(DigitalVideoDisc o1, DigitalVideoDisc o2) {
				int result = 0;
				if (o1.getId()==o2.getId()) {
					result = 0;
				}
				if (o1.getId()<o2.getId()) {
					result = -1;
				}
				if (o1.getId()>o2.getId()) {
					result = 1;
				}
				return result;
				
			}
			
		});
		
		System.out.println("sort Cart by ID: ");
		for (int i=0; i<itemsOrdered.size(); i++) {
			System.out.println("ID "+itemsOrdered.get(i).getId()+": "+itemsOrdered.get(i).toString());
		}
		
	}
	
	public void findID() {
		int ID;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the ID: ");
		ID = scanner.nextInt();
		if ((ID>itemsOrdered.size())||(ID<=0)) {
			System.out.println("there is no dvd sastified in the cart!");
		}
		else {
			for (int i=0; i<itemsOrdered.size(); i++) {
				if (itemsOrdered.get(i).getId()==ID) {
					System.out.println(itemsOrdered.get(i).toString());
					break;
				}
			}
		}
	}
	public void print() {
		Comparator<DigitalVideoDisc> printComparator = 
				Comparator.comparing(DigitalVideoDisc::getTitle)
				.thenComparing(Comparator.comparing(DigitalVideoDisc::getCost).reversed())
				.thenComparing(Comparator.comparing(DigitalVideoDisc::getLength).reversed());
		Collections.sort(itemsOrdered, printComparator);
		
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i=0; i<itemsOrdered.size(); i++) {
			System.out.println((i+1)+". "+itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: "+totalCost());
		System.out.println("***************************************************");
		
	}
	
	public void findbyTitle(String tit) {
		int count = 0;
		for (int i=0; i<itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).isMatch(tit)==true) {
				count+=1;
				System.out.println(itemsOrdered.get(i).toString());
			}
		}
		if (count == 0) {
			System.out.println("No match is found!");
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return itemsOrdered.size();
	}
}
