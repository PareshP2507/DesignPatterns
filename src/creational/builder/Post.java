package creational.builder;

public class Post {

    // Required parameters
    private String title;
    private String content;

    // Optional parameters
    private String photo;

    private Post(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.photo = builder.photo;
    }

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
