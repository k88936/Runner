package main.java;

public class WriteInstruction extends Instruction
{

    @Override
    void execute()
    {
        // TODO: Implement this method
    }

    public WriteInstruction(Variable rd,Variable mem,Variable ads){
        super(rd,mem,ads);
    }
}
