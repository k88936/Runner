package main.java;
import java.util.*;

public class Instruction
{
    public Instruction (Variable... Operands){
     addOperand(Operands);
    }
    public Instruction addOperand(Variable[] Operands){
        for(Variable var:Operands){
            this.Operands.add(var);
        }
        return this;
    }
    public Instruction addOperand(Variable Operand){
        this.Operands.add(Operand);
        return this;
    }
    ArrayList<Variable> Operands=new ArrayList<>();
}
