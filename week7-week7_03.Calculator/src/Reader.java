import java.util.Scanner;

public class Reader {
    private Scanner sc = new Scanner(System.in);

    public String readString(){
        String str = sc.nextLine();
        return str;
    }

    public int readInteger(){
        int num = Integer.parseInt(sc.nextLine());
        return num;
    }
}
