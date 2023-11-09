public class LooseLyrics{
    public static void displayLyrics(String songTitle)
    {
        String[] lyrics = {
            "   If you ever start to wonder",
            "   Why all the rain and all the thunder follows her around",
            "   You better cut that girl loose",
            "   Most of the time everything's fine",
            "   But as soon as she starts to whine",
            "   If you have no patience",
            "   You better cut that girl loose",
            "   What are you, a coward?",
            "   Who are you helping?",
            "   You got the power",
            "   Then do what you said you can",
            "   And do it for her",
            "   You better cut that girl loose, ah",
        }; // end of lyrics

        
        int characterDelay = 130;
        int lineDelay = 2000;

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Loose by Daniel Caesar");
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

