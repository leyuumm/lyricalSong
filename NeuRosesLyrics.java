public class NeuRosesLyrics{

    // Method to display lyrics for a specific song
    public static void displayLyrics(String songTitle)
    {
        // Lyrics for the song "Neu Roses" by Daniel Caesar
        String[] lyrics = {
            // Lyrics lines...
            "   There are times I think about that fateful day",  
            "                 ",
            "   I threw your love away",
            "               ",
            "   Every time I see that look upon your face",
            "            ",
            "   The same one that you made",
            "            ",
            "   When your fragile world was crashing down around you",
            "            ",
            "   You realized your place",
            "           ",
            "   And the darkness that you try so hard to subdue",
            "            ",
            "   It causes you to change",
            "          ",
            "   But baby, baby, please don't leave me",
            "          ",
            "   I know I made a big mistake, don't turn my sunshine to shade",
            "        ",
            "   Baby, please don't leave me",
            "       ",
            "   I know this is a game we play",
            "   You're always taking my breath away",
            "                                                         ",
            "                                                         ",
            "                                   ",
            "   Should've left you a long time ago",
            "   All my niggas done told me so",
            "   But my niggas don't hold me tight",
            "   When I'm sleeping in my bed at night, only you",
            "   Should've left you a long time ago",
            "   All my niggas done told me so",
            "   But my niggas don't hold me tight",
            "   When I'm sleeping in my bed at night, only you",
            "   Babe, I know I fucked up",
            "   Fucked with some empty cups",
            "   But you got your friends too",
            "   But you got your friends too",
            "   Better believe it, in",
            "   Truth I'm up on my luck, can't stop running amok",
            "   But you got your friends too",
            "   But you got your friends too",
            "   Better believe it, I.",
        }; // End of lyrics

        // Setting the delay between characters and lines
        int characterDelay = 40; // delay between characters in milliseconds
        int lineDelay = 2000; // delay between lines in milliseconds (2 seconds)

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Neu Roses by Daniel Caesar");
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
