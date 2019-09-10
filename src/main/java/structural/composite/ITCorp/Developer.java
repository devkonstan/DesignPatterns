package structural.composite.ITCorp;

public class Developer extends Resource{

    public Developer(String name, int salary) {
        super(name, salary);
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

    }

    @Override
    public void removeWorker(Resource r) {

    }

}
