public class MainComposite {
    public static void main(String[] args) {
    Team1 team1 = new Team1();
    Team2 team2 = new Team2();
    Dev JavaDev1 = new JavaDeveloper();
    Dev JavaDev2 = new JavaDeveloper();
    Dev JavaDev3 = new JavaDeveloper();
    Dev PythonDev1 = new PythonDeveloper();
    Dev PythonDev2 = new PythonDeveloper();

    team1.addDev(JavaDev1);
    team1.addDev(JavaDev2);
    team1.addDev(JavaDev3);
    team1.delDev(JavaDev3);

    team2.addDev(PythonDev1);
    team2.addDev(PythonDev2);
    team2.addDev(JavaDev3);

    team1.createProject();
    team2.createProject();

    }

}
