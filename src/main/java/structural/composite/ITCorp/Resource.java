package structural.composite.ITCorp;

public abstract class Resource {

    protected String team;
    protected String name;
    protected int salary;

    public Resource(String team) {
        this.team = team;
    }

    public Resource(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected abstract String getTeamName();

    protected abstract String getWorkerName();

    protected abstract int getSalary();

    public void showTeams() {
        System.out.println("Team: " + this.getTeamName());
    }

    public void showWorkers() {
        System.out.println(this.getWorkerName() + " " + this.getSalary());
    }

    public abstract void addWorker(Resource r);

    public abstract void removeWorker(Resource r);

}
