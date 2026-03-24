import database.DatabaseHelper;
import views.MainFrame;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ỨNG DỤNG GHI CHÚ + NHẮC NHỞ ===\n");
        
        // Test kết nối database
        
        
        // Chạy giao diện
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
