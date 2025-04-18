package structural.composite;

public class Runner {
    public static void main(String[] args) {
        // Create files
        File textFile = new File("File1.txt", 100);
        File imageFile = new File("File2.jpg", 200);

        // Create a directory and add files to it
        Directory textDir = new Directory("Text Files");
        Directory imageDir = new Directory("Image Files");

        // Add files to directories
        textDir.addComponent(textFile);
        imageDir.addComponent(imageFile);

        // Create a root directory and add directories to it
        Directory rootDir = new Directory("Root");
        rootDir.addComponent(textDir);
        rootDir.addComponent(imageDir);

        // Show details of the file system
        rootDir.display("");
    }
}
