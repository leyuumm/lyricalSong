public class NeuRosesLyrics{
    public static void displayLyrics(String songTitle)
    {
        String[] lyrics = {
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
        }; // end of lyrics

        
        int characterDelay = 50; // delay between characters in milliseconds
        int lineDelay = 2000; // de;ay between lines in milliseconds (2 seconds)

        System.out.println("============================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Neu Roses by Daniel Caesar");
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
