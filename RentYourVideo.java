import javax.swing.JOptionPane;

/**
 * RentYourVideo class
 * 
 * @author Sara Ghazzaoui
 *
 */

public class RentYourVideo {

    public static void main(String[] args) {
        
        int numberOfVideos;
        String message = new String();
        
        // creates reference to the VideoRental class
        VideoRental rent = new VideoRental();
        
        // allows for user input from a dialog box
        String renterName = JOptionPane.showInputDialog(null, "Enter renter name");
        String numberOfRentals = JOptionPane.showInputDialog(null, "Enter number of"
                + " videos to rent");
        // parses the string value to be stored as an integer
        numberOfVideos = Integer.parseInt(numberOfRentals);
        
        // passes the value 5 to the setRentalFee method
        rent.setRentalFee(5);
        // passes the user input for numberOfVideos to the method
        rent.calculateBill(numberOfVideos);
        
        // displays a message using a dialog box and calling the getFinalBill method
        if ( numberOfVideos == 0 ) {
            message = "Your total bill is $0";
        } else {
            message = renterName + " your total bill for " + numberOfVideos + 
                " videos is $" + rent.getFinalBill();
        }
        JOptionPane.showMessageDialog(null, message);
        
    }

}
