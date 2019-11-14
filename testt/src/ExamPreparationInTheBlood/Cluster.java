package ExamPreparationInTheBlood;
import ExamPreparationInTheBlood.cells.Cell;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private String id;
    private int cols;
    private int cells;
    private List<Cell> allCells;

    public Cluster(String id, int cols, int cells) {
        this.id = id;
        this.cols = cols;
        this.cells = cells;
        this.allCells = new ArrayList<>();
    }

    @Override
    public String toString() {
       return String.format("Created cluster %s", this.id);
    }
}
