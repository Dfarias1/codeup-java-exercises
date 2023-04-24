import util.KotlinUtils;

public class ServerNameGenerator {

    private static String[] adjectives = {"arrogant", "adorable", "battle-worn", "breakable", "brave", "calculating", "charismatic", "clever", "cold-blooded", "courageous"};


    private static String[] nouns = {"armour", "blossom", "cow", "patch", "firearm", "breath", "bribe", "actor", "ice", "gold"};


    public static String randomElement(String[] stringArray){
        int index = KotlinUtils.getRandomInt(0, stringArray.length-1);
        return stringArray[index];
    }

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adj = randomElement(adjectives);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", adj, noun);
    }

}