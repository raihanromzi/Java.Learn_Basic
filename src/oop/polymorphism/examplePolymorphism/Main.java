package oop.polymorphism.examplePolymorphism;

// Super Class
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// Subclasses
class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eat people";
    }
}

class KarateKid extends Movie{
    public KarateKid() {
        super("Karate kid");
    }

    @Override
    public String plot() {
        return "A kid who learn karate";
    }

}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "A space movie";
    }
}

class OldMovie extends Movie{
    public OldMovie() {
        super("Old Movie");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie " + i + " : " + movie.getName() + "\n" +
                                "Plot : " + movie.plot()
            );
        }

        Movie starWarsNew = new StarWars();
        System.out.println(starWarsNew.getName());
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new KarateKid();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new OldMovie();
        }
        return null;
    }
}
