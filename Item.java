public abstract class Item {
    private final String title;

    protected Item(String title) {
        if (title == null) throw new IllegalArgumentException("title cannot be null");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
