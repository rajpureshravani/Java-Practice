import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
//        File file = new File("studentfile.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//
//            System.out.println("Unable to create this file");
//            throw new RuntimeException(e);
//        }
    try {
    FileWriter fileWriter = new FileWriter("studentfile.txt");
    fileWriter.write("This is our first file handling file");
    fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
