package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media{
	
	private List<String> author = new ArrayList<String>();
	
	public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
	}

	public List<String> getAuthor() {
		return author;
	}
	public void addAuthor(String authors) {
		if (author.contains(authors)==false) {
			author.add(authors);
		}
		else {
			System.out.println("this author was exist!");
		}
	}
	
	public void removeAuthor(String authors) {
		if (author.contains(authors)==true) {
			author.remove(authors);
		}
		else {
			System.out.println("this author was  not exist!");
		}
	}
	
	public String toString() {
		return id+" Book - "+title+" - "+category+": "+cost+"$";
	}
	
}
