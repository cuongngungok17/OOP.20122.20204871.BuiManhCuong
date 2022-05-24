package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String outputString = "";
		String filename = "test.exe";
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		for (byte b : inputBytes) {
			outputString +=(char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
