# Composite Design Pattern

The Composite Design Pattern is a structural design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

In this example, we have implemented a file system structure where:

- `FileSystemComponent` is the **Component** interface.
- `Directory` is the **Composite** that can contain other components (files or directories).
- `File` is the **Leaf** that represents individual objects.

## Directory Structure

```
/structural/composite/
    ├── FileSystemComponent.java  // Component interface
    ├── Directory.java            // Composite class
    └── File.java                 // Leaf class
```

## Implementation details

### FileSystemComponent (Component)

The [FileSystemComponent](./FileSystemComponent.java) defines the common interface for both `File` and `Directory`.

### File (Leaf)

The [File](./File.java) class represents the leaf objects in the composition. It does not support adding or removing components.

### Directory (Composite)

The [Directory](./Directory.java) class represents the composite objects that can contain other components (files or directories).

## Example Usage

When you run [Runner](./Runner.java), you'll get the following output:

```
+ Root
  + Text Files
    - File: File1.txt, Size: 100KB
  + Image Files
    - File: File2.jpg, Size: 200KB
```

## Benefits

- Simplifies client code by treating individual objects and compositions uniformly.
- Makes it easier to add new types of components.

## Drawbacks

- Can make the design overly general, as it may force you to implement methods that are not meaningful for some components.

The Composite Design Pattern is particularly useful when dealing with tree structures like file systems, menus, or graphical user interfaces.