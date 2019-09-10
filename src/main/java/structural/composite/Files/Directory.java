package structural.composite.Files;

import java.util.ArrayList;

//kompozyt
public class Directory extends SystemFile {
    private ArrayList<SystemFile> files = new ArrayList<SystemFile>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void showFiles() {
        super.showFiles();
        System.out.println("Directory "+ name + " contains: ");
        for (SystemFile sf : files) {
            sf.showFiles();
        }
    }

    @Override
    public void click() {
        super.click();
    }

    @Override
    public void doubleClick() {
        super.doubleClick();
    }

    @Override
    protected String getSystemFileName() {
        return name;
    }

    @Override
    public void addFile(SystemFile sf) {
        files.add(sf);
    }

    @Override
    public void removeFile(SystemFile sf) {
        files.add(sf);
    }
}
