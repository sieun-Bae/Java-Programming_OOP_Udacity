/**
 * coded by Sieun-Bae in 19/04/19
 */

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File("SecretOfGarden.txt");
        Scanner scanner = new Scanner(file);

        int word = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            word += line.split(" ").length;
        }

        System.out.println("The number of words is "+ word);
    }
}
