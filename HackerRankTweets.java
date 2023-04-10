import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
   
            int counter=0;
         Pattern p = Pattern.compile("([Hh][aA][cC][Kk][Ee][rR][Rr][Aa][nN][kK])");
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();  
                 Matcher m = p.matcher(line);

            while(m.find())
           {
                 counter++;
             }    
         }  
       System.out.println(counter);
    }
}