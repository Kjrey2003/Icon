import javax.swing.*;
public class Magic{
    
    public static void main(String[] args) {
        int year, month, day;

        final ImageIcon icon = new ImageIcon("C:/Users/Kajan/IdeaProjects/Lab 3/1416-thumbs-up-hd-photo-thumb.png");
        final ImageIcon icon2 = new ImageIcon("C:/Users/Kajan/IdeaProjects/Lab 3/11-111981_sad-face-icon-png-transparent-png.jpg");
    
    JOptionPane.showMessageDialog(null, "This is a Magic Date calculator! In this program you'll enter a date to see if it's magic!", "Welcome!", 0, icon);
    day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a day of the month"));
        if(day > 31){
            JOptionPane.showMessageDialog(null, "Sorry, The day of the month can't be bigger than 31 :(", "ERROR", 0);
            System.exit(0);
        }
    month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a month as a number, for example if it's June enter 6"));
    year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the last 2 digits of the year you choose"));
        
    
    if(month * day == year){
        JOptionPane.showMessageDialog(null, "This year is magic!", "It's Magic!", 0, icon);

    }
    else{
        JOptionPane.showMessageDialog(null, "I'm sorry, this year is not magic", "The magic isn't here", 0, icon2);
    }

}

}