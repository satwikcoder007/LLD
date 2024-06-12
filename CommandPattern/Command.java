package CommandPattern;

import java.util.Scanner;

interface Command{
    void execute();
    void undo();// every command have its own version of undo
}

class LightOffCommand implements Command{
    Light l;
    LightOffCommand(Light l){
        this.l = l;
    }
    public void execute() {
        l.turnOff();
    }

    @Override
    public void undo() {
        l.turnOn();
    }
}
class LightOnCommand implements Command{
    Light l;
    LightOnCommand(Light l){
        this.l= l;
    }
    @Override
    public void execute() {
        l.turnOn();
    }

    @Override
    public void undo() {
        l.turnOff();
    }
}
class FanOnCommand implements Command{
    Fan f;
    FanOnCommand(Fan f){
        this.f= f;
    }
    @Override
    public void execute() {
        f.turnOn();
    }

    @Override
    public void undo() {
        f.turnOff();
    }
}
class FanOffCommand implements Command{
    Fan f;
    FanOffCommand(Fan f){
        this.f= f;
    }
    @Override
    public void execute() {
        f.turnOff();
    }

    @Override
    public void undo() {
        f.turnOn();
    }
}
class FanSpeedSet implements Command{
    Fan f;
    int pspeed;
    FanSpeedSet(Fan f){
        this.f= f;
        pspeed = 0;
    }
    @Override
    public void execute() {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the fan speed: ");
            int val = sc.nextInt();
            pspeed = f.speed;
            f.changeSpeed(val);
        }
    }

    @Override
    public void undo() {
        f.changeSpeed(pspeed);
    }
}

