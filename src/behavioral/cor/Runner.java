package behavioral.cor;

public class Runner {
    public static void main(String[] args) {
        UrlParserWithHandlers urlParserWithHandlers = new UrlParserWithHandlers();
        urlParserWithHandlers.handleRequest("/product/123");
        urlParserWithHandlers.handleRequest("/user/456");
        urlParserWithHandlers.handleRequest("/unknown/789");
    }
}
