import javax.swing.*;
import java.util.Calendar;

public class test {
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Datum och tid:\n" + Calendar.getInstance().getTime().toString());
        
    }
}