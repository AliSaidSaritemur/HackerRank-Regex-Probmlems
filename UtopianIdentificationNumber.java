import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
         Pattern p = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}");
         Scanner scanner = new Scanner(System.in);
           String temp = scanner.nextLine();
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          if(m.find())
            System.out.println("VALID");
            else
            System.out.println("INVALID");
         }
    }
}