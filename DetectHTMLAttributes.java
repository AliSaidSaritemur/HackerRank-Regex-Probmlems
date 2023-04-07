import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Collection.*;
import java.util.Collections.*;

public class Solution {

 public static Map<String, List<String> >HtmlParams = new HashMap<>();
 public static Pattern p = Pattern.compile("<([a-zA-Z1-9]+)\\s*([A-Za-z]*)");
  public static Pattern pItem = Pattern.compile("<([a-zA-Z]+)(?:(?!>|=\").)*\\s([A-Za-z]+)=");
public static boolean SearchAttributes(String line){
      Matcher m = p.matcher(line);
    return m.find();
}
public static boolean SearchAttributesForItem(String line){
      Matcher m = pItem.matcher(line);
    return m.find();
}


public static String RemoveItemsAndUpdateHtml(String line){
      String newLine="";
    
         Matcher m = pItem.matcher(line);
             m.find();
      for(int i=1;i<=m.groupCount();i++){
                            
                if(i%2!=0){
                     if(!HtmlParams.containsKey(m.group(i))){
                          HtmlParams.put(m.group(i),new ArrayList<>());   
                                                     
                }}
                else if(!HtmlParams.get(m.group(i-1)).contains(m.group(i))){
                   
                     HtmlParams.get(m.group(i-1)).add(m.group(i));
                    }                                                                        
            }
            
            newLine=line;  

    StringBuilder sb = new StringBuilder(newLine);
    newLine =sb.deleteCharAt(newLine.indexOf('=')).toString();
    return newLine;
}


public static String UpdateHtmlParamsThenGetSettedLine(String line){
    String newLine=line;   
      
             while(SearchAttributesForItem(newLine)){           
                 newLine=RemoveItemsAndUpdateHtml(newLine);
             }
             
          Matcher m = p.matcher(line);
         m.find();
         if(!HtmlParams.containsKey(m.group(1))){
              HtmlParams.put(m.group(1),new ArrayList<>()); 
         }
         
newLine =newLine.substring(newLine.indexOf('>')+1);
return newLine;    
}


    public static void main(String[] args) {
          String result="";   
      
        
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){       
          String line = scanner.nextLine();

 //  System.out.println(line);
         while(SearchAttributes(line)){
                 //  System.out.println(line);
             
             line =UpdateHtmlParamsThenGetSettedLine(line);
         }
                 
         }
         List<String> lines =new ArrayList<>();
         for(Map.Entry<String, List<String>> entry : HtmlParams.entrySet()) {
    String key = entry.getKey();
    List<String> value = entry.getValue();
   lines.add(key+":"+GetListValuesAlphebetic(value));  
}
     java.util.Collections.sort(lines);
 
 for (String line : lines) {
     System.out.println(line);
 }  
    }
    public static String GetListValuesAlphebetic(List<String> values){
       
       if(values.size()<1)
       return "";
       
        java.util.Collections.sort(values);
        String result="";
        for (String value : values) {
            result+=value+",";
        }
        return result.substring(0,result.length()-1);
    }
    
    
}