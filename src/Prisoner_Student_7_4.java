//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner_Student_7_4 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }


    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
    public void printFields(){
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentence);
    }
    public void printFields(boolean years){
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentence);
        if (years = true){
            think();
        }
    }
    
}
