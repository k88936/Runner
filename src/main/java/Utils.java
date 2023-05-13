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
    public static String mapPrint(Map map){
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        for (Map.Entry entry : map.entrySet()) {
            jsonBuilder.append("\"")
                .append(entry.getKey())
                .append("\":\"")
                .append(entry.getValue())
                .append("\",");
        }
        if (!map.isEmpty()) {
            // Remove trailing comma
            jsonBuilder.deleteCharAt(jsonBuilder.length() - 1);
        }
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }
    
}
