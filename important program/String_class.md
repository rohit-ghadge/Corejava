### String Class :-
* syntax of the String Class:-

* public final String class extends object implements charSequence,Serilizable,Comparable.
  {
     //many method 
  }
-----------------------------------------------------------------------------------------------------------------------
* String is immutable. why ??
* String is immutable in java because String pool get memory in String pool.if the String litreal is used in multipale
  people then there is always a risk if one perons value is change then if will affect the all other persons.
* ex:-
  if String Employee1 = "Mumbai_Branch"; 
     String Employee2 = "Mumbai_Branch";
     String Employee3 = "Mumbai_Branch";
   - if all Employee are from Mumbai_Branch then it will point to same literal in the string pool.
* if the Employee2 is shift to "Pune_Branch" then stirng is immutable so it will create new object .
* if String is mutable then it change the all employees so sting is immutable in java.

* HashMap work on the principal of the hasing. if will turn the key to the hashcode.
* if we take the key as a String then sting is immutable so it will create hashcode only once.so retrival in the 
  hashmap is very fast.

* for security string is final and immutable so its very secure.
-----------------------------------------------------------------------------------------------------------------------
* String s = new String; two object created one in Heap and other in String pool;
* String s="Rohit";   one object is created in the string pool.
* String pool is not applicable for garbage collected because jvm internally pointing to it.

