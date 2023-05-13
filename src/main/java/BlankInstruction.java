package main.java;

public class BlankInstruction extends Instruction
{

    @Override
    void execute()
    {
        // TODO: Implement this method
    }

    public BlankInstruction(String raw)    {
        super();
        this.content=raw;
    }
    String content;
}
