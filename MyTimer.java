public class MyTimer extends JFrame {
    public static final long serialVersionUID = 1L;
    
    public MyTimer() {
        initGUI();
        setTitle("My Timer");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private initGUI() {
        TitleLabel titleLabel = new TitleLabel("My Timer");
        add(titleLabel, BorderLayout.PAGE_START);
        try {
            String className = UIManager.getCossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        }
        catch (Exception e) {}
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyTimer();
            }
        });
    }
    
    public static void main(String[] args) {
        
    }
