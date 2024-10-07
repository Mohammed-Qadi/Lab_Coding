

public class Kindle {
    private int numberOfPages;
    private int currentPage;

    public Kindle() {
        numberOfPages = 0;
        currentPage = 1;
    }//end of the default constructor

    public Kindle(int theNumberOfPages) {
        numberOfPages = theNumberOfPages;

    }//end of the constructor with one parameter

    public String toString() {

        return (
                String.format("Page %d of %d", currentPage, numberOfPages));
    }//end of the toString method

    public void turnPages(int number) {
        currentPage += number;
        if (currentPage > numberOfPages) {
            System.out.println("Turning " + number + " pages would take you past the last page.");
            currentPage = numberOfPages;
            System.out.println(this);
        }

    }//end of the turnPages(1p) method

    public void turnPages() {
        turnPages(1);

    }//end of the turnPages method with 0 parameter



}//end of the Kindle Class
