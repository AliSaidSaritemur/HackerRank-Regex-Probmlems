import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

         Pattern p = Pattern.compile("^(?:hacke(r)rank|(hackerrank).+|.+(hackerrank))$");
         Scanner scanner = new Scanner(System.in);
         scanner.nextLine(); 
         while(scanner.hasNext()){       
          String line = scanner.nextLine();  
                 Matcher m = p.matcher(line);

            if(m.find())
           {
            String hackString =m.group(1);
            String hackString2 =m.group(2);
            String hackString3 =m.group(3);

            if(hackString!=null){
                   System.out.println(0);
            }
            else if(hackString2!=null){
                 System.out.println(1);
            }
            else{
                 System.out.println(2);
            }
            
             }
                    else{
                  System.out.println(-1);
             }    
         }  
    
    }
}