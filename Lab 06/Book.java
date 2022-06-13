package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media{
	
	private List<String> author = new ArrayList<String>();
	private String content = "";
	
	
	public Book(String title, String category, float cost, List<String> author, String content) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.author = author;
		this.content = content;
		
		
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
		String s = "";
		s+="Book - "+title+" - "+category+": "+cost+"$";
		s+="\n    Authors:";
		for (int i=0; i<author.size(); i++) {
			s+="\n    "+author.get(i);
		}
		s+="\n    Length: "+processContent(content).size();
		s+="\n    Token list: "+processContent(content);
		s+="\n    Word frequency: "+ProcessContent(content);
		return s;
	}

	public List<String> processContent(String content) {
		String[] arrOfStr = content.split("\\. ");
        List<String> w = new ArrayList<String>();
        for (String a : arrOfStr) {
        	String[] c = a.split(" ");
        	for (String i : c) {
        		w.add(i.toLowerCase());
        	}
        }
        return w;
	}
	
	public Map<String, Integer> ProcessContent(String content){
		String[] arrOfStr = content.split("\\. ");
        List<String> w = new ArrayList<String>();
        for (String a : arrOfStr) {
        	String[] c = a.split(" ");
        	for (String i : c) {
        		w.add(i.toLowerCase());
        	}
        }
        
        Map<String, Integer> map = new HashMap<String, Integer>();
		Integer ONE = Integer.valueOf(1);
        for (int i=0; i<w.size(); i++){
            String key = w.get(i);
            Integer freq = map.get(key);
            if (freq==null){
                freq=ONE;
            }
            else{
                int value = freq.intValue();
                freq = Integer.valueOf(value+1);
            }
            map.put(key, freq);
        }
        Map sortedMap = new TreeMap(map);
        return sortedMap;
	}
	//private List<String> contentTokens;
	//private Map<String, Integer> wordFrequency;


	//public String getContent() {
	//	return content;
	//}

	//public List<String> getContentTokens() {
	//	this.contentTokens = processContent(content);
	//	return contentTokens;
	//}

	//public Map<String, Integer> getWordFrequency() {
	//	this.wordFrequency = ProcessContent(content);
	//	return wordFrequency;
	//}

	public void setContent(String content) {
		this.content = content;
	}
}
