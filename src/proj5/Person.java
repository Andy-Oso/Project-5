package proj5;

/**
 * The Person class definition. Has a constructor and no setter methods but has
 * getter methods. Has a string first name, a char middle initial, and string 
 * last name.
 * 
 * @author Andy Osorio, Thomas Lawless, Justin Moran, SCCC Spring 2019
 */
class Person {

  // The instance variables
  private String firstName;
  private char middleInitial;
  private String lastName;

  /**
  * A constructor for a Person object. Initializes the instance variables without
  * setter methods. Arguments are a string for the first name, a char for the
  * middle initial, and a string for the last name
  */
  public Person(String firstName, char middleInitial, String lastName) {
    this.firstName = firstName;
    this.middleInitial = middleInitial;
    this.lastName = lastName;
  }

  /**
   * Returns the first name of a Person object.
   * 
   * @return The first name as a String type
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the middle initial of a Person object.
   * 
   * @return The middle initial as a char type
   */
  public char getMiddleInitial() {
    return this.middleInitial;
  }

  /**
   * Returns the last name of a Person object.
   * 
   * @return The last name as a String type
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * An override toString() method for a Person object. Returns a Person object
   * as a String
   * @return A Person object as a string
   */
  @Override
  public String toString(){
    return this.getFirstName() +" "+ Character.toString(this.getMiddleInitial()) +" "+ this.getLastName();
  }
  
  
}