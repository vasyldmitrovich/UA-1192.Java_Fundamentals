public class Example {
    public int number;
    public String text;

    public Example(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void printInfo() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
}
