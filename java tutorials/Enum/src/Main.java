enum Planet{
    MERCURY,VENUS,EARTH,JUPITER,SATURN,URANUS,NEPTUNE,PLUTO;

}

public class Main {
    public static void main(String[] args){
        // enum = enumerated (ordered listing of items in a collection)
        // grouping of constants that behave similarly to objects

        Planet myPlanet =Planet.PLUTO;
        CanILiveHere(myPlanet);
    }

    static void CanILiveHere(Planet myPlanet){

        switch(myPlanet){
            case EARTH:
                System.out.println("You can live here");
                break;
            default:
                System.out.println("You can't live here...yet");
                break;

        }
    }
}
