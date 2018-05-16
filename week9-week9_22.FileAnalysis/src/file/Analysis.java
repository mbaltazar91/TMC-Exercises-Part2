package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {

    private List<String> lines;
    private File file;
    private Scanner sc;


    public Analysis(File file){
        lines = new ArrayList<String>();
        this.file = file;
        try {
            sc = new Scanner(this.file);
        }
        catch (Exception e){
            System.out.println("not found");
        }
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            lines.add(line);
        }

    }

    public int characters(){
        int sum = 0;
        for(String line : lines){
            sum += line.length();
        }
        return sum + lines();
    }

    public int lines(){
        return lines.size();
    }

}
