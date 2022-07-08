package javacallfromdw;

import java.util.Random;

public class Testdataweave {
	public static String appendRandom(String abcd) {
		return abcd + "-"+ new Random().nextInt();
		
	}

}
