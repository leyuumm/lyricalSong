public class ThinkinBoutYouLyrics{
    public static void displayLyrics(String songTitle)
    {
        String[] lyrics = {
            "   A tornado flew around my room before you came",
            "   Excuse the mess it made, it usually doesn't rain",
            "   In Southern California, much like Arizona",
            "   My eyes don't shed tears, but boy they pour when...",
            "   I'm thinking 'bout you (Ooh no, no, no)",
            "   I've been thinking 'bout you (You know, know, know)",
            "   I've been thinking 'bout you",
            "   Do you think about me still? Do ya, do ya?",
            "   Or do you not think so far..... ahead",
            "   Cause I been thinking bout forever,..... ooh",
            "   Or do you not think so far........ ahead",
            "   Cause I been thinking 'bout forever,..... ooh",
            "   No, I don't like you, I just thought you were cool enough to kick it",
            "   Got a beach house I could sell you in Idaho, since you think",
            "   I don't love you I just thought you were cute, that's why I kissed you",
            "   Got a fighter jet, I don't get to fly it though I'm lying down",
            "   I'm thinking 'bout you (Ooh no, no, no)",
            "   I've been thinking 'bout you (You know, know, know)",
            "   I've been thinking 'bout you",
            "   Do you think about me still? Do ya, do ya?",
            "   Or do you not think so far ahead",
            "   Cause I been thinking bout forever, ooh",
            "   Or do you not think so far ahead",
            "   Cause I been thinking 'bout forever, ooh",
            "   Yes of course I remember, how could I forget how you feel?",
        }; // end of lyrics

        
        int characterDelay = 130;
        int lineDelay = 2000;

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Thinkin Bout You - Frank Ocean");
        lyricsDelay(lyrics, characterDelay, lineDelay);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("============================================================");
    }


    private static void lyricsDelay(String[] lyrics, int characterDelay, int lineDelay)
    {
        try{

            for(String line: lyrics)
            {
                System.out.println("\r");

                for(char c: line.toCharArray())
                {
                    System.out.print(c);


                    Thread.sleep(characterDelay);
                }
                Thread.sleep(lineDelay);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}