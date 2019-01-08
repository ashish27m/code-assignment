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
   > - Assuming that bird sounds and bird singing is the same thing.
   > - Added swim method to Duck.
   > - Swim method is currently specific to Duck. No need to extract into a separate interface.
   > - Added unit tests for Chicken and Duck.
   
   