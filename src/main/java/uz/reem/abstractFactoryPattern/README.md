# Abstract Factory Pattern

The factory pattern is a creational design pattern. <br> 
The abstarct factory pattern provides a way to encapsulate
a group of individual factories that have a common theme without 
specifying their concrete classes. <br>
The essence of the Abstract Factory Pattern is to "Provide an 
interface for creating families of relative or dependent objects
without specifying their concrete classes."

The Abstract Factory design pattern solves problems like:
* How can be an application be independent of <br> how its objects 
are created?
* How can a class be independent of how the <br> objects it requires
are created?
* How can families of related or dependent <br>objects be created?  

The factory determines the actual concrete type of object 
to be created, and it is here that the object is actually created.
However, the factory only returns an abstract pointer to the created
concrete object.

### Source:
[https://en.wikipedia.org/wiki/Abstract_factory_pattern](https://en.wikipedia.org/wiki/Abstract_factory_pattern)
