package main.java;
import java.util.*;

public class Variable
{
   public Variable(String name){
       this.name=name;
       Variables.put(name,this);
   }
   String name;
   static Variable get(String name){
       
       if (Variables.containsKey(name)){
           return Variables.get(name);
       }else{
           return new Variable(name);
       }
   }
    static Variable get(String[] s,int index){

        if(index >=s.length)return null;
        return get(s[index]);
    }
   static HashMap<String,Variable> Variables=new HashMap<>();
}
