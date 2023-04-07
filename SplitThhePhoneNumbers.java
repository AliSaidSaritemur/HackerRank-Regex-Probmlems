import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        
         String result="";   
            
         Pattern p = Pattern.compile("^(\\d+)[-\\s](\\d{1,3})[-\\s](\\d{4,10})$");
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          if(m.find())
                System.out.println("CountryCode="+m.group(1)+",LocalAreaCode="+m.group(2)+",Number="+m.group(3));      
         }
    }
}