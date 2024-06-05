package ObserverPattern;

interface Subject{
    public void registerUser(Observer ob);
    public void removeUser(Observer ob);
    public void notifyObserver();
}
