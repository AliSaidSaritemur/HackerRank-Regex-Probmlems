import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int centencesCount=Integer.parseInt(scanner.nextLine().trim());
        List<String> sentences=new ArrayList<>();
        while(centencesCount-->0){
            sentences.add(scanner.nextLine());
        }

          int wordsCount=Integer.parseInt(scanner.nextLine().trim());
        List<String> words=new ArrayList<>();
          while(wordsCount-->0){             
            words.add(scanner.nextLine());
     
        }
        
        for(String word :words){
            int counter=0;

            Pattern wordPattern =Pattern.compile("\\b("+word+"|"+word.replace("our","or")+")\\b");
            for(String sentence :sentences){
            Matcher wordMatcher =wordPattern.matcher(sentence);
            while(wordMatcher.find())
            counter++;
            
            }
            System.out.println(counter);
        }
    }
}