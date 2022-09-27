public class Fish implements Prey,Predator{

    public void hunt(){
        System.out.println("This fish is hunting smaller fish.");
    }

    public void flee(){
        System.out.println("This fish is fleeing from a larger fish.");
    }

}
