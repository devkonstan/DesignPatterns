package structural.composite.ITCorp;

import java.util.ArrayList;

//kompozyt
public class Manager extends Resource {
    private ArrayList<Resource> workers = new ArrayList<>();

    public Manager(String team) {
        super(team);
    }

    @Override
    protected String getTeamName() {
        return team;
    }

    @Override
    protected String getWorkerName() {
        return name;
    }

    @Override
    protected int getSalary() {
        return salary;
    }

    @Override
    public void addWorker(Resource r) {
        workers.add(r);
    }

    @Override
    public void removeWorker(Resource r) {
        workers.remove(r);
    }

    @Override
    public void showTeams() {
        super.showTeams();
        for (Resource r : workers) {
            r.showWorkers();
        }
    }

}
