package main.java;
public class SetInstruction extends   Instruction 
{

    @Override
    void execute()
    {
        module.getVar(MLOG.CounterIdentifier).value++;
        opd(0).setValue(opd(1));
    }

    public SetInstruction(Variable rd,Variable s){
        super(rd,s);
    }
}
