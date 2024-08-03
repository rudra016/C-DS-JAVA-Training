import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RailwayBookingSystem extends JFrame {
    private Connection conn;
    private JTextField bookingIdField, usernameField, ageField, genderField, mobileField, emailField,
            dojField, sourceField, destField, ticketPriceField, seatPreferenceField;

    public RailwayBookingSystem() {
        super("Railway Booking System");
        initializeUI();

        String url = "jdbc:mysql://localhost:3306/railwaybook";
        String username = "root";
        String password = "";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("DB Connected");
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to connect to the database.", ex);
        }
    }

    private void initializeUI() {
        JFrame frame = new JFrame("Railway Booking System");

        JLabel personalLabel = new JLabel("Personal Details");
        personalLabel.setBounds(10, 10, 120, 30);
        frame.add(personalLabel);

        JLabel ticketDetailsLabel = new JLabel("Ticket Details");
        ticketDetailsLabel.setBounds(310, 10, 120, 30);
        frame.add(ticketDetailsLabel);

        JLabel usernameLabel = new JLabel("Add Username");
        usernameLabel.setBounds(10, 50, 120, 30);
        frame.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(130, 50, 100, 30);
        frame.add(usernameField);

        JLabel dateOfJourneyLabel = new JLabel("Date Of Journey");
        dateOfJourneyLabel.setBounds(310, 50, 120, 30);
        frame.add(dateOfJourneyLabel);

        dojField = new JTextField();
        dojField.setBounds(430, 50, 100, 30);
        frame.add(dojField);

        JLabel ageLabel = new JLabel("Add Age");
        ageLabel.setBounds(10, 80, 120, 30);
        frame.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(130, 80, 100, 30);
        frame.add(ageField);

        JLabel sourceLabel = new JLabel("Source");
        sourceLabel.setBounds(310, 80, 120, 30);
        frame.add(sourceLabel);

        sourceField = new JTextField();
        sourceField.setBounds(430, 80, 100, 30);
        frame.add(sourceField);

        JLabel genderLabel = new JLabel("Add Gender");
        genderLabel.setBounds(10, 110, 120, 30);
        frame.add(genderLabel);

        genderField = new JTextField();
        genderField.setBounds(130, 110, 100, 30);
        frame.add(genderField);

        JLabel destinationLabel = new JLabel("Enter Destination");
        destinationLabel.setBounds(310, 110, 120, 30);
        frame.add(destinationLabel);

        destField = new JTextField();
        destField.setBounds(430, 110, 100, 30);
        frame.add(destField);

        JLabel emailLabel = new JLabel("Add Email:");
        emailLabel.setBounds(10, 140, 120, 30);
        frame.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 140, 100, 30);
        frame.add(emailField);

        JLabel ticketPriceLabel = new JLabel("Enter Ticket Price:");
        ticketPriceLabel.setBounds(310, 140, 120, 30);
        frame.add(ticketPriceLabel);

        ticketPriceField = new JTextField();
        ticketPriceField.setBounds(430, 140, 100, 30);
        frame.add(ticketPriceField);

        JLabel mobileLabel = new JLabel("Add Mobile:");
        mobileLabel.setBounds(10, 170, 120, 30);
        frame.add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(130, 170, 100, 30);
        frame.add(mobileField);

        JLabel seatLabel = new JLabel("Enter Seat Pref:");
        seatLabel.setBounds(310, 170, 120, 30);
        frame.add(seatLabel);

        seatPreferenceField = new JTextField();
        seatPreferenceField.setBounds(430, 170, 100, 30);
        frame.add(seatPreferenceField);

        JLabel bookingIdLabel = new JLabel("Booking ID:");
        bookingIdLabel.setBounds(10, 200, 120, 30);
        frame.add(bookingIdLabel);

        bookingIdField = new JTextField();
        bookingIdField.setBounds(130, 200, 100, 30);
        frame.add(bookingIdField);

        JButton bookTicketButton = new JButton("Book Ticket");
        bookTicketButton.setBounds(10, 250, 120, 30);
        bookTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookTicket();
            }
        });
        frame.add(bookTicketButton);

        JButton updateButton = new JButton("Update Booking");
        updateButton.setBounds(150, 250, 150, 30);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateBooking();
            }
        });
        frame.add(updateButton);

        JButton deleteButton = new JButton("Delete Booking");
        deleteButton.setBounds(320, 250, 150, 30);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteBooking();
            }
        });
        frame.add(deleteButton);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
    }

    private void updateBooking() {
        int bookingId = Integer.parseInt(bookingIdField.getText());
        String newUsername = usernameField.getText();

        try {
            String updateQuery = "UPDATE booktb SET username=? WHERE booking_id=?";
            PreparedStatement statement = conn.prepareStatement(updateQuery);
            statement.setString(1, newUsername);
            statement.setInt(2, bookingId);
            statement.executeUpdate();
            System.out.println("Booking updated successfully.");
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to update booking.", ex);
        }
    }

    private void bookTicket() {
        String username = usernameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String gender = genderField.getText();
        String mobile = mobileField.getText();
        String email = emailField.getText();
        String doj = dojField.getText();
        String source = sourceField.getText();
        String dest = destField.getText();
        String ticketPrice = ticketPriceField.getText();
        String seatPreference = seatPreferenceField.getText();

        try {
            String insertQuery = "INSERT INTO booktb (username, age, gender, mobile, email, doj, source, dest, ticketPrice, seatPreference) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(insertQuery);
            statement.setString(1, username);
            statement.setInt(2, age);
            statement.setString(3, gender);
            statement.setString(4, mobile);
            statement.setString(5, email);
            statement.setString(6, doj);
            statement.setString(7, source);
            statement.setString(8, dest);
            statement.setString(9, ticketPrice);
            statement.setString(10, seatPreference);
            statement.executeUpdate();
            System.out.println("Ticket booked successfully.");
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to book ticket.", ex);
        }
    }

    private void deleteBooking() {
        int bookingId = Integer.parseInt(bookingIdField.getText());

        try {
            String deleteQuery = "DELETE FROM booktb WHERE booking_id=?";
            PreparedStatement statement = conn.prepareStatement(deleteQuery);
            statement.setInt(1, bookingId);
            statement.executeUpdate();
            System.out.println("Booking deleted successfully.");
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to delete booking.", ex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RailwayBookingSystem();
            }
        });
    }
}
