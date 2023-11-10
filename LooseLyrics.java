public class LooseLyrics{

    // Method to display lyrics for a specific song
    public static void displayLyrics(String songTitle)
    {
        // Lyrics for the song "Loose" by Daniel Caesar
        String[] lyrics = {
            // Lyrics lines...
            "   If you ever start to wonder",
            "   Why all the rain and all the thunder follows her around",
            "                                ",
            "   You better cut that girl loose",
            "   Most of the time everything's fine",
            "         ",
            "   But as soon as she starts to whine",
            "   If you have no patience",
            "   You better cut that girl loose",
            "   What are you, a coward?",
            "   Who are you helping?",
            "   You got the power",
            "   Then do what you said you can",
            "   And do it for her",
            "   You better cut that girl loose, ah",
            "   Set her free",
            "   Let her be",
            "                                                ",
            "                                                 ",
            "   Leave her be",
            "   Oh, yes",
            "                                                  ",
            "                                                  ",
            "   You don't love me anymore",
            "   Let's see how you like this song",
            "               ",
            "   See you walking out the door",
            "   Wonder why it took you so long",
            "                            ",
            "   Ever since the day that I met you",
            "                            ",
            "   Knew you were the girl of my dreams",
            "   But we could never be",
            "                             ",
            "                             ",
        }; // End of lyrics

         // Setting the delay between characters and lines
        int characterDelay = 90; // delay between characters in milliseconds
        int lineDelay = 2000; // delay between lines in milliseconds (2 seconds)

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Loose by Daniel Caesar");
        lyricsDelay(lyrics, characterDelay, lineDelay); // Displays lyrics with specified character and line delay
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

