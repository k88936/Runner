package main.java;

public class BlankInstruction extends Instruction
{
    public BlankInstruction(String raw)    {
        super();
        this.content=raw;
    }
    String content;
}
