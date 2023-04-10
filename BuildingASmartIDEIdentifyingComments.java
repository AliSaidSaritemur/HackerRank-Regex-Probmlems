import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String text="";   
            
         Pattern p = Pattern.compile("(//.+|/\\*{1,2}(?:(\n|.)+?)\\*{1,2}/)");
         List<String> mails = new ArrayList<String>(); 
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          text+="\n"+line.trim();
        
         }  
         Matcher m = p.matcher(text);

            while(m.find())
           {
                 System.out.println(m.group(1));
             }    
    }
}