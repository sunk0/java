package ExamPreparationInTheBlood.cells.bloodCells;

public class WhiteBloodCell extends BloodCell {
    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        setSize(size);
    }

    private void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }
}
