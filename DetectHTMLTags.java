import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
    Pattern p = Pattern.compile("<(\\w+)(?:\\s|>)");   
         Scanner scanner = new Scanner(System.in);
         List<String> Tags=new ArrayList<>();
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          String tempLine=line;

          while(m.find()){    
              String tempTag=m.group(1);         
             if(!Tags.contains(tempTag))  
             Tags.add(tempTag);      
          }      
          } String result="";
          
          java.util.Collections.sort(Tags);
          for (String currentTag : Tags) {
              result=result!=""?result+";"+currentTag:currentTag;
              
          }  
               System.out.println(result);
    }
}