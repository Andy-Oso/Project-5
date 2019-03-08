package proj5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * The Demo class definition. Implements a main method to test out java collections
 * and the Person object.
 * 
 * @author Andy Osorio, Thomas Lawless, Justin Moran, SCCC Spring 2019
 */
public class Demo {
    public static void main(String [] args){
        
        Person Jon = new Person("Jon", 'C', "Alon");
        Person Jen = new Person("Jen", 'B', "Hen");
        Person James = new Person("James", 'D', "Blames");
        Person Debra = new Person("Debra", 'N', "Benra" );
        Person Jane = new Person("Jane", 'E', "Crane");
        Person Jack  = new Person("Jack", 'F', "Drack");
        Person Jill = new Person("Jill", 'A', "Dill");
        
        List<Person> list = new ArrayList();
        list.add(Jon);
        list.add(Jen);
        list.add(James);
        list.add(Debra);
        list.add(Jane);
        list.add(Jack);
        list.add(Jill);
        
        Collections.sort(list, new PersonComparator());
        
        Iterator iter = list.iterator();
        
        System.out.println("Sorted Person List: ");
        int i = 1;
        while(iter.hasNext()){
            System.out.println("#" + i + " " + iter.next());
            i++;
        }
    }
}
