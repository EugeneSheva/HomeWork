package Mediator;

public class MainMediator {
    public static void main(String[] args) {
    Chat chat = new Chat();

    User admin = new Admin(chat, "Admin Ivan");
    User user1 = new SimpleUser(chat, "Viktor");
    User user2 = new SimpleUser(chat, "Tatyana");

    chat.setAdmin(admin);
    chat.setUsers(user1);
    chat.setUsers(user2);

    user1.sendMassage("Hello, I am Viktor");
        System.out.println();
    user2.sendMassage("hi, i am Tatyana");

    }
}
