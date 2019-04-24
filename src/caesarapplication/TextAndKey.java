package caesarapplication;

public class TextAndKey {
    private String plainText;
    private int key;

    public TextAndKey(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    public String getPlainText() {
        return plainText;
    }

    public int getKey() {
        return key;
    }
}
