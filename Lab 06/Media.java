package hust.soict.dsai.aims.media;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
	
	protected final int id;
	protected String title;
	protected String category;
	protected float cost;
	private LocalDate dateAdded;
	private static int nbMedia = 0;
	
	public Media(String title, String category, float cost) {
		this.id = ++nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
		// TODO Auto-generated constructor stub
	}
	
	public Media(String title) {
		super();
		this.id = ++nbMedia;
		this.title = title;
		this.dateAdded = LocalDate.now();
	}

		
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}
	
	public boolean isMatch(String tit) {
		boolean result=false;
		for (int i=0; i<=title.length()-1;i++) {
			for (int j=i+1; j<=title.length();j++) {
				if (tit.equals(title.substring(i, j))) {
					result=true;
				}
			}
		}
		return result;
	}
	
	public String toString() {
		return "Media: "+title+" "+category+" "+cost;
	}
	
	public boolean equals(Object o) {
		if (((Media) o).getId()==this.id) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Media obj) {
		if (this.title.equals(obj.getTitle())) {
			return this.getCategory().compareTo(obj.getCategory());
		}
		return this.getTitle().compareTo(obj.getTitle());
	}
	
	public static class MediaComparatorByTitleCost implements Comparator<Media>{
		public int compare(Media o1, Media o2) {
			if (o1.getTitle().equals(o2.getTitle())) {
				if (o1.getCost()>o2.getCost()) {
					return -1;
				}
				if (o1.getCost()<o2.getCost()) {
					return 1;
				}
				if (o1.getCost()==o2.getCost()) {
					return 0;
				}
			}
			return o1.getTitle().compareTo(o2.getTitle());
		}
	}
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	
	public static class MediaComparatorByCostTitle implements Comparator<Media>{
		public int compare(Media o1, Media o2) {
			int com = 0;
			if (o1.getCost()==o2.getCost()) {
				com = o1.getTitle().compareTo(o2.getTitle());
			}
			if (o1.getCost()>o2.getCost()) {
				com = -1;
			}
			if (o1.getCost()<o2.getCost()) {
				com = 1;
			}
			return com;
		}
	}
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();
}
