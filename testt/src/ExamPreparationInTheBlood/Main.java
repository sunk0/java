package ExamPreparationInTheBlood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HealthManager manager = new HealthManager();
        Map<String, Organism> allOrganism = new HashMap<>();

        while (true){
            String[] tokens = reader.readLine().split("\\s+");

            if (tokens[0].equals("BEER")){
                break;
            }

            switch (tokens[0]){
                case "checkCondition":
                    break;
                case "createOrganism":
                    implementCreateOrganism(allOrganism, tokens[1], manager);
                    break;
                case "addCluster":
                    implementCreateOrganism();
                    break;
                case "addCell":
                    break;
                case "activateCluster":
                    break;
            }
        }
    }

    private static void implementCreateOrganism(Map<String, Organism> allOrganism, String token, HealthManager manager) {
        if (!allOrganism.containsKey(token)){
            Organism organism = new Organism(token);
            allOrganism.put(token, organism);
            System.out.println(manager.createOrganism(token));
        } else {
            System.out.printf("Organism %s already exists", token);
        }
    }
}
