public class NeuRosesLyrics{
    public static void displayLyrics(String songTitle)
    {
        String[] lyrics = {
            "   There are times I think about that fateful day",
            "   I threw your love away",
            "   Every time I see that look upon your face",
            "   The same one that you made",
            "   When your fragile world was crashing down around you",
            "   You realized your place",
            "   And the darkness that you try so hard to subdue",
            "   It causes you to change",
            "   But baby, baby, please don't leave me",
            "   I know I made a big mistake, don't turn my sunshine to shade",
            "   Baby, please don't leave me",
            "   I know this is a game we play",
            "   You're always taking my breath away",
        }; // end of lyrics

        
        int delay = 130;
        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Neu Roses by Daniel Caesar");
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
                Thread.sleep(delay * 10);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
