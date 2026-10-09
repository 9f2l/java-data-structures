# Java Data Structures

Worked examples of core data structures in Java, written while studying data structures at university.

## Contents

| Package | Topics |
|---|---|
| `net.arraylist` | `ArrayList` basics, iteration, sorting, size vs capacity, lists of custom objects |
| `net.linkedlist` | `LinkedList` operations and examples |
| `net.stacks` | `Stack` push/pop/peek/search/size, iteration |
| `net.queue` | `Queue` and `PriorityQueue` examples |
| `net.binarysearchtree` | Binary search tree: create, insert, delete, find min/max, in/pre/post-order traversal, node lookup, even/odd level difference |
| `net.heaps` | Min-heap and max-heap, including from-scratch implementations |
| `net.graphs` | Breadth-first and depth-first search |

## Run it

Requires a JDK (8 or newer). Each example has its own `main` method.

```bash
javac -d bin -sourcepath src src/net/binarysearchtree/inOrderBST.java
java -cp bin net.binarysearchtree.inOrderBST
```

Or import the `src` folder into Eclipse / IntelliJ and run any class directly.

## Notes

These are study exercises. Some of the simpler `ArrayList`, `Stack` and `Queue` examples follow common tutorial code.
