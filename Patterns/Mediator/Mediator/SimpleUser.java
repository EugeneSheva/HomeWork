package Mediator;

public class SimpleUser implements User{
    Mediator mediator;
    String name;

    public SimpleUser(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMassage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " received message: " + message + ".");

    }
}
