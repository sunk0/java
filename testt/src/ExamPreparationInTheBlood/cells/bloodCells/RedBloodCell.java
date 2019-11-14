package ExamPreparationInTheBlood.cells.bloodCells;

public class RedBloodCell extends BloodCell {
    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        setVelocity(velocity);
    }

    private void setVelocity(int velocity) {
       if (velocity > 0){
           this.velocity = velocity;
       }
    }
}
