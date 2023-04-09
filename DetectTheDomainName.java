import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String result="";   
            
         Pattern p = Pattern.compile("https?://(?:www\\.)?(\\w+(?:[\\.-]\\w+)*\\.\\w+)[/?\"]");
         List<String> mails = new ArrayList<String>(); 
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);

            while(m.find())
           {
               if(!mails.contains((m.group(1))))
                mails.add(m.group(1));  
             }
         }
         java.util.Collections.sort(mails);
        for(String mail : mails){
            result=result==""?mail:result+";"+mail;
        }
        System.out.println(result);      
    }
}