package ObserverPattern;

public class Main{
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();   // concrete Subject
        CurrentDisplay cd = new CurrentDisplay(wd); //concrete Observer
        wd.setMeasurement(34.5,100);
        wd.setMeasurement(36.5,105);
    }
}

//Observer Pattern

//defines a one-to-many relation between objects where is one object change state then all the dependents
//get notified and get updated automatically

//once the relation is broken that is we unsubscribe then we will not get notified any more about the
//change of state od the subject