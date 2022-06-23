package hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.Playable;
import hust.soict.dsai.aims.disc.Track;
import hust.soict.dsai.aims.media.Media;

public class MediaStore extends JPanel implements ActionListener{
	private Media media;
	
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		if (media instanceof Playable) {
			JButton playButton  = new JButton("Play");
			playButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JDialog frame = new JDialog();
					//frame.setLayout(new GridLayout(200,100,1,10));
					frame.setTitle("Play");
					JPanel panel = new JPanel();
					panel.add(new JLabel("Play "+media.getTitle()+"\n"));
					if (media instanceof CompactDisc) {
						CompactDisc cd = (CompactDisc) media;
						for (int i=0; i<cd.getTracks().size();i++) {
							panel.add(new JLabel("Play "+cd.getTracks().get(i).getTitle()+"\n"));
						}
					}
					frame.add(panel);
					frame.setSize(200,100);
					frame.setVisible(true);
				}
			});
			container.add(playButton);
			
			//playButton.setActionCommand("Play");
			//playButton.addActionListener(this);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}

	
	

}
