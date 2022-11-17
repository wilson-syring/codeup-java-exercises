import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {
    public static String[] adjectives = {"beautiful","smooth","heavy","shiny","first","last","new","great","long","little"};
    public static String[] nouns = {"time","person","year","thing","man","world","hand","work","company","group"};

    public static void main(String[] args) {
        int randomNoun = ThreadLocalRandom.current().nextInt(0,9+1);
        String randAdjective = adjectives[randomNoun];
        String randNoun= nouns[randomNoun];
        System.out.println("Get ready for wacky server name");
        System.out.println(randAdjective+ "-" +randNoun);
    }
}
