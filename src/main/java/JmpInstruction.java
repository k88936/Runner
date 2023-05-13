package main.java;

public class JmpInstruction extends Instruction
{

    @Override
    void execute()
    {
        // TODO: Implement this method
    }

    public JmpInstruction(String dest,String op,Variable rs1,Variable rs2){
        super(rs1,rs2);
    }
}
