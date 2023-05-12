package main.java;

public class WriteInstruction extends Instruction
{
    public WriteInstruction(Variable rd,Variable mem,Variable ads){
        super(rd,mem,ads);
    }
}
