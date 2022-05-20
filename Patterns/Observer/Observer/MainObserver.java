package Observer;

public class MainObserver {
    public static void main(String[] args) throws InterruptedException {
        JavaVacancies javaVacancies = new JavaVacancies();
        Observer observer = new Subscriber("Anton Ivanenko");
        Observer observer1 = new Subscriber("Ighor Smirnov");

        javaVacancies.addObserver(observer);
        javaVacancies.addObserver(observer1);

        javaVacancies.addVacancies("Java junior 021675");
        javaVacancies.addVacancies("Java senior 027657");



        Thread.sleep(5000);

        javaVacancies.addVacancies("Java trainee 1259865");

        Thread.sleep(5000);

        javaVacancies.delVacancies("Java senior 027657");
    }
}
