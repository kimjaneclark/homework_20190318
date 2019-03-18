public class Printer {

    private int noOfPages;
    private int tonerVolume;

    public Printer(int noOfPages, int tonerVolume){
        this.noOfPages = noOfPages;
        this.tonerVolume = tonerVolume;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public int print(int noOfPagesPrint, int copies){
        if (noOfPagesPrint * copies <= noOfPages) {
            this.noOfPages = noOfPages - noOfPagesPrint * copies;
        }
        return noOfPages;

//        public int printJob(int noOfPagesPrint, int copies){}

    public int refill(int refillPages){
        this.noOfPages = noOfPages + refillPages;
        return noOfPages;
    }
}
