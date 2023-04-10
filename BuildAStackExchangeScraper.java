import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
         Pattern pQuestionNums = Pattern.compile("id=\"question-summary-(\\d+)\"");
 Pattern pQuestions = Pattern.compile("class=\"question-hyperlink\"[^>]*?>(.+?)<");
Pattern pQuestionTime = Pattern.compile("class=\"relativetime\"[^>]*?>(.+?)<");
         Scanner scanner = new Scanner(System.in);
           String temp = scanner.nextLine();
           List<String> questionNums=new ArrayList<>();
           List<String> questions=new ArrayList<>();
           List<String> questionTime=new ArrayList<>();
         while(scanner.hasNext()){       
          String line = scanner.nextLine();
          Matcher mpQuestionNums = pQuestionNums.matcher(line);
          Matcher mpQuestions = pQuestions.matcher(line);
          Matcher mpQuestionTime = pQuestionTime.matcher(line);
          if(mpQuestionNums.find())
           questionNums.add(mpQuestionNums.group(1));
           
            if(mpQuestions.find())
           questions.add(mpQuestions.group(1));
           
                     if(mpQuestionTime.find())
           questionTime.add(mpQuestionTime.group(1));
           
         }
      
         for(int i =0;i<questions.size();i++)
         System.out.println(questionNums.get(i)+";"+questions.get(i)+";"+questionTime.get(i));
         
    }
}