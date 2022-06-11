package hust.soict.dsai.test.disc;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.*;

public class CDtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Track> tracks = new ArrayList<Track>();
		CompactDisc cd1 = new CompactDisc("ST list", "vpop", 12.22f, tracks, "Son Tuong mtp");
		Track t1 = new Track("em cua..", 240);
		Track t2 = new Track("em cua..", 240);
		Track t3 = new Track("chung ta..", 240);
		Track t4 = new Track("muon roi..", 260);
		Track t5 = new Track("em cua..", 240);
		cd1.addTrack(t1);
		cd1.addTrack(t2);
		cd1.addTrack(t3);
		cd1.addTrack(t4);
		cd1.addTrack(t5);
		Track t6 = new Track("chung ta..", 240);
		Track t7 = new Track("chun ta..", 240);
		Track t8 = new Track("aaa", 240);
		cd1.addTrack(t6);
		cd1.removeTrack(t6);
		cd1.addTrack(t7);
		cd1.removeTrack(t8);
		for(int i=1; i<=tracks.size(); i++) {
			System.out.println(tracks.get(i-1).getTitle());
		}
		cd1.play();
		
	}

}
