package structural.composite.Files;

public class Test {
    public static void main(String[] args) {
        SystemFile home = new Directory("home");
        SystemFile doc = new Directory("doc");

        doc.addFile(new Directory("test"));
        doc.addFile(new ExecutableFile("a.txt"));

        SystemFile pic = new Directory("picture");
        SystemFile holiday = new Directory("holiday");
        pic.addFile(holiday);
        holiday.addFile(new ExecutableFile("a.png"));

        home.addFile(doc);
        home.addFile(pic);
        home.addFile(new ExecutableFile("test.txt"));

        home.showFiles();
    }
}
