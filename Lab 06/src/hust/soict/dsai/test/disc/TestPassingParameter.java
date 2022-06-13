package hust.soict.dsai.test.disc;
import java.util.*;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Ciderella");
		
		System.out.println("jungle dvd title: "+jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+jungleDVD.getTitle());
		cinderellaDVD.play();
		String content = "toi la cuong. Toi chao ban";
        String[] arrOfStr = content.split("\\. ");
        List<String> w = new ArrayList<String>();
        for (String a : arrOfStr) {
        	String[] c = a.split(" ");
        	for (String i : c) {
        		w.add(i.toLowerCase());
        	}
        }
        Set<String> setA = new TreeSet<String>();
        for (String j:w){
            setA.add(j);
        }
        for(String k:setA){
            System.out.println(k);
        } 
        String x = "Cuong";
        String y= x.toLowerCase();
        System.out.println(y);
            
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc (oldTitle);
	}
	
        
}
