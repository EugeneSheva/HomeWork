package Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaVacancies implements Observed{
    List<String>vacancies = new ArrayList<>();
    List<Observer>subscribers = new ArrayList<>();

    public void addVacancies(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    public void delVacancies(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:subscribers) {
            o.observeEvent(this.vacancies);
        }

    }
}
