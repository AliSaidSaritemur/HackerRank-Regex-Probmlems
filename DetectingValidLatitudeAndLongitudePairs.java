import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
         Pattern p = Pattern.compile("^\\(([-\\+]?(?:90(?:\\.0+)?|(?:[1-8][0-9]|[0-9])(?:\\.[0-9]{1,11})?)),\\s[-\\+]?(?:180(?:\\.0+)?|(?:1[0-7][0-9]|[1-9][0-9]|[0-9])(?:\\.[0-9]{1,11})?)\\)$");
         Scanner scanner = new Scanner(System.in);
           String temp = scanner.nextLine();
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          if(m.find())
            System.out.println("Valid");
            else
            System.out.println("Invalid");
         }
    }
}