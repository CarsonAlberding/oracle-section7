//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        
        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4);
        Cell_Student_7_5 cell1 = new Cell_Student_7_5("Cell 1", 1234, false);
        bubba.display(true);
        cell1.set_door_state(false, 1234);

    }
}
