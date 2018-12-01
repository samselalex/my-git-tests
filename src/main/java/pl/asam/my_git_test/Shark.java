package pl.asam.my_git_test;

public class Shark extends Animal {
    public Shark(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}

