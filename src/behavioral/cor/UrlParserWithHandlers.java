package behavioral.cor;

public class UrlParserWithHandlers {
    
    private UrlHandler firstHandler;

    public UrlParserWithHandlers() {
        // Initialize the chain of handlers
        UrlHandler productHandler = new ProductHandler();
        UrlHandler userHandler = new UserHandler();
        UrlHandler notFoundHandler = new NotFoundHandler();
        
        // Set up the chain
        productHandler.setNextHandler(userHandler);
        userHandler.setNextHandler(notFoundHandler);
        
        // Set the first handler
        this.firstHandler = productHandler;
    }

    public void handleRequest(String url) {
        firstHandler.handle(url);
    }
}
