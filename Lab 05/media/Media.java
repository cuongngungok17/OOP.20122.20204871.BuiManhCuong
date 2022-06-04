package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public abstract class Media {
	
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

}
