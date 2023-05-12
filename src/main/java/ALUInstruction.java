package main.java;

public class ALUInstruction extends Instruction
{
    public ALUInstruction (String op,Variable result,Variable v1,Variable v2){
        super(result,v1,v2);
        this.op=op;
    }
    public ALUInstruction (String op,Variable result,Variable... vs){
        super(result);
        addOperand(vs);
        this.op=op;
    }
    
    String op;
}
