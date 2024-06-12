package CommandPattern;

import java.util.Arrays;

public class Remote{
    Command[] commands;
    Command undo;
    Remote(int x){
        commands = new Command[x];
        Arrays.fill(commands, null);
        undo = null;
    }
    void setCommand(Command ob,int x){
        commands[x] = ob;
        System.out.println("button "+(x+1)+"is set");
    }
    void removeCommand(int x){
        commands[x] = null;
    }
    void buttonPush(int x){
        if(x==0){
            if(undo == null) System.out.println("Nothing to undo");
            else{
                undo.undo();
                undo = null;
            }
            return;
        }
        if(commands[x-1] == null){

            System.out.println("No set Command");
            return;
        }
        undo = commands[x-1]; // here we set the latest operation performed into the undo so that we can undo it
        commands[x-1].execute();
    }

}