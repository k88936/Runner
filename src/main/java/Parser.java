package main.java;
import java.io.*;

public class Parser
{

    Module module=new Module();
    public Module parse(DataInputStream code) throws IOException
    {

        String line;
        String[] lineContent;

        while ((line = code.readLine()) != null&&line!="#end"&&line!="")
        {
//            System.out.println(line);

            lineContent = line.split(" ");
            String symbol = lineContent[0];
//            System.out.println( symbol);
            switch (symbol)
            {
                
                case "set":
                    {
                        module.addInst(new SetInstruction(
                                           module.getVar(lineContent[1]),
                                           module.getVar(lineContent[2])));
//                                           System.out.println(module);
                        break;
                    }

                case"op":{


                        module.addInst(
                            new ALUInstruction(
                                lineContent[1],
                                module.getVar(lineContent[2]),
                                module.getVars((lineContent), 2)
                            ));

                        break;

                    }
                case "jump":{
                        module.addInst(new JmpInstruction(
                                           lineContent[1],
                                           lineContent[2],
                                           module.getVar(lineContent, 3),
                                           module.getVar(lineContent, 4)
                                       ));
                        break;
                    }
                case "read":{
                        module.addInst(new ReadInstruction(
                                           module.getVar(lineContent[1]),
                                           module.getVar(lineContent[2]),
                                           module.getVar(lineContent[3])));
                        break;
                    }
                case "write":{
                        module.addInst(new WriteInstruction(
                                           module.getVar(lineContent[1]),
                                           module.getVar(lineContent[2]),
                                           module.getVar(lineContent[3])));
                        break;
                    }

                default:{


                        if (symbol.endsWith(":"))
                        {
                            module.addLabel(symbol);
                            break;
                        }
                        if (symbol.startsWith("#"))
                        {
                            break;
                        }
                        module.addInst(new BlankInstruction(line));
                    }

            }
        }
        return this.module;
    }


}
