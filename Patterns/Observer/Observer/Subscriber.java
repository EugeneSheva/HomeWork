package Observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void observeEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "!" + "\n" +
        "We have changes in our vacancies:\n"+
        vacancies + "\n" +
        "===========================================\n");

    }
}
