//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    Cell_Student_7_5 cell1 = new Cell_Student_7_5("Cell 1", 1234, false);

    
    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: "+cell1);
    }

    
}
