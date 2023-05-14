package main.java;
import java.util.*;

public class Module
{
    public Module(){
        
    }
    ArrayList<Instruction> insts= new ArrayList<>();
    public Module addInst(Instruction inst){
        inst.module=this;
        this.insts.add(inst);
        return this;
    }
    HashMap<String,Integer> labels=new HashMap<>();
    public Module addLabel(String name){
      labels.put(name,insts.size());
      return this;
    }
    
     Variable getVar(String name){

      
         try
         {
             return new Variable(    Double.parseDouble(name));
         }
         catch (NumberFormatException e)
         {}

        if (this.Variables.containsKey(name)){
            return this.Variables.get(name);
        }else{
          Variable n=   new Variable(name);
          this.Variables.put(name,n);
            return n;
        }
    }
     Variable getVar(String[] s,int index){

        if(index >=s.length)return null;
        return getVar(s[index]);
    }
     HashMap<String,Variable> Variables=new HashMap<>();
    public Variable[] getVars(String[] names, int from)
    {
        String[]    pnames=Utils. subArray(names, from);
        Variable[] s=new Variable[pnames.length];
        for (int i=0;i < pnames.length;i++)
        {
            s[i] =this.getVar(pnames[i]);

        }
        return s;
    }
   
}
