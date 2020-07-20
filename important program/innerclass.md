### Anonymous Inner Class :-
A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:

    Class (may be abstract or concrete).
    Interface


abstract class Person{
  abstract void eat();
}

class TestAnnonymousInner{
 public static void main(String args[]){
  Person p=new Person(){
  void eat(){System.out.println("nice fruits");}
  };

  p.eat();
 }
}
---------------------------------------------------------------------------------------------------------------------
### Functional Interface :-
 - FP treats functions as first-class citizens:-
 - It enables functional programming
   in java.
 - To write more readable,maintainable and concise code.

 - With the help of functional interface you can use lambda expression in java.
 - what is functional interface : If an interface having only one abstract method then it’s called functional        	interface.
 - A lambda expression can receive zero, one or more parameters.
 - Parameters are enclosed in parentheses and separated by commas.
 - Empty parentheses are used to represent an empty set of parameters.

--------------------------------------------------------------------------------------------------------------------
Some of the functional interfaces are :

    Runnable
    Predicate<T>
    Consumer<T>
    Function<T,R>
    EventHandler<T extends Event>

and many more to name.

Lambda just makes working with these interfaces very much simpler and the code to be pretty much concise and readable. They serve to facilitate functional programming with Java.

A typical lambda expression consists of the following

    Argument list - Inside parentheses separated by commas. (Datatype may or may not be specified)
    Arrow Token - “->”
    Body - This includes the code to be written inside the overridden method.

---------------------------------------------------------------------------------------------------------------------

Java 8 Features

Some of the important Java 8 features are;

   - forEach() method in Iterable interface
   - default and static methods in Interfaces
   - Functional Interfaces and Lambda Expressions
   - Java Stream API for Bulk Data Operations on Collections
   - Java Time API
   - Collection API improvements
   - Concurrency API improvements
   - Java IO improvements
   - Miscellaneous Core API improvements
----------------------------------------------------------------------------------------------------------------------
