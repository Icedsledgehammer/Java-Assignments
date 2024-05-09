Multiple Inheritance in Java - Duck Behaviors
This Java program demonstrates the concept of multiple inheritance using interface-based implementation for duck behaviors. The program defines various behaviors such as flying, quacking, and swimming as separate interfaces (FlyBehaviour, QuackBehaviour, SwimBehaviour). Different duck types (Duck subclasses) then implement these behaviors using composition.

Program Components
Duck Classes
Duck (Duck.java): Abstract base class for different types of ducks.
    Holds references to FlyBehaviour, QuackBehaviour, and SwimBehaviour interfaces.
    Provides methods to set and perform behaviors dynamically.

RubberDuck (RubberDuck.java): Represents a specific type of duck.
    Initializes behaviors (FlyNoWay, Squeak, SwimNoWay) using composition.
    Implements display() method to describe the duck.

RedHeadDuck (RedHeadDuck.java): Represents another type of duck.
    Initializes behaviors (FlyWithWings, Quack, Swim) using composition.
    Implements display() method to describe the duck.

Behavior Interfaces
  FlyBehaviour (FlyBehaviour.java): Interface defining the fly() method.

Implemented by FlyNoWay and FlyWithWings classes.
  QuackBehaviour (QuackBehaviour.java): Interface defining the quack() method.

Implemented by Quack and Squeak classes.
  SwimBehaviour (SwimBehaviour.java): Interface defining the swim() method.

Implemented by Swim and SwimNoWay classes.
  Main Class (Main.java)
  Main (Main.java): Contains the main() method to test duck behaviors.

Creates instances of RedHeadDuck and DecoyDuck.
  Calls display and behavior methods (performFly(), performQuack(), performSwim()).
