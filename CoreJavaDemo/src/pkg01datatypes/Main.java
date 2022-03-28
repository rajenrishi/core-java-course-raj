package pkg01datatypes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("[a-z][0-9]+", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("34234as df234");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
