package main.java;

public class JmpInstruction extends Instruction
{
    public JmpInstruction(String dest,String op,Variable rs1,Variable rs2){
        super(rs1,rs2);
    }
}
