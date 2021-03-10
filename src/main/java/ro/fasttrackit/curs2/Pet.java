package ro.fasttrackit.curs2;

abstract class Pet {
    public static String NAME;
    public final String name;



    public Pet(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    abstract Pet friend();

    protected abstract String makeSound();


}
