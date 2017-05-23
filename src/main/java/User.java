/**
 * Created by aman on 5/22/17.
 */
public class User {
    String name;
    boolean happy = false;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
    public void printHappyMsg(){
        if(!happy){
            throw new IllegalStateException();
        }
        System.out.println("i m happy");
    }

}
