import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.*;

public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        String[] songs = {
            "Neu Roses - Daniel Caesar",
            "Loose - Daniel Caesar",
            "Thinkin Bout You - Frank Ocean"
        };

        System.out.println("==================================");
        System.out.println("     CHOOSE A SONG TO PLAY! ");
        System.out.println("==================================");

        for(int i = 0; i < songs.length; i++)
        {
            System.out.println((i + 1) + ". " + songs[i]);
        }

            int selection = 0;

            while(true)
            {
                try{
                    System.out.println("===================================================");
                    System.out.println("Enter the number of the song you want to play: ");
                    selection = sc.nextInt();

                        if(selection >= 1 && selection <= songs.length){
                            break; // Valid selection, exit the loop 
                        } else{
                        System.out.println("Invalid Choice. Please input a number only");
                        }
                        
                } catch(InputMismatchException e){
                    System.out.println("===================================================");
                    System.out.println("Invalid input. Please input a valid integer");
                    sc.nextLine();
                }
            }

        String songTitle = songs[selection - 1];
        String songFilename = "songs\\" + songTitle + ".wav";
       

            File musicFile = new File(songFilename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("============================================================");
            System.out.println(" You've chosen " + selection + ". " + songTitle);
            System.out.println("============================================================");

            String response = "";
            boolean isPlaying = false;

            while(!response.equals("Q"))
            {
                System.out.println("P = Play, S = Stop, R = Reset, L = Show Lyrics, Q = Quit");
                System.out.println("============================================================");
                System.out.print("Enter your choice: ");
                response = sc.next();
                response = response.toUpperCase();


                switch(response)
                {
                    case ("P"): 
                        clip.start();
                        isPlaying = true;
                    break;

                    case ("S"): 
                        clip.stop();
                        isPlaying = false;
                    break;

                    case ("L"):
                        displayLyrics(songTitle);
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
        System.out.println("=====================");
        System.out.println("Byeeeeeeeers!");
        System.out.println("=====================");
    }


    private static void displayLyrics(String songTitle)
    {
        switch(songTitle)
        {
            case "Neu Roses - Daniel Caesar":
                NeuRosesLyrics.displayLyrics(songTitle);
            break;

            case "Loose - Daniel Caesar":
                LooseLyrics.displayLyrics(songTitle);
            break;

            case "Thinkin Bout You - Frank Ocean":
                ThinkinBoutYouLyrics.displayLyrics(songTitle);
            break;

            default:
                System.out.println("No Lyrics for this selection");
        }
    }
}