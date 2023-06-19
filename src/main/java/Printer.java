public class Printer {
    private int numOfSheets;
    private int toner;

    public Printer(int numOfSheets, int toner) {
        this.numOfSheets = numOfSheets;
        this.toner = toner;
    }

    public int getNumOfSheets() {
        return this.numOfSheets;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int pages, int copies) {
        if (this.numOfSheets > (pages * copies)) {
            this.numOfSheets -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }


}
