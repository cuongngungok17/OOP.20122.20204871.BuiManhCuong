package hust.soict.dsai.aims.utils;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDUtils {
	public static String compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String result = "";
		if(dvd1.getCost() < dvd2.getCost()){
			result = "First DVD has higher Cost!";
		}
		if(dvd1.getCost() > dvd2.getCost()) {
			result = "Second DVD has higher Cost!";
		}
		if(dvd1.getCost() == dvd2.getCost()) {
			result = "2 DVD have same Cost";
		}
		return result;
	}
	
	public static String compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String result = "";
		if(dvd1.getTitle().equals(dvd2.getTitle())){
			result = "Two DVD are equal by Title!";
		}
		if(dvd1.getTitle().compareTo(dvd2.getTitle())<0) {
			result = "First DVD has order before Second DVD by Title!";
		}
		if(dvd1.getTitle().compareTo(dvd2.getTitle())>0) {
			result = "First DVD has order after Second DVD by Title!";
		}
		return result;
	}
	
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] sorted) {
		for(int i=0; i<sorted.length-1; i++) {
			DigitalVideoDisc tmp= null;
			for(int j=i+1; j<sorted.length;j++) {
				if (sorted[i].getTitle().compareTo(sorted[j].getTitle())>0) {
					tmp = sorted[i];
					sorted[i]=sorted[j];
					sorted[j]=tmp;
				}
			}
			
		}
		
		return sorted;
		
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] sorted) {
		for(int i=0; i<sorted.length-1; i++) {
			DigitalVideoDisc tmp= null;
			for(int j=i+1; j<sorted.length;j++) {
				if (sorted[i].getCost()>sorted[j].getCost()) {
					tmp = sorted[i];
					sorted[i]=sorted[j];
					sorted[j]=tmp;
				}
			}
			
		}
		
		return sorted;
		
	}
	
	
	
}

