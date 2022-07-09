package hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;


public class AddItemToStoreScreen  extends JFrame{
	//protected final StoreManagerScreen sms = new StoreManagerScreen();
	private JTextField title;
	private JTextField cost;
	public AddItemToStoreScreen() {
		//this.sms = sms;
		Container cp = getContentPane();
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.setLayout(new GridLayout(2,2));
		setTitle("Add Item");
		
		cp.add(new Label("Add title: "));
		title = new JTextField(10);
		cp.add(title);
		
		cp.add(new Label("Add cost: "));
		cost = new JTextField(10);
		cp.add(cost);
		//title.addActionListener(new TFInputListener());
		
		setTitle("Add Item");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		Media dvd = new DigitalVideoDisc("", 0f);
		title.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd.setTitle(title.getText());
			}
		});
		
		cost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dvd.setCost(Float.parseFloat(cost.getText()));
			}
		});
		//MediaStore ms = new MediaStore(dvd);
		//sms.createCenter(ms);
		
	}
	
	

	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("options");
		JMenuItem viewstore = new JMenuItem("View Store");
		menu.add(viewstore);
		viewstore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Store store = new Store();
				StoreManagerScreen sms = new StoreManagerScreen(store);
				store.addMedia(addmedia());
				sms.createCenter();
				sms.setVisible(true);
				
				//setVisible(false);
				dispose();
			}
		});
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addbook = new JMenuItem("Add Book");
		smUpdateStore.add(addbook);
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		menu.add(smUpdateStore);
		
				
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	public Media addmedia() {
		Media media1 = new DigitalVideoDisc("",0f);
		media1.setTitle(title.getText());
		media1.setCost(Float.parseFloat(cost.getText()));
		return media1;
		
	}
	//public static void main(String[] args) {
	//	new AddItemToStoreScreen();
	//}

}
