package CommandPattern;

class Main{
    public static void main(String[] args) {
        Remote r1 = new Remote(7);
        Light l1 = new Light("Living room");
        Light l2 = new Light("Kitchen");
        Fan f1 = new Fan("Living room");
        LightOnCommand lo1 = new LightOnCommand(l1);
        LightOffCommand lof1 = new LightOffCommand(l1);
        LightOnCommand lo2 = new LightOnCommand(l2);
        LightOffCommand lof2 = new LightOffCommand(l2);
        FanOnCommand fo1 = new FanOnCommand(f1);
        FanOffCommand fof1 = new FanOffCommand(f1);
        FanSpeedSet fs1 = new FanSpeedSet(f1);
        Command arr[]={lo1,lof1,lo2,lof2,fo1,fof1,fs1};
        for(int i=0;i<7;i++){  // setting different commands to different buttons
            r1.setCommand(arr[i],i);
        }
        r1.buttonPush(1);
        r1.buttonPush(0);
        r1.buttonPush(0);
        r1.buttonPush(3);
        r1.buttonPush(0);
    }
}

//The command pattern encapsulate the request passes between the invoker and the receiver
//thus allowing us to pass the request as an object . is also come with an additional benefit of undo operation
// and performing a queue of operation and micro operations

//The Command Pattern allows you to decouple
// the requester of an action from the object that actually performs the action

