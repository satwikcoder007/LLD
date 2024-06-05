package ObserverPattern;

//all the screens are observers every time the subject value changes there value also changes
class CurrentDisplay implements Observer,Screen
{
    double temp;
    double pressure;
    Subject obj;

    CurrentDisplay(Subject obj) {
        this.obj = obj;//using this we can register and unregister users
        obj.registerUser(this);
    }
    @Override
    public void update(double x, double y) {
        this.temp = x;
        this.pressure = y;
        display(); //every time we update the value we are displaying
        //this thing can be made better using command pattern
        //using command pattern we can assign different commands
    }

    @Override
    public void display() {
        System.out.println("temp = "+temp);
        System.out.println("pressure = "+pressure);
    }
}