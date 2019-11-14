package ExamPreparationInTheBlood;

import java.util.List;

public class Organism {
    private String name;
    private List<Cluster> allClusters;

    public Organism(String name) {
        this.name = name;
    }

    public List<Cluster> getAllClusters() {
        return allClusters;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
