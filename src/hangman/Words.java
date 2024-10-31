package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private static final String ICE_CREAM = "���������";
    private static final String SPACE = "������";
    private static final String PLATFORM = "���������";
    private static final String PARACHUTE = "�������";
    private static final String SUPERMARKET = "�����������";
    private static final String VOLCANO = "������";
    private static final String MIRROR = "�������";
    private static final String LIBRARY = "����������";
    private static final String LABYRINTH = "��������";
    private static final String COOKIE = "�������";
    private static final String TASK = "�������";
    private static final String SECRET = "������";
    private static final String SHIP = "�������";
    private static final String GARDEN = "������";
    private static final String PHOTO = "����������";
    private static final String SAND = "�����";
    private static final String DESERT = "�������";
    private static final String BICYCLE = "���������";
    private static final String SNOWMAN = "��������";
    private static final String TREE = "������";
    private static final String GUITAR = "������";
    private static final String FAIRY_TALE = "������";
    private static final String JOURNEY = "�����������";
    private static final String CAR = "����������";
    private static final String CHAMOMILE = "�������";
    private static final String TREASURE = "���������";
    private static final String TV = "���������";
    private static final String VILLAGE = "�������";
    private static final String SWEET = "�������";

    public static List<String> getListOfWords(){
        return new ArrayList<>(List.of(ICE_CREAM, SPACE, PLATFORM, PARACHUTE, SUPERMARKET, VOLCANO, MIRROR, LIBRARY, LABYRINTH,
        COOKIE, TASK, SECRET, SHIP, GARDEN, PHOTO, SAND, DESERT, BICYCLE, SNOWMAN, TREE, GUITAR, FAIRY_TALE, JOURNEY,
                CAR, CHAMOMILE, TREASURE, TV, VILLAGE, SWEET));
    }
}
