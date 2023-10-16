package pJavaFiles;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("C:/tmp/filename.txt");
      myWriter.write(function(1));
      myWriter.write(function(3));
      myWriter.write(function(5));
      myWriter.write(function(7));
      myWriter.write(function(9));
      myWriter.write(function(11));
      
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static String function(int zeile) {
	    StringBuilder pattern = new StringBuilder();
	    String text = "#";

	    for (int i = 0; i < zeile; i++) {
	        pattern.append(text);
	        if (i < zeile - 1) {
	            pattern.append("\n");  // Füge den Zeilenumbruch nur hinzu, wenn es nicht die letzte Zeile ist.
	        }
	    }

	    return pattern.toString();
	}

}
