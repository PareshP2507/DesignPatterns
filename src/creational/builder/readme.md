# Builder Design Pattern

The Builder Design Pattern is a creational design pattern that provides a way to construct complex objects step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

## When to Use
- When the construction process of an object is complex and involves multiple steps.
- When you want to create different representations of the same object.
- When you want to make the object construction process more readable and maintainable.

## How to Create a Classic Builder Pattern in Java

### Step 1: Create a Product Class
This is the complex object that needs to be built. For example, we need to create an object for social media post which has title and content as required parameter, wherein photo is an optional parameter. As you have noticed the object has only getters. The second steps explains how we can set these parameters.

```java
public class Post {

    // Required parameters
    private String title;
    private String content;

    // Optional parameter
    private String photo;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
```

### Step 2: Create a separate Builder inner class
This inner class contains methods to set each property of the constructed object. As you can see, Builder accepts two required parameters in it's constructor and it also provide `setPhoto()` to provide an optional photo parameter.

At last, Builder has a `build()` method which creates the actual object with given parameters.

```java
public class Post {

    // ... other code

    private Post(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.photo = builder.photo;
    }

    // ... other code

    public static class Builder {
        private String title;
        private String content;
        private String photo;

        public Builder(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public Builder setPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}

```

### Step 3: Use the Builder Pattern
Use the `Director` and `Builder` to construct the product.

```java
public class Main {
    public static void main(String[] args) {
        Post post = new Post.Builder("My First Post", "This is the content of my first post.")
                .setPhoto("photo.jpg")
                .build();
        System.out.println(post);
    }
}
```
#### Output
```
Post{title='My First Post', content='This is the content of my first post.', photo='photo.jpg'}
```

## Pros
- Provides control over the construction process.
- Makes the code more readable and maintainable.
- Allows the creation of different representations of the same object.

## Cons
- Can increase the complexity of the codebase.
- Requires additional classes for the builder and director.

## Real-World Examples
- Building complex UI components in frameworks.
- Constructing SQL queries using query builders.
- Creating immutable objects like `StringBuilder` in Java.
