package CommandPattern;

interface Device{
    void turnOn();
    void turnOff();

}

class Light implements Device{
    String room;
    int state;
    Light(String s){
        this.room = s;
        state = 0;
    }
    @Override
    public void turnOff() {
        if(state!=0){
            state = 0;
            System.out.println(room+" Light is turned off");
        }
    }

    @Override
    public void turnOn() {
        if(state!=1){
            state = 1;
            System.out.println(room+" Light is turned on");
        }
    }

}
class Fan implements Device{
    String room;
    int state;
    int speed;

    Fan(String s){
        this.room = s;
        state = 0;
        speed = 0;
    }
    @Override
    public void turnOn() {
        if(state!=1){
            state = 1;
            System.out.println(room+" Fan is running with speed "+speed);
        }

    }
    void changeSpeed(int x){
        if(speed !=x && state ==1) {
            speed = x;
            System.out.println(room+"fan current speed is " + speed);
        }
    }
    @Override
    public void turnOff() {
        if(state != 0 ){
            state = 0;
            System.out.println(room+" Fan is turned off");
        }
    }
}