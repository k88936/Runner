package test.java;
import main.java.*;
import java.io.*;

public class test
{
    public static void main(String[] args)
    {
        Module m = null ;
        try
        {
      m    =  new Parser().parse(new DataInputStream(new StringBufferInputStream(
      "set a 1 \n set w 2\n\n"
      )));
//      System.out.println(m);
        }
        catch (IOException e)
        {}
   Processor p=     new Processor(m);
        
p.step();
        p.step();
        p.step();
        p.step();
System.out.println(p.variablesReport());
	}
    
   // @Test
    public void test1(){
        
    }
    
}
