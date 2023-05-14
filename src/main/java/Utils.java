package main.java;
import java.util.*;


public class Utils
{
    static String[] subArray(String[] origin, int from)
    {
        String[] str=new String[origin.length - from + 1];
        for (int i=from;i < origin.length;i++)
        {
            str[i - from] = origin[i];
        }
        return str;
    }
    public static String mapPrint(HashMap map){
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        
       
     for (Map.Entry<Object,Object> entry : map.entrySet())  {
         jsonBuilder.append("\n\t\"")
         .append(entry.getKey())
        .append("\":\"")      
        .append(entry.getValue())
           .append("\",");
           }
        if (!map.isEmpty()) {
            // Remove trailing comma
            jsonBuilder.deleteCharAt(jsonBuilder.length() - 1);
        }
        jsonBuilder.append("\n}");

        return jsonBuilder.toString();
    }
    
}
