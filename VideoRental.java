
// The program calculates the
// amount and total cost for renting videos. It uses
// GUI dialog boxes to display the information.

public class VideoRental {
    // declares private data types
    private int rentalFee;
    private int finalBill;
    
    // creates a constructor to initialize values
    public VideoRental() {
        rentalFee = 0;
        finalBill = 0;
    }
    
    // sets the rental fee to an integer value
    public void setRentalFee(int inFee) {
        rentalFee = inFee;
    }
    
    // calculates the bill using a value from user input
    public void calculateBill(int numberOfVideos) {
        finalBill = numberOfVideos * rentalFee;

    }
    
    // returns the finalBill value
    public int getFinalBill() {
        return finalBill;
    }

}
