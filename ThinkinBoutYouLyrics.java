public class ThinkinBoutYouLyrics{
    public static void displayLyrics(String songTitle)
    {
        String[] lyrics = {
            "   A tornado flew around my room before you came",
            "   Excuse the mess it made, it usually doesn't rain",
            "   My eyes don't shed tears, but boy they pour when...",
            "   I'm thinking 'bout you (Ooh no, no, no)",
            "   I've been thinking 'bout you (You know, know, know)",
            "   I've been thinking 'bout you",
            "   Do you think about me still? Do ya, do ya?",
            "   Or do you not think so far ahead",
            "   Cause I been thinking bout forever, ooh",
            "   Or do you not think so far ahead",
            "   Cause I been thinking 'bout forever, ooh",
            "   No, I don't like you, I just thought you were cool enough to kick it",
            "   Got a beach house I could sell you in Idaho, since you think",
        }; // end of lyrics

        
        int delay = 110;
        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Thinkin Bout You - Frank Ocean");
        lyricsDelay(lyrics, delay);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("============================================================");
    }


    private static void lyricsDelay(String[] lyrics, int delay)
    {
        try{

            for(String line: lyrics)
            {
                System.out.println("\r");

                for(char c: line.toCharArray())
                {
                    System.out.print(c);


                    Thread.sleep(delay);
                }
                Thread.sleep(delay * 25);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
