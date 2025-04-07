package behavioral.cor;

public class ProductHandler extends UrlHandler {

    private static final String PRODUCT_URL_PREFIX = "/product";

    @Override
    public void handleRequest(String url) {
        System.out.println("Handling product URL: " + url);
    }

    @Override
    public boolean canHandle(String url) {
        return url.startsWith(PRODUCT_URL_PREFIX);
    }
}
