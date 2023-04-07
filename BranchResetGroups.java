import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
String result="";   
            
         Pattern p = Pattern.compile("^\\d{2}((?:---)|-|\\.|:)\\d{2}\\1\\d{2}\\1\\d{2}$");
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          if(m.find())
            System.out.println("true");
            else
            System.out.println("false");
         }
    }
}