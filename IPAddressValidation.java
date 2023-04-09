import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {

         Pattern p = Pattern.compile("^(?:(?<IPv4>(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3}))|(?<IPv6>(?:([0-9a-f]){0,4}:){7}[0-9a-f]{0,4}))$");
         Scanner scanner = new Scanner(System.in);
           String temp = scanner.nextLine();
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher m = p.matcher(line);
          String result="Neither";
          if(m.find()){
                if(m.group("IPv4")!=null){
                    for(int i=2;i<6;i++){
                        result="IPv4";
                     
                        if(Integer.parseInt(m.group(i))>255)
                        {
                           result="Neither";
                                      
                        }
                    }                         
                }
            else if(m.group("IPv6")!=null)
            {         
                 result="IPv6";
            }
                 
          }
                 
      System.out.println(result);
         }               
    }
}