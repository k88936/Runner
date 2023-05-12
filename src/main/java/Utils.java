package main.java;
import org.apache.http.conn.util.*;

public class Utils
{
    static String[] subArray(String[] origin,int from){
        String[] str=new String[origin.length-from+1];
        for (int i=from;i<origin.length;i++){
            str[i-from]=origin[i];
        }
        return str;
    }
   public static Variable[] getVars(String[] names,int from){
   String[]    pnames=subArray(names,from);
       Variable[] s=new Variable[pnames.length];
       for(int i=0;i<pnames.length;i++){
           s[i]=Variable.get(pnames[i]);
           
       }
       return s;
   }
}
