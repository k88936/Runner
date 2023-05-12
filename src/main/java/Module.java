package main.java;
import java.util.*;

public class Module
{
    ArrayList<Instruction> insts= new ArrayList<>();
    public Module addInst(Instruction inst){
        this.insts.add(inst);
        return this;
    }
    HashMap<String,Integer> labels=new HashMap<>();
    public Module addLabel(String name){
      labels.put(name,insts.size());
      return this;
    }
}
