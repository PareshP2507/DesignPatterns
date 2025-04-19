package creational.builder;

public class Runner {
    public static void main(String[] args) {
        // Create a post using the builder pattern
        Post post = new Post.Builder("My First Post", "This is the content of my first post.")
                .setPhoto("photo.jpg")
                .build();

        // Print the post details
        System.out.println(post);

        Post optionalPost = new Post.Builder("My second post", "This is the content of my second post.")
                .build();

        // Let's print the post details without photo since that is an optinal parameter
        System.out.println(optionalPost);
    }
}
