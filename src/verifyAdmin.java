import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class verifyAdmin extends JFrame {
    JButton submitBtn;
    JLabel adminLbl;
    JPasswordField passWordInput;
    JPanel midPanel,topPanel;

    String[] passkeyDB = new String[]{
            "letran","arriba","admin"
    };

    public verifyAdmin() {


        topPanel = new JPanel();
        adminLbl = new JLabel();
        midPanel = new JPanel();
        passWordInput = new JPasswordField();
        submitBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500,500);
        setUndecorated(true);
        setVisible(true);
        topPanel.setBackground(new Color(0, 0, 0));

        adminLbl.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        adminLbl.setForeground(new Color(255, 255, 255));
        adminLbl.setHorizontalAlignment(SwingConstants.CENTER);
        adminLbl.setText("Admin");

        GroupLayout topPanelLayout = new GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
                topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(topPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(adminLbl, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
                topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(adminLbl, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getContentPane().add(topPanel, BorderLayout.PAGE_START);

        midPanel.setBackground(new Color(255, 255, 255));

        passWordInput.setToolTipText("Enter Password");
        passWordInput.setMargin(new Insets(2, 8, 8, 2));

        submitBtn.setBackground(new Color(0, 0, 0));
        submitBtn.setForeground(new Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitAdminPass(e);
            }
        });

        passWordInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    JFrame f = new JFrame();

                    char[] pass = passWordInput.getPassword();
                    String passConverted = String.valueOf(pass).toLowerCase();
                    passConverted = passConverted.replaceAll("\\p{Punct}", "");

                    if (Arrays.asList(passkeyDB).contains(passConverted)) {
                        submitBtn.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                submitBtn.setText("Processing");
                                JOptionPane.showMessageDialog(f, "Hello Admin");

                                setVisible(false);
                            }
                        });
                    }else{
                        JOptionPane.showMessageDialog(f, "Incorrect Password");
                    }
                }
            }
        });

        GroupLayout midPanelLayout = new GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
                midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, midPanelLayout.createSequentialGroup()
                                .addContainerGap(125, Short.MAX_VALUE)
                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(submitBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passWordInput, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120))
        );
        midPanelLayout.setVerticalGroup(
                midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(midPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(passWordInput, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 37,GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(midPanel, BorderLayout.CENTER);

        pack();
    }

    public void submitAdminPass(ActionEvent e) {
        JFrame f = new JFrame();

        char[] pass = passWordInput.getPassword();
        String passConverted = String.valueOf(pass).toLowerCase();
        passConverted = passConverted.replaceAll("\\p{Punct}", "");

        if (Arrays.asList(passkeyDB).contains(passConverted)) {
            submitBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    submitBtn.setText("Processing");
                    JOptionPane.showMessageDialog(f, "Hello Admin");

                    setVisible(false);
                }
            });
        }else{
            JOptionPane.showMessageDialog(f, "Incorrect Password");
        }
    }

}
