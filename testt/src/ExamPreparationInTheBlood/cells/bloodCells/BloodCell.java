package ExamPreparationInTheBlood.cells.bloodCells;

import ExamPreparationInTheBlood.cells.Cell;

public abstract class BloodCell extends Cell {

    public BloodCell(String id, int health, int positionRow, int positionCol) {
        super(id, health, positionRow, positionCol);
    }
}
