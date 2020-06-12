import java.util.Random;

public class ServerNameGenerator {

    static Random randNum = new Random();

    public static String[] adjectives = {
            "formidable",
            "savage",
            "groovy",
            "wondrous",
            "wicked",
            "auspicious",
            "terrific",
            "incandescent",
            "serpentine",
            "vivacious"
    };

    public static String[] nouns = {
            "galaxy",
            "dragon",
            "plasma",
            "shadow",
            "vortex",
            "chaos",
            "underworld",
            "hell",
            "purgatory",
            "wolverine"
    };

    public static String randomElement(String[] array){
        return array[randNum.nextInt(array.length)];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
