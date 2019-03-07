package proj5;

import java.util.Comparator;

/**
 * Comparator class definition for Person objects. Sorts by last name, then
 * first name, and then middle initial
 * 
 * @author Andy Osorio, Thomas Lawless, James Moran, SCCC Spring 2019
 */
public abstract class PersonComparator implements Comparator{

    public int compare(Person p1, Person p2) {
        int lastDiff = p1.getLastName().charAt(0) - p2.getLastName().charAt(0);
        int firstDiff = p1.getFirstName().charAt(0) - p2.getFirstName().charAt(0);
        int midDiff = p1.getMiddleInitial() - p2.getMiddleInitial();
        if(lastDiff != 0){
            return lastDiff;
        }else if(firstDiff != 0){
            return firstDiff;
        }
        return midDiff;
    }
    
}
