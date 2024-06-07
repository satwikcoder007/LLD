package InbuiltObserver;

import java.util.Observable;
import java.util.Observer;
import java.util.function.Predicate;

class WeatherData extends Observable{
    double temp;
    double pressure;
    private void change(){
        setChanged();// this indicates that some changes is made without it notify will not work;
        notifyObservers();
        // notify observers make the update in all the observers present
        // it passes the current instant of the Observable to the update method
        //it passes null to the arg in update

        //it has an overloaded method which is notifyObserver(Object arg) used to pass arbitay object
        // to the update method;

    }
    public void setMeasurement(double temp, double pressure){
        this.temp = temp;
        this.pressure = pressure;
        change();
    }
    public double getTemp(){
        return temp;
    }
    public double getPressure(){
        return pressure;
    }
}

class CurrentDisplay implements Observer{
    double temp;
    double pressure;
    WeatherData ob;
    CurrentDisplay(WeatherData ob){
        this.ob = ob;
        ob.addObserver(this);
    }
    void removeObserver(){
        ob.deleteObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) { //Observable o contain the WeatherData obj which called the notify method
        WeatherData ob = (WeatherData)o;// here we type cast it because of the compile time exception
        this.temp = ob.getTemp();
        this.pressure = ob.getPressure();
        display();
    }

    void display(){
        System.out.println("temp = "+temp);
        System.out.println("pressure = "+pressure);
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentDisplay s1 = new CurrentDisplay(w);
        CurrentDisplay s2 = new CurrentDisplay(w);
        w.setMeasurement(35.6,102);
        s2.removeObserver();
        w.setMeasurement(34.5,105);
    }
}

