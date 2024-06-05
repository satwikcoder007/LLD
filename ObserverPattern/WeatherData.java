package ObserverPattern;

import java.util.ArrayList;
//WeatherData is a concrete Subject
public class WeatherData implements Subject
{
    double temp;
    double pressure;
    private ArrayList<Observer> subscribers;
    WeatherData(){
        subscribers = new ArrayList<Observer>(); //This list contains all the observers
    }
    @Override
    public void registerUser(Observer ob) {
        subscribers.add(ob);
    }

    @Override
    public void removeUser(Observer ob) {
        subscribers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<subscribers.size();i++){
            subscribers.get(i).update(temp,pressure);
        }
    }

    public void setMeasurement(double temp, double pressure){
        this.temp = temp;
        this.pressure = pressure;
        notifyObserver();  //every time the subject value changed we notify the user
    }


}