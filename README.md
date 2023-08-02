# Fancy-Integer-ArrayList
This project was to practice writing code in Java and applying overloading concept.

# INSTRUCTIONS
In this assignment, you will implement a class called CustomIntegerArrayList. This class represents a fancy ArrayList that stores integers and supports additional operations not included in Java's built-in ArrayList methods.

For example, the CustomIntegerArrayList class has a “splice” method which removes a specified number of elements from the CustomIntegerArrayList, starting at a given index. For a CustomIntegerArrayList that includes: 1, 2, 3, 4, and 5, calling splice(1, 2) will remove 2 items starting at index 1. This will remove 2 and 3 (the 2nd and 3rd items).

The CustomIntegerArrayList class has 2 different (overloaded) constructors. (Remember, an overloaded constructor is a constructor that has the same name, but a different number, type, or sequence of parameters, as another constructor in the class.) Having 2 different constructors means you can create an instance of the CustomIntegerArrayList class in 2
different ways, depending on which constructor you call.

Internally, the CustomIntegerArrayList class uses a private ArrayList variable named “arr” to store its integer elements. The “CustomIntegerArrayList()” constructor initializes the ArrayList variable “arr” as an empty ArrayList and the “CustomIntegerArrayList(ArrayList<Integer> arr)” constructor initializes the ArrayList variable “arr” with the elements in the given ArrayList.

There are 8 (mostly overloaded) methods that need to be implemented in the CustomIntegerArrayList class. (Again, an overloaded method is a method that has the same name, but a different number, type, or sequence of parameters, as another method in the same class.)

- getArrayList() - Returns the elements.
- get(int index) - Returns the element at the specified index from the elements.
- add(int element) - Appends the given element to the end of the elements.
- add(int index, int element) - Inserts the given element at the specified index.
- remove(int index) - Removes the element at the specified index.
- remove(int num, int element) - Removes the specified number of the given element
from all elements.
- splice(int index, int num) - Removes the specified number of elements from all
elements, starting at the given index.
- splice(int index, int num, int[] otherArray) - Removes the specified number of elements
from all elements, starting at the given index, and inserts new elements in the given
array at the given index.

# CODE - SOLUTION
you can find the script right here on this repository

# IMPLEMENTATION
![Screenshot from 2023-08-02 16-00-49](https://github.com/OrdoGeek/Fancy-Integer-ArrayList/assets/117246749/1b5447a6-b7a2-49a0-b7ea-bcbaa42d8521)
![Screenshot from 2023-08-02 16-01-11](https://github.com/OrdoGeek/Fancy-Integer-ArrayList/assets/117246749/bc48773d-2ef6-4a4a-85a3-79e557972865)
![Screenshot from 2023-08-02 16-01-24](https://github.com/OrdoGeek/Fancy-Integer-ArrayList/assets/117246749/502ec392-cb22-46fc-a2ea-daf597d2d3f2)

Output (as expected)

![Screenshot from 2023-08-02 16-02-31](https://github.com/OrdoGeek/Fancy-Integer-ArrayList/assets/117246749/b39fd269-f247-4d92-bf88-1a909cecbec5)





