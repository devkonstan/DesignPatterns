package structural.composite.Files;

public abstract class SystemFile {

    protected String name;

    public SystemFile(String name) {
        this.name = name;
    }

    protected abstract String getSystemFileName();

    public void showFiles() {
        System.out.println("Directory " + this.getSystemFileName());
    }

    public void click() {
    }

    public void doubleClick() {
        click();
        click();
    }

    public abstract void addFile(SystemFile sf);

    public abstract void removeFile(SystemFile sf);
}
