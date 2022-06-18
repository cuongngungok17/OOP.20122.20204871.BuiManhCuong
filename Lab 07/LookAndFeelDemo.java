package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.util.*;

public class LookAndFeelDemo extends JFrame{

	public LookAndFeelDemo() {
		addDemoComponents();
		addLookAndFeelComboBox();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(380, 100);
		setVisible(true);
	}
	
	void addDemoComponents() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Label:"));
		cp.add(new JTextField("Text field"));
		cp.add(new JRadioButton("Radio button"));
		cp.add(new JButton("Button"));
	}
	
	void addLookAndFeelComboBox() {
		Container cp = getContentPane();
		cp.add(new JLabel("Change Look and Feel Here: "));
		
		ArrayList <LookAndFeelInfo> lafInfos = new ArrayList<LookAndFeelInfo>();
		for (int i=0; i<UIManager.getInstalledLookAndFeels().length; i++) {
			lafInfos.add(UIManager.getInstalledLookAndFeels()[i]);
		}
		
		//lafInfos.add((LookAndFeelInfo) UIManager.getC());
		String[] lafNames = new String[lafInfos.size()];
		for (int i=0; i<lafInfos.size(); i++) {
			lafNames[i] = lafInfos.get(i).getName();
		}
		JComboBox cbLookAndFeel = new JComboBox(lafNames);
		cp.add(cbLookAndFeel);
		
		JFrame frame = this;
		cbLookAndFeel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				int index = cbLookAndFeel.getSelectedIndex();
				try {
					UIManager.setLookAndFeel(lafInfos.get(index).getClassName());
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(frame);
				setTitle(lafInfos.get(index).getName()+" Look And Feel");
			}
		});
	}
	
	public static void main(String[] args) {
		new LookAndFeelDemo();
	}

}
