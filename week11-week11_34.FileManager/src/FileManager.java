
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        File txtFile = new File(file);
        Scanner reader = new Scanner(txtFile);
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
        reader.close();
        return lines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file,true);
        for(String text : texts){
            writer.write(text+"\n");
        }
        writer.close();
    }
}
