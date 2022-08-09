package Template;

public abstract class Page {
    public void showPage() {
        System.out.println("Head");
        pageContent();
        System.out.println("Footer");
    }
    public abstract void pageContent();
}
