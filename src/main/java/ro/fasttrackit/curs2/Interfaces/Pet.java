package ro.fasttrackit.curs2.Interfaces;

public interface Pet {
    String NAME = "Pet";
    String getname();

    String makeSound();


    default String getColor(){
        return "Brown";
    }

    default String phrase(){
        logPhraseCall();
        return getname() + ": " + makeSound();
    }

    private void logPhraseCall(){
        System.out.println("phrase method was called");
    }


}
