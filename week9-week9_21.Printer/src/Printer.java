import java.io.File;
import java.util.Scanner;

public class Printer {


    private File f;

    public Printer(String fileName){
        this.f = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception{
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(word.isEmpty()||line.contains(word)){
                System.out.println(line);
            }

        }
        sc.close();

    }

}
