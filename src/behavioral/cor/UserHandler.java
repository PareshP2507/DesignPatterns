package behavioral.cor;

public class UserHandler extends UrlHandler {

    private static final String USER_URL_PREFIX = "/user";

    @Override
    public void handleRequest(String url) {
        System.out.println("Handling user URL: " + url);
    }

    @Override
    public boolean canHandle(String url) {
        return url.startsWith(USER_URL_PREFIX);
    }
}
