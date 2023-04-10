import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

         Pattern p = Pattern.compile("(?:(import java)|(#include)|(class \\w+:|print\\s\".+\"|def\\s.+\\([a-zA-Z]\\)))");
         Scanner scanner = new Scanner(System.in);

         String langaugeText="";
         while(scanner.hasNext()){       
          String line = scanner.nextLine();  
          langaugeText+="\n"+line;
         }  
           Matcher m = p.matcher(langaugeText);

            while(m.find())
           {
            String JavaLanguage =m.group(1);
            String CLanguage =m.group(2);
            String PythonLanguage =m.group(3);

            if(JavaLanguage!=null){
                   System.out.println("Java");
                            break;
            }
            else if(CLanguage!=null){
                 System.out.println("C");
                          break;
            }
            else if(PythonLanguage!=null){
                 System.out.println("Python");
                 break;
            }           
             }                              
    }
}