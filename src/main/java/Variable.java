package main.java;
import java.util.*;

public class Variable
{
   public Variable(String name){
       this.name=name;
   }
   public  Variable(double value){
       this.value=value;
   }
   
   String name;
   double value=0;
   Mobject pointer=null;
   public Variable setValue(Variable var){
       this.value=var.value;
       this.pointer=var.pointer;
       return this;
   }

   @Override
   public String toString()
   {
       if(this.pointer!=null)return pointer.toString();
       return  String.valueOf(value);
   }
   
   }
