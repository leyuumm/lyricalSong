import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.*;

public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        int selection;
        String song =" ";

        System.out.println("==================================");
        System.out.println("     CHOOSE A SONG TO PLAY! ");
        System.out.println("==================================");
        System.out.println("1. Ikaw Pa Rin - Mrld");
        System.out.println("2. Loose - Daniel Caesar");
        System.out.println("3. DELULU - Zack Tabudlo");
        selection = sc.nextInt();

        switch(selection)
        {
            case 1:
                song = "Ikaw Pa Rin";
                System.out.println("=============================================");
                System.out.println(" You've chosen 1. Ikaw Pa Rin - Mrld ");
                System.out.println("=============================================");
                break;

            case 2:
                song = "Loose";
                System.out.println("=============================================");
                System.out.println("You've chosen 2. Loose - Daniel Caesar ");
                System.out.println("=============================================");
                break;

            case 3:
                song = "DELULU";
                System.out.println("=============================================");
                System.out.println("You've chosen 3. DELULU - Zack Tabudlo ");
                System.out.println("=============================================");
                break;

            default:
                System.out.println("Invalid Choices");
        }

            File musicFile = new File("songs\\" + song + ".wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);

            Clip clip = AudioSystem.getClip();

            clip.open(audioStream);

            String response = "";
            while(!response.equals("Q"))
            {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.println("=============================================");
                System.out.print("Enter your choice: ");
                response = sc.next();
                response = response.toUpperCase();


                switch(response)
                {
                    case ("P"): 
                        clip.start();
                    break;

                    case ("S"): 
                        clip.stop();
                    break;

                    case ("R"): 
                        clip.setMicrosecondPosition(0);
                    break;

                    case ("Q"): 
                        clip.close();
                    break;

                    default: 
                        System.out.println("Not a valid response");

                }
            }
        System.out.print("Byeeeers!");
    }
}