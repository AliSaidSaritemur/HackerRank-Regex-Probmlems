import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
         Pattern p = Pattern.compile("href=\"([^-]*?)\"[^>]*>(?:<b>)?(.*?)<");
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          String tempLine=line;
          while(m.find()){
                        
              System.out.println(m.group(1)+","+m.group(2).trim());
                        
                 StringBuilder sb = new StringBuilder(tempLine);
                tempLine =sb.deleteCharAt(tempLine.indexOf("href")).toString();
             m = p.matcher(tempLine); 
          }
                       
    }
}
}