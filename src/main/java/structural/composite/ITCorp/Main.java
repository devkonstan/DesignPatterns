package structural.composite.ITCorp;

public class Main {
    public static void main(String[] args) {
        Resource backEndTeam = new Manager("java");
        Resource frontEndTeam = new Manager("html");
        Resource hrTeam = new Manager("hr");

        backEndTeam.addWorker(new Developer("Jan", 4500));
        backEndTeam.addWorker(new Developer("Bogdan", 3500));

        frontEndTeam.addWorker(new Developer("Monika", 2500));
        frontEndTeam.addWorker(new Developer("Brajan", 3100));

        hrTeam.addWorker(new Developer("Brygida", 2200));

        backEndTeam.showTeams();
        frontEndTeam.showTeams();
        hrTeam.showTeams();
    }
}
