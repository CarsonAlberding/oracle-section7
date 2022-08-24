public class Cell_Student_7_5 {
    String name;
    boolean door_state;
    int code;

    public Cell_Student_7_5(String name, int code, boolean door_state){
        this.name = name;
        this.code = code;
        this.door_state = door_state;
    }

    public String getName(){
        return name;
    }
    public boolean get_door_state(){
        return door_state;
    }
    public void set_door_state(boolean door_state, int code){
        if (code == 1234){
            if (door_state == false) {
                this.door_state = true;
                System.out.println("Door opened");
            } else {this.door_state = false;}
        } else{System.out.println("Wrong code");}
    }

}
