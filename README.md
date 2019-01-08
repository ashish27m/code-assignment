# code-assignment

1. Can you implement the sing() method for the bird?
    * How did you unit test it?
    > - Implemented unit tests for methods in Bird class. 
    > - Refactored code to return String instead of printing 
    the results in order to improve ease of testing.
    * How did you optimize the code for maintainability?
    > - Converted Animal class to an interface as there are no
    common methods to be abstracted and there is no current 
    requirement to instantiate an object of class Animal.

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
   implement them to make their own special sound?
    * A duck says: “Quack, quack”
    * A duck can swim
    * A chicken says: “Cluck, cluck”
    * A chicken cannot fly (assumption: its wings are clipped but ignore that)
   > - Added two new classes - Duck and Chicken
   > - Sing method was overridden to make sounds specific to these birds.
   > - Added swim method to Duck.
   > - Added unit tests for Chicken and Duck.
   
3. Now how would you model a rooster?
    * A rooster says: “Cock-a-doodle-doo”
    * How is the rooster related to the chicken?
    * Can you think of other ways to model a rooster without using inheritance?
    > - Created test case for new requirement.
    > - Created a new Rooster class by extending Chicken class.
    >   - Assumption: Chicken refers to the species as a whole and Rooster is a type of Chicken.
    > - Rooster is a specific type of Chicken.
    > - Without Inheritance, we can create Rooster as a separate class that implements the Animal interface with 
    extra methods that's specific to Chickens/Roosters. This would mean re-implementing methods in Bird and Chicken
    classes.   