package frameworks_driver.view.home;

import javax.swing.*;
import java.awt.*;

/**
 * Represents the button for accessing the chatbot feature.
 */
public class ChatBotButton extends JButton {

    /**
     * Constructs a new ChatBotButton with predefined styling.
     */
    public ChatBotButton() {
//        super("Chatbot");
//        setPreferredSize(new Dimension(150, 60));
//        setFont(new Font("Arial", Font.BOLD, 16));
//        setBackground(Color.WHITE);
//        setForeground(new Color(6, 26, 64));
//        setOpaque(true);
//        setBorder(BorderFactory.createLineBorder(new Color(6, 26, 64), 2));
//        HoverEffectUtility.applyHoverEffect(this);
        super("Chatbot");
        ImageIcon originalIcon = new ImageIcon("assets/chatbot_transparent.png");

        // Scale the icon to an appropriate size
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH); // Adjust size as needed
        setIcon(new ImageIcon(scaledImage));

        // Remove button visual elements to make it appear as only the icon
        setText("");                 // Remove text
        setContentAreaFilled(false); // No background
        setBorderPainted(false);     // No border
        setFocusPainted(false);      // No focus outline
        setOpaque(false);            // Fully transparent

        // Optional: Add hover or click effects if needed
        HoverEffectUtility.applyHoverEffect(this);
        addActionListener(actionListener);
    }
}