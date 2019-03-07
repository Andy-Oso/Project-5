package proj5;

import java.util.ArrayList;
import java.util.List;

/**
 * The Demo class definition. Implements a main method to test out java collections
 * and the Person object.
 * 
 * @author Andy Osorio, Thomas Lawless, Justin Moran, SCCC Spring 2019
 */
public class Demo {
    public static void main(String [] args){
        Person Jen = new Person("Jen", 'B', "Adams");
        Person James = new Person("James", 'D', "Blames");
        Person Jane = new Person("Jane", 'E', "Crane");
        Person Jack  = new Person("Jack", 'F', "Drack");
        
        List<Person> list = new ArrayList();
        list.add(Jen);
        list.add(James);
        list.add(Jane);
        list.add(Jack);
    }
}
