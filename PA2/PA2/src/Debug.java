//Author: Syth Ryan

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Debug {

	public static void main(String[] args) {	
		NearDuplicates myNear = new NearDuplicates();
		
		System.out.println(myNear.nearDuplciateDetector("C:/Users/Syth/Documents/GitHub/PA2/PA2/src/PA2Test/F16PA2/F16PA2", 50, 0.9, "baseball11.txt"));
		System.out.println(myNear.nearDuplciateDetector("C:/Users/Syth/Documents/GitHub/PA2/PA2/src/PA2Test/F16PA2/F16PA2", 100, 0.9, "baseball11.txt"));
		
		
		System.out.println(myNear.nearDuplciateDetector("C:/Users/Syth/Documents/GitHub/PA2/PA2/src/PA2Test/F16PA2/F16PA2", 50, 0.9, "space-0.txt"));
		System.out.println(myNear.nearDuplciateDetector("C:/Users/Syth/Documents/GitHub/PA2/PA2/src/PA2Test/F16PA2/F16PA2", 50, 0.5, "space-0.txt"));		
		
		//MinHashTime myMinHashTimer = new MinHashTime("C:/Users/Syth/Downloads/space", 600);
	    //myMinHashTimer.Timer();
		//System.out.println("There were " + MinHashAccuracy.calculateMinHashAccuracy("C:/Users/Syth/Downloads/space", 400, .09) + " file comparisons that differed morre than the specified error");

		
		/*MinHash myHasher = new MinHash("C:/Users/Syth/Desktop/PA2Test/articles", 30);
		System.out.println("done making minhash");
		System.out.println(Arrays.deepToString(myHasher.minHashMatrix()));
		System.out.println(myHasher.exactJaccard("space-0.txt", "space-1.txt"));
		System.out.println(myHasher.approximateJaccard("space-0.txt", "space-1.txt"));
		*/
	}

}
