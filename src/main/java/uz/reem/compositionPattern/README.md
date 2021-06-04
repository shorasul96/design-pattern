#Composition Pattern

The composition pattern describes a group of objects that are<BR>
treated the same way as a single instance of the same type of <BR>
the object. The intent of a composition is to "compose" objects <BR>
into tree structures to represent part-whole hierarchies.<br>
Implementing the composition pattern lets clients treat individual<BR>
objects and compositions uniformly.
<br><br>

<strong> What problems can Composition Pattern solve?</strong><BR>

* A part-whole hierarchy should be represented so that clients <BR>
can treat part and whole objects uniformly.
* A part-whole hierarchy should be represented as tree structure.

When defining objects (1) Part objects and (2) Whole objects that <BR>
act as containers for Part objects, clients must treat them separately,<BR>
which complicates client code.
<BR><BR>

<strong> What solution does the composite design pattern describe? </strong><br>

* Define an undefined Component interface for both part (Leaf) <BR>
objects and whole (Composition) objects.
* Individual Leaf objects implement the Component interface directly,<br>  
and Composite objects forward requests to their child components.
  <BR><BR>
  
This enables clients to work through the Component interface to treat <BR>
Leaf and Composition objects uniformly: Leaf objects perform a request <BR>
to their child components recursively downwards the tree structure.<br>
This makes client classes easier to implement, change, test and reuse.
<BR><BR>

<strong>When to use Composition Pattern:</strong><br>
Composite should be used when clients ignore the difference between<BR>
compositions of objects and individual objects.<br>
If programmers find that they are using multiple objects in the same <BR>
way, and often have nearly identical code to handle each of them, then<BR>
composite is a good choice; it is less complex in this situation to treat<BR>
primitives and components as homogenous.

###Source:
[https://en.wikipedia.org/wiki/Composite_pattern](https://en.wikipedia.org/wiki/Composite_pattern)