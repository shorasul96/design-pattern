# Prototype Pattern

The prototype pattern is a creational design pattern in software development.<BR>
It is used when the type of objects to create is determined by a prototypical<BR>
instance, which is cloned to produce new objects.

<b>The Prototype pattern is used for:</b>

* Avoid subclasses of an object creator in the client application,<br>
  like the factory method pattern does.
* Avoid the inherent cost of creating a new object in the standard <br>
  way, when it is prohibitively expensive for a given application.  
  
<b>The Prototype design pattern solves problems like:</b>

* How can objects be created so that which objects to create can be<bR>
  specified at run-time?
  
* How can dynamically loaded classes be instantiated?
<BR><BR>

Creating objects directly within the class that requires (uses)<br>
the objects is inflexible because it commits the class to particular<br>
objects at compile-time and makes it impossible to specify which objects<br>
to create at run-time.
<BR><BR>

To implement the pattern, declare an abstract base class that specifies<BR>
a pure virtual clone() method. Any class that needs a "polymorphic constructor"<br>
capability derives itself from the abstract base class, and implements the <br>
clone() operation. 
<BR><BR>

The client, instead of writing code that invokes the "new" operator<BR>
on a hard-coded class name, calls the clone() method on the prototype,<BR>
calls a factory method with a parameter designating the particular concrete<bR>
derived class desired, or invokes the clone() method through some mechanism <BR>
provided by another design pattern. 


###Source:
[https://en.wikipedia.org/wiki/Prototype_pattern](https://en.wikipedia.org/wiki/Prototype_pattern)