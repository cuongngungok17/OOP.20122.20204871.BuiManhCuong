package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;

public class BookTest {

	public BookTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> media = new ArrayList<Media>();
		
		List<String> authors = new ArrayList<String>();
		
		String content = "toi la cuong. toi chao cac ban";
		Book b = new Book("Calculus", "maths",1000f, authors, content);
		b.setContent(content);
		b.addAuthor("bui");
		//b.addAuthor("manh");
		//b.addAuthor("cuong");
		
		String content1 = "Calculus is the easiest subject in the world. Everyone can learn calculus easily";
		Book b1 = new Book("Calculus", "Maths", 1000f, authors, content1);
		b1.setContent(content1);
		b1.addAuthor("Cuong");
		media.add(b);
		media.add(b1);
		for(Media m:media) {
			System.out.println(m.toString());
		}
	}

}
