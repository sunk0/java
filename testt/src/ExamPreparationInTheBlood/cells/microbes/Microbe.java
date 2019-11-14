package ExamPreparationInTheBlood.cells.microbes;

import ExamPreparationInTheBlood.cells.Cell;

public abstract class Microbe extends Cell{
    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        setVirulence(virulence);
    }

    private void setVirulence(int virulence) {
       if (virulence > 0){
           this.virulence = virulence;
       }
    }
}
