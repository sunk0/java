package ExamPreparationInTheBlood;

import java.util.HashMap;
import java.util.Map;

public class HealthManager {
    Map<String, Organism> organisms = new HashMap<>();

    public String checkCondition(String organismName) {
        return null;
    }

    public String createOrganism(String name) {
        if (!organisms.containsKey(name)) {
            return String.format("Created organism %s", name);

        } else {
            return String.format("Organism " + name + " already exists");
        }

    }

    public String addCluster(String organismName, String id, int rows, int cols) {
        Cluster currentCluster = new Cluster(organismName, rows, cols);
        Organism organism = new Organism(organismName);
        organism.getAllClusters().add(currentCluster);
        return currentCluster.toString();
    }

    public String addCell(String organismName, String clusterId, String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty) {
        return null;
    }

    public String activateCluster(String organismName) {
        return null;
    }
}
