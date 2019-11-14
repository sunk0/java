package p03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (RANK_TYPE.equals(input)) {
            Class<RankPowers> rankTypeClass = RankPowers.class;
            printCustomEnumAnnotation(rankTypeClass);
        } else if (SUIT_TYPE.equals(input)) {
            Class<SuitPowers> suitTypeClass = SuitPowers.class;
            printCustomEnumAnnotation(suitTypeClass);
        }

    }
    private static void printCustomEnumAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Annotations.class)) {
            Annotations annotation = clazz.getAnnotation(Annotations.class);
            System.out.println(String.format(OUTPUT,
                    annotation.type(),
                    annotation.description()));
        }
    }
}