package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.disc.Track;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
public class StoreManagerScreen extends JFrame {
	private Store store;
	public StoreManagerScreen(Store store) {
		this.store = store;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		
		JMenu menu = new JMenu("options");
		menu.add(new JMenuItem("View store"));
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addbook = new JMenuItem("Add Book");
		addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Media book = new Book("",0f);
				AddBookToStoreScreen ab = new AddBookToStoreScreen();
				//store.addMedia(ab.addmedia());
				//MediaStore ms = new MediaStore(ab.addmedia(book));
				//MediaScreen ms = newMedia
				//ab.setVisible(true);
				//setVisible(false);
				//this.dispose();
			}
		});
		
		smUpdateStore.add(addbook);
		
		JMenuItem addcd = new JMenuItem("Add CD");
		addcd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCompactDiscToStoreScreen ac = new AddCompactDiscToStoreScreen();
				ac.setVisible(true);
				//setVisible(false);
				//this.dispose();
			}
		});
		smUpdateStore.add(addcd);
		
		JMenuItem adddvd = new JMenuItem("Add DVD");
		adddvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDigitalVideoDiscToStoreScreen ad = new AddDigitalVideoDiscToStoreScreen();
				ad.setVisible(true);
				//setVisible(false);
				//this.dispose();
			}
		});
		smUpdateStore.add(adddvd);
		menu.add(smUpdateStore);
		
				
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		//MediaStore ms = new MediaStore(AddItemToStoreScreen().addmedia)
		center.setLayout(new GridLayout(3,3,2,2));
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i=0; i<mediaInStore.size();i++) {
		MediaStore cell = new MediaStore(mediaInStore.get(i));	
		center.add(cell);
		}
		return center;
	}
	
	
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd0 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd0);
		List<String> authors = new ArrayList<String>();
		String content1 = "Toi la cuong. Chao cac ban";
		String content2 = "Calculus is the easiest subject in the world. Everyone can learn calculus easily";
		String content3 = "Algebra is the second. Algebra is very easy. You can't fail it";
		Book b1 = new Book("Calculus 1","maths",15.55f, authors, content1);
		Book b2 = new Book("Calculus 1","maths",15.55f, authors, content2);
		Book b3 = new Book("Algebra","maths",15.55f, authors, content3);
		b1.addAuthor("Bui");
		b2.addAuthor("Manh");
		b3.addAuthor("Cuong");
		b1.setContent(content1);
		b2.setContent(content2);
		b3.setContent(content3);
		
		ArrayList<Track> tracks = new ArrayList<Track>();
		CompactDisc cd1 = new CompactDisc("ST list", "vpop", 12.22f, tracks, "Son Tuong mtp");
		Track t1 = new Track("Em cua..", 240);
		Track t2 = new Track("Em cua..", 240);
		Track t3 = new Track("Chung ta..", 240);
		Track t4 = new Track("Muon roi..", 260);
		cd1.addTrack(t1);
		cd1.addTrack(t2);
		cd1.addTrack(t3);
		cd1.addTrack(t4);
		
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		CompactDisc cd2 = new CompactDisc("Big bang", "kpop", 12.22f, tracks1, "g rong");
		store.addMedia(cd1);
		store.addMedia(b1);
		store.addMedia(b2);
		store.addMedia(b3);
		store.addMedia(cd2);
		new StoreManagerScreen(store);
		
	}
	
	
}
