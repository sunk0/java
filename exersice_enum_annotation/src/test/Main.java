package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        System.out.printf("%s:\n", input);

        for (Types types : Types.values()) {
            System.out.printf("Ordinal value: %s; Name value: %s\n", types.ordinal(), types);
        }
    }
}
