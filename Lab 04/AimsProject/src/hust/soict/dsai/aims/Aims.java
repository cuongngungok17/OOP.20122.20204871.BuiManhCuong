package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addDVD(dvd1);
		DigitalVideoDisc dvd0 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addDVD(dvd0);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alain",
				"Animation", 18.99f);
		store.addDVD(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		store.addDVD(dvd4);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladn",
				"Animation", 18.99f);
		store.addDVD(dvd5);
		showMenu(store, cart);
	}
	
	public static void showMenu(Store store, Cart cart) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		int a = scanner.nextInt();
		switch(a) {
		case 0:
			System.out.println("Exit!");
			break;
		case 1:
			storeMenu(store, cart);
			break;
		case 2:
			String title;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the title of DVD you want to remove:");
			title = sc.nextLine();
			int count = 0;
			for (int i=0; i<store.size(); i++) {
				if (store.get(i).isMatch(title)==true) {
					count+=1;
					store.removeDVD(store.get(i));
				}
			}
			if (count==0) {
				System.out.println("No DVD has this title!");
			}
			if (count>0) {
				System.out.println("The DVD has removed!");
			}
			System.out.println("press 1 to back");
			int n = scanner.nextInt();
			showMenu(store, cart);
			break;
		case 3:
			cartMenu(store, cart);
			break;
		}
	}
	
	public static void storeMenu(Store store, Cart cart) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a DVD's details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		int b = scanner.nextInt();
		switch(b) {
		case 0:
			showMenu(store, cart);
			break;
		case 1:
			store.printStore();
			System.out.println("press 1 to back");
			int c = scanner.nextInt();
			storeMenu(store, cart);
			break;
		case 2:
			String title;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the title of DVD you choose: ");
			title = sc.nextLine();
			int count = 0;
			for (int i=0; i<store.size(); i++) {
				if (store.get(i).isMatch(title)==true) {
					count+=1;
					cart.addDigitalVideoDisc(store.get(i));
					store.removeDVD(store.get(i));
				}
			}
			if (count==0) {
				System.out.println("No DVD has this title!");
			}
			if (count>0) {
				System.out.println("The DVD has added!");
			}
			System.out.println("The number of DVDs in the cart: "+cart.size());
			System.out.println("press 1 to back");
			int d = sc.nextInt();
			storeMenu(store, cart);
			break;
		case 3:
			cart.print();
			System.out.println("press 1 to back");
			int e = scanner.nextInt();
			storeMenu(store, cart);
			break;
		}
	}
	public static void cartMenu(Store store, Cart cart) {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter DVDs incart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner scanner = new Scanner(System.in);
		int f = scanner.nextInt();
		switch(f) {
		case 0:
			showMenu(store, cart);
			break;
		case 1:
			System.out.println("Press 1 to sort by ID or Press 2 to sort by title:");
			int g = scanner.nextInt();
			switch(g) {
			case 1:
				cart.sortID();
				break;
			case 2:
				cart.sortTitle();
				break;
			}
			System.out.println("press 1 to back");
			int h = scanner.nextInt();
			cartMenu(store, cart);
			break;
		case 2:
			System.out.println("Press 1 to sort by title or Press 2 to sort by cost:");
			int i = scanner.nextInt();
			switch(i) {
			case 1:
				cart.sortTitle();
				break;
			case 2:
				cart.sortCost();
				break;
			}
			System.out.println("press 1 to back");
			int k = scanner.nextInt();
			cartMenu(store, cart);
			break;
		case 3:
			System.out.println("Enter the title of DVD you want to remove:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the title of DVD you want to remove:");
			String title = sc.nextLine();
			for (int j=0; j<store.size(); j++) {
				if (store.get(j).isMatch(title)==true) {
					store.addDVD(store.get(j));
					cart.removeDisc(store.get(j));
				}
			}
			System.out.println("press 1 to back");
			int l = scanner.nextInt();
			cartMenu(store, cart);
			break;
		case 4:
			System.out.println("An order is created!");
			cart = new Cart();
			System.out.println("press 1 to back");
			int m = scanner.nextInt();
			cartMenu(store, cart);
			break;
		}
	}
	
}
