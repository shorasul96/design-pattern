#Singleton Pattern

The singleton pattern is a software design pattern that restricts<BR>
the instantiation of a class to one "single" instance. This is useful<BR>
when exactly one object is needed to coordinate actions across the system.<BR>
The term comes from the mathematical concept of a singleton. 

Critics consider the singleton to be an anti-pattern in that it is frequently<BR>
used in scenarios where it is not beneficial, introduces unnecessary restrictions<BR>
in situations where a sole instance of a class is not actually required, and <BR>
introduces global state into an application.

The key idea in this pattern is to make the class itself responsible for controlling<BR>
its instantiation (that it is instantiated only once).
<BR><BR>
The hidden constructor (declared private or protected) ensures that the class<BR>
can never be instantiated from outside the class.
<BR><BR>
The public static operation can be accessed easily by using the class<BR> name and operation name (Singleton.getInstance()).


<B>The Singleton design pattern solves problems like:</b>
* How can it be ensured that a class has only one instance?
* How can the sole instance of a class be accessed easily?
* How can a class control its instantiation?
* How can the number of instances of a class be restricted?
* How can a global variable be accessed?

<B>Common uses:</B>

* The abstract factory, factory method, builder, and prototype patterns can use singletons in their implementation.
* Facade objects are often singletons because only one facade object is required.
* State objects are often singletons.
<BR><BR>
<B>Anti-pattern considerations:</b><BR>
  The Singleton Pattern is generally considered an anti-pattern for the following reasons: 
  
<B>Singleton classes break object-oriented design principles, why?</B><BR>

1) It cannot be inherited from. To add new functionality, a new class cannot be<BR>
   descended to contain that functionality, breaking Separation of Concern.
2) No control over creation. It is impossible to tell if a reference is of<BR>
   an existing instance or a new instance. 
3) Prevents dependency injection. As there is only a single instance of the<BR>
   class, a dependency cannot be injected into it. If done via a property,<BR>
   the dependency is changed for all references to that instance.
   
<B>Singleton classes do not allow for test-driven development (TDD)</B>
1) As there is no control over creation, a "clean" instance of the object cannot<BR>
   be used for each test.
2) Without dependency injection mock, objects cannot be used in tests.    

###Source:
[https://en.wikipedia.org/wiki/Singleton_pattern](https://en.wikipedia.org/wiki/Singleton_pattern)