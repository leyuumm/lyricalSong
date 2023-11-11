/**
 * Created by Lliam Khenzo
 * Date : 2023-11-10
 * Time : 12:55
 * Project Name :lyricalSong   
 */

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.*;

public class Main{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        // List of available songs
        String[] songs = {
            "Neu Roses - Daniel Caesar",
            "Loose - Daniel Caesar",
            "Thinkin Bout You - Frank Ocean"
        };

        // Displaying song selection menu
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
                    // Loop for selecting a song and handling an invalid input
                    System.out.println("===================================================");
                    System.out.println("Enter the number of the song you want to play: ");
                    selection = sc.nextInt();

                        if(selection >= 1 && selection <= songs.length){
                            break; // Valid selection, exit the loop 
                        } else{
                        System.out.println("Invalid Choice. Please input a number only");
                        }
                        
                } catch(InputMismatchException e){
                    // Handling a non-integer input
                    System.out.println("===================================================");
                    System.out.println("Invalid input. Please input a valid integer");
                    sc.nextLine();
                }
            }
        
        // Getting the selected song's title and filename
        String songTitle = songs[selection - 1];
        String songFilename = "songs\\" + songTitle + ".wav";
       
            // Load and play the selected song
            File musicFile = new File(songFilename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Displays the chosen song
            System.out.println("============================================================");
            System.out.println(" You've chosen " + selection + ". " + songTitle);
            System.out.println("============================================================");

            String response = "";

            // Using do while to play the song again by inputting the "P" = Play
            do{   
                // User menu for controlling the song
                System.out.println("P = Play, S = Stop, R = Reset, L = Show Lyrics, Q = Quit");
                System.out.println("============================================================");
                System.out.print("Enter your choice: ");
                response = sc.next();
                response = response.toUpperCase();


                switch(response)
                {
                    case ("P"): 
                        clip.setMicrosecondPosition(0);
                        clip.start();
                    break;

                    case ("S"): 
                        clip.stop();
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
            }while(!response.equals("Q"));

        // Farewell message
        System.out.println("=====================");
        System.out.println("Byeeeeeeeers!");
        System.out.println("=====================");

        sc.close();
    }

    // Displays lyrics for the selected song 
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