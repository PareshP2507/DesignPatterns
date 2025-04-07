package behavioral.cor;

abstract class UrlHandler {
    protected UrlHandler nextHandler;

    public abstract void handleRequest(String url);

    public abstract boolean canHandle(String url);

    public void handle(String url) {
        if (canHandle(url)) {
            handleRequest(url);
        } else if (nextHandler != null) {
            nextHandler.handle(url);
        } else {
            System.out.println("No handler found for URL: " + url);
        }
    }

    public void setNextHandler(UrlHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}