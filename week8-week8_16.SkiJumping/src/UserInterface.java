import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    private Scanner sc;
    Participants participants;

    public UserInterface() {
        sc = new Scanner(System.in);
        this.participants = new Participants();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String participant = sc.nextLine();
            if (participant.isEmpty()) {
                System.out.println("\nThe tournament begins!");
                break;
            }
            participants.addSkier(new Skier(participant));
        }
        int round = 1;
        while(true){
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String command = sc.nextLine();
            if(!command.equals("jump")){
                break;
            }
            System.out.println("\nRound " + round + "\n");
            System.out.println("Jumping order:");
            printSkiers();
            System.out.println("Results of round " + round);
            for(Skier skier : participants.getSkiers()){
                skier.addJump(round);
            }
            for(Skier skier : participants.getSkiers()){
                System.out.println("  " + skier.getName());
                System.out.println("    length: " + skier.getJumps().get(round).getLength());
                System.out.println("    judge votes: " + skier.getJumps().get(round).getJudgeScores());
                skier.setPoints(skier.getJumps().get(round).getPoints());

            }

            round++;
        }

        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(int i = 1; i<=participants.getSkiers().size(); i++){
            Collections.sort(participants.getSkiers());
            Collections.reverse(participants.getSkiers());
            participants.getSkiers().get(i-1).lengths();
            System.out.printf("%-12d",i);
            System.out.println(participants.getSkiers().get(i-1));
            System.out.printf("%-12s"," ");
            int j = 1;
            System.out.print("jump lengths: ");
            for(int length : participants.getSkiers().get(i-1).getLengths()){

                System.out.print(length + "m");
                if(j<participants.getSkiers().get(i-1).getLengths().size()){
                    System.out.print(", ");
                    j++;
                }
            }
            System.out.println();

        }

    }


    public void printSkiers() {
        Collections.sort(participants.getSkiers());
        int index = 1;
        for (Skier s : participants.getSkiers()) {
            System.out.println("  " + index + ". " + s);
            index++;
        }
        System.out.println();
    }
}
