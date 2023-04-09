import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
  
         Scanner scanner = new Scanner(System.in);
                
          String countOfSentencesString = scanner.nextLine();
          int countOfSentences=Integer.parseInt(countOfSentencesString);
         List<String> sentencesList=new ArrayList<>();
         List<String> queriesList=new ArrayList<>();
         
         for(int i =0;i<countOfSentences;i++){
             sentencesList.add(scanner.nextLine());            
         }
         String quarieNumString= scanner.nextLine();
         int quarieNum=Integer.parseInt(quarieNumString);
         
          for(int i =0;i<quarieNum;i++){
             queriesList.add(scanner.nextLine());            
         }
         String queriesForPattern="";
    
         for (String query : queriesList) {
        
           
          Pattern p = Pattern.compile("((?<!\\w)("+query+"))(?!\\w)"); 
          int resultCounter=0;
            
          for (String sentence : sentencesList) {
               Matcher m = p.matcher(sentence);
              
                 while(m.find()){
                             resultCounter++;
                 }                        
          }

          System.out.println(resultCounter);
           }  
     
    }
}