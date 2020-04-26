package ac.elevation.java.oop.evaluation;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ListIterator<Animal> zoo_iter = zoo.Iterator();

        // ex1
        zoo_iter.add(new Lion("Simba"));
        //
        //add more Animal to the Zoo.
        // .
        // .
        // .

        // ex2
        zoo_iter.add(new Whale("Willy"));

        // reset the iterator.
        zoo_iter = zoo.Iterator();
        while (zoo_iter.hasNext()) {
            var a = zoo_iter.next();
            System.out.println(a.toString());
        }
    }
}
