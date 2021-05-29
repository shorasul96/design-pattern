# Adapter Pattern

The adapter pattern allows two incompatible interfaces to work <br>
together. This is the real-world definition for an adapter. Interfaces<br>
maybe incompatible, but the inner functionality should suit the need.<br>
The adapter design pattern allows otherwise incompatible classes to <br>
work together by converting the interface of one class into an interface <br>
expected by clients.<Br>
An adapter can be used when the wrapper must respect a particular interface and<br> 
must support polymorphic behavior. Alternatively, a decorator makes it possible <br>
to add or alter behavior of an interface at run-time, and a facade is used when<br>
an easier or simpler interface to an underlying object is desired.

The adapter design pattern solves problems like:

* How can a class be reused that does not have an interface <br>
  that a client requires?
* How can classes that have incompatible interfaces <BR>
  work together?
* How can an alternative interface be provided for <bR>
a class?
  
The key idea in this pattern is to work through a separate adapter that adapts<BR>
the interface of an (already existing) class without changing it.

Clients don't know whether they work with a target class directly or through an adapter<BR>
with a class that doesn't have the target interface.

### Source:
[https://en.wiki.org/wiki/Adapter_pattern](https://en.wiki.org/wiki/Adapter_pattern)