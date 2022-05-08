
public class Aims {

	public static void main(String[] args) {
		Cart anOrdered = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrdered.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd0 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrdered.addDigitalVideoDisc(dvd0);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrdered.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrdered.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrdered.addDigitalVideoDisc(dvd4);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladn",
				"Animation", 18.99f);
		anOrdered.addDigitalVideoDisc(dvd5);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Sta Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd14 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd15 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd16 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd17 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd18 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd19 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd20 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd21 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd22 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd23 = new DigitalVideoDisc("The Lio King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrdered.addDigitalVideoDisc(dvd8);
		anOrdered.addDigitalVideoDisc(dvd9);
		anOrdered.addDigitalVideoDisc(dvd10);
		anOrdered.addDigitalVideoDisc(dvd11);
		anOrdered.addDigitalVideoDisc(dvd12);
		anOrdered.addDigitalVideoDisc(dvd13);
		anOrdered.addDigitalVideoDisc(dvd14);
		anOrdered.addDigitalVideoDisc(dvd15);
		anOrdered.addDigitalVideoDisc(dvd16);
		anOrdered.addDigitalVideoDisc(dvd17);
		anOrdered.addDigitalVideoDisc(dvd18);
		anOrdered.addDigitalVideoDisc(dvd19);
		anOrdered.addDigitalVideoDisc(dvd20);
		anOrdered.addDigitalVideoDisc(dvd21);
		anOrdered.addDigitalVideoDisc(dvd22);
		anOrdered.addDigitalVideoDisc(dvd7, dvd6, dvd23);
		System.out.println("Total cost is: ");
		System.out.println(anOrdered.totalCost());
		System.out.println("Number of remove discs: ");
		System.out.println(anOrdered.removeDigitalVideoDisc());
	}

}
