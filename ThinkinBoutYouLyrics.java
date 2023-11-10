public class ThinkinBoutYouLyrics{

    // Method to display lyrics for a specific song
    public static void displayLyrics(String songTitle)
    {
        // Lyrics for the song "Thinkin Bout You" by Frank Ocean 
        // By the way this song is about Jelian. aw HAHAHAHAHAHA!
        String[] lyrics = {
            // Lyrics lines...
            "   A tornado flew around my room before you came",
            "   Excuse the mess it made, it usually doesn't rain",
            "   In Southern California, much like Arizona",
            "   My eyes don't shed tears, but boy they pour when...",
            "   I'm thinking 'bout you (Ooh no, no, no)",
            "   I've been thinking 'bout you (You know, know, know)",
            "   I've been thinking 'bout you",
            "   Do you think about me still? Do ya, do ya?",
            "   Or do you not think so far..... ahead",
            "                                           ",
             "                                           ",
            "   Cause I been thinking bout forever,..... ooh",
            "                                           ",
             "                    ",
            "   Or do you not think so far........ ahead",
            "                                           ",
            "   Cause I been thinking 'bout forever,..... ooh",
             "                                       ",
            "   No, I don't like you, I just thought you were cool enough to kick it",
            "   Got a beach house I could sell you in Idaho, since you think",
            "   I don't love you I just thought you were cute, that's why I kissed you",
            "   Got a fighter jet, I don't get to fly it though I'm lying down",
            "   I'm thinking 'bout you (Ooh no, no, no)",
            "   I've been thinking 'bout you (You know, know, know)",
            "   I've been thinking 'bout you",
            "   Do you think about me still? Do ya, do ya?",
            "   Or do you not think so far ahead",
             "                                           ",
              "                                      ",
            "   Cause I been thinking bout forever, ooh",
             "                                           ",
            "   Or do you not think so far ahead",
             "                                           ",
            "   Cause I been thinking 'bout forever, ooh",
             "                                          ",
              "                                    ",
            "   Yes of course I remember, how could I forget how you feel?",
             "                                          ",
              "                               ",
            "   You know you were my first time, a new feel",
             "                                        ",
            "   It will never get old, not in my soul, not in my spirit, keep it alive",
             "                               ",
            "   We'll go down this road 'til it turns from color to black and white",
             "               ",
            "   Or do you not think so far ahead",
             "                                           ",
             "             ",
            "   Cause I been thinking bout forever, ooh",
             "                                           ",
              "                                       ",
            "   Or do you not think so far ahead",
             "                                             ",
             "             ",
            "   Cause I been thinking 'bout forever, ooh",
             "                                           ",
        }; // End of lyrics

        // Setting the delay between characters and lines
        int characterDelay = 40; // delay between characters in milliseconds
        int lineDelay = 1000; // delay between lines in milliseconds (1 seconds)

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Thinkin Bout You - Frank Ocean");
        lyricsDelay(lyrics, characterDelay, lineDelay);  // Displays lyrics with specified character and line delay
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("============================================================");
    }

    // Method to display lyrics with character and line delays
    private static void lyricsDelay(String[] lyrics, int characterDelay, int lineDelay)
    {
        // Using try and catch to handle exceptions
        try{
            // Looping through each line in the 'lyrics' array
            for(String line: lyrics)
            {
                System.out.println("\r");

                // Looping through each character in the current 'line'  
                for(char c: line.toCharArray())
                {
                    // Print the character to the console
                    System.out.print(c);

                    // Pause for a specified 'delay' in milliseconds
                    Thread.sleep(characterDelay);
                }
                // Wait for the specified line delay after each line
                Thread.sleep(lineDelay);
            }
        } catch(InterruptedException e){
            // If an InterruptedException is thrown (e.g., when using Thread.sleep)
            // Print the stack trace to the console to help with debugging
            e.printStackTrace();
        }
    }
}