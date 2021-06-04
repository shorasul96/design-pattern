#Factory Method Pattern

The factory method pattern is a creational pattern that uses factory<br>
methods to deal with the problem of creating objects without having to<br>
specify the exact class of the object that will be created.
<br><br>
This is done by creating objects by calling a factory method-either specified<br>
in an interface and implemented by child classes, or implemented <br>
in a base class and optionally overridden by derived classes-rather<br>
than by calling a constructor. 
<br><br>
Creating an object often requires complex processes not appropriate to<br>
include within a composing object. The object's creation may lead to a <br>
significant duplication of code, may require information not accessible to <br>
the composing object, may not provide a sufficient level of abstraction, or <br>
may otherwise not be part of the composing object's concerns.

The factory method design pattern handles these problems by defining a <br>
separate method for creating the objects, which subclasses can then override <br>
to specify the derived type of product that will be created.

The factory method pattern relies on inheritance, as object creation is delegated<br>
to subclasses that implement the factory method to create objects.

The Factory Method design pattern is used by first defining a separate operation,<br>
a factory method, for creating an object, and then using this factory method by <br>calling
it to create the object. This enables writing of subclasses that decide how <br>
a parent object is created and what type of objects the parent contains.
<BR><BR>

<strong>Advantages of the Factory method pattern:</strong>

* Allows construction of classes with a component of a type that has not<br> been
  predetermined, but only defined in an "interface", or which is defined <bR>
  as a dynamic type.
* Allows construction of subclasses to a parent whose component type has<BR>
  not been predetermined, but only defined in an interface, or which is <BR>
  defined as a dynamic type.
* Allows for more readable code in cases where multiple constructors exist,<br>
  each for a different reason.  
* Allows a class to defer instantiation to subclasses, and to prevent direct instantiation of an object of the parent class type.


###Source:
[https://en.wikipedia.org/wiki/Factory_method_pattern](https://en.wikipedia.org/wiki/Factory_method_pattern)