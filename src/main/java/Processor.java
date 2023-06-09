package main.java;

public class Processor extends Block
{
    
    Module module;
    Variable Counter;
    boolean onRun;
    public Processor(Module module){
        this.module=module;
        Counter=module.getVar(MLOG.CounterIdentifier);
    }
    public void step(){
        int value = (int)Counter.value;
        if (value>=module.insts.size()||value<0){
            value=0;
            Counter.value=0;
        }
        module.insts.get(value).execute();
       
        
            
        
            }
            public String variablesReport(){
                
                return Utils.mapPrint(this.module.Variables);
                
                
            }
}
