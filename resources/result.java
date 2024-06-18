private class Example {
    private int number;
    private String text;

    private Example(int number, String text) {
        this.number = number;
        this.text = text;
    }

    private void printInfo() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
}
