package structural.composite.Files;

public class ExecutableFile extends SystemFile{

    public ExecutableFile(String name) {
        super(name);
    }

    @Override
    protected String getSystemFileName() {
        return name;
    }


    @Override
    public void addFile(SystemFile sf) {

    }

    @Override
    public void removeFile(SystemFile sf) {

    }
}
