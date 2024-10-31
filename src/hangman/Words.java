package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private static final String ICE_CREAM = "лнпнфемне";
    private static final String SPACE = "йнялня";
    private static final String PLATFORM = "окюртнплю";
    private static final String PARACHUTE = "оюпюьчр";
    private static final String SUPERMARKET = "ясоеплюпйер";
    private static final String VOLCANO = "бскйюм";
    private static final String MIRROR = "гепйюкн";
    private static final String LIBRARY = "ахакхнрейю";
    private static final String LABYRINTH = "кюахпхмр";
    private static final String COOKIE = "оевемэе";
    private static final String TASK = "гюдюмхе";
    private static final String SECRET = "яейпер";
    private static final String SHIP = "йнпюакэ";
    private static final String GARDEN = "нцнпнд";
    private static final String PHOTO = "тнрнцпютхъ";
    private static final String SAND = "оеянй";
    private static final String DESERT = "осяршмъ";
    private static final String BICYCLE = "бекняхоед";
    private static final String SNOWMAN = "ямецнбхй";
    private static final String TREE = "депебн";
    private static final String GUITAR = "цхрюпю";
    private static final String FAIRY_TALE = "яйюгйю";
    private static final String JOURNEY = "осреьеярбхе";
    private static final String CAR = "юбрнлнахкэ";
    private static final String CHAMOMILE = "пнлюьйю";
    private static final String TREASURE = "янйпнбхые";
    private static final String TV = "рекебхгнп";
    private static final String VILLAGE = "депебмъ";
    private static final String SWEET = "йнмтерю";

    public static List<String> getListOfWords(){
        return new ArrayList<>(List.of(ICE_CREAM, SPACE, PLATFORM, PARACHUTE, SUPERMARKET, VOLCANO, MIRROR, LIBRARY, LABYRINTH,
        COOKIE, TASK, SECRET, SHIP, GARDEN, PHOTO, SAND, DESERT, BICYCLE, SNOWMAN, TREE, GUITAR, FAIRY_TALE, JOURNEY,
                CAR, CHAMOMILE, TREASURE, TV, VILLAGE, SWEET));
    }
}
