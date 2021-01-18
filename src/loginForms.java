
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class loginForms extends JFrame {
    
    JButton loginBtn;
    JPanel midPanel;
    JPasswordField passWord;
    JLabel passWordLbl;
    JLabel studentNumLbl;
    JTextField studentNumber;
    JLabel title;
    JPanel topPanel;
    JLabel votingSysTitle;
    
    String[] studentNumDB = new String[]{
            "3180105","3180590","3180208", "3180023","3180306","3180168","3180169","3180034","3180080","3180143","3180400","3180301","3180491","3180429","3180002","3180076","3180068","3180010","3180004","3180288","3180285","3180007","3180305","3180248","3180387","3180266","3180099","3180105","3180302","3180083","3180247"
    };
    
    String[] studentNameDB = new String[]{
            "kurtjacob","Radji", "Mark", "John Patrick", "Kyla", "Catlyn", "Nathalie", "Christian", "Angeline", "Joaquin", "Kyle", "Leonardo", "Ivon", "Gherom", "Sean", "Mark", "Anton", "Jelamen", "Carlo", "Amiel", "Natalie", "Lhorrd", "Kenneth","Agatha", "Kyle", "Luis", "Christofer", "Krennt", "Jazztine", "Rebecca"
    };
    
    String[] passkeyDB = new String[]{
            "letran","arriba","admin"
    };
    
    String[] adminUserDB = new String[]{
            "kurt", "kurtjacob", "joaquin", "krennt", "carlo", "kenneth"
    };
    
    //String[] president


    public loginForms() {
        GridBagConstraints gridBagConstraints;
        
        topPanel = new JPanel();
        title = new JLabel();
        midPanel = new JPanel();
        passWordLbl = new JLabel();
        studentNumLbl = new JLabel();
        votingSysTitle = new JLabel();
        loginBtn = new JButton();
        passWord = new JPasswordField();
        studentNumber = new JTextField();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(300,300);
        setVisible(true);
        
        topPanel.setBackground(new Color(0, 0, 0));
        topPanel.setLayout(new GridBagLayout());
        
        title.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new Color(255, 255, 255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("LOGIN");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(31, 438, 26, 410);
        topPanel.add(title, gridBagConstraints);
        
        getContentPane().add(topPanel, BorderLayout.PAGE_START);
        
        passWordLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        passWordLbl.setText("Password : ");
        
        studentNumLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        studentNumLbl.setText("Student Number : ");
        
        votingSysTitle.setFont(new Font("Tahoma", 0, 48)); // NOI18N
        votingSysTitle.setText("VOTING SYSTEM");
        
        loginBtn.setBackground(new Color(0, 0, 0));
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setToolTipText("Click to login");
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginBtn.setBackground(Color.LIGHT_GRAY);
                loginBtn.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginBtn.setBackground(Color.BLACK);
                loginBtn.setForeground(Color.WHITE);;
            }
        });
        
        passWord.setText("password");
        passWord.setMargin(new java.awt.Insets(2, 8, 2, 2));
        passWord.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                passWord.setBackground(Color.BLACK);
                passWord.setForeground(Color.WHITE);
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
                passWord.setBackground(Color.WHITE);
                passWord.setForeground(Color.BLACK);
            }
        });


        
        studentNumber.setText("Enter student number");
        studentNumber.setMargin(new Insets(2, 8, 2, 2));
        studentNumber.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                studentNumber.setBackground(Color.BLACK);
                studentNumber.setForeground(Color.WHITE);
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
                studentNumber.setBackground(Color.WHITE);
                studentNumber.setForeground(Color.BLACK);
            }
        });

        
        GroupLayout midPanelLayout = new GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
                midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(midPanelLayout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(votingSysTitle)
                                        .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(midPanelLayout.createSequentialGroup()
                                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(passWordLbl)
                                                        .addComponent(studentNumLbl))
                                                .addGap(1, 1, 1)
                                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(studentNumber, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passWord, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(291, Short.MAX_VALUE))
        );
        midPanelLayout.setVerticalGroup(
                midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(midPanelLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(votingSysTitle)
                                .addGap(18, 18, 18)
                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentNumLbl)
                                        .addComponent(studentNumber, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(midPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(midPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(passWordLbl))
                                        .addComponent(passWord, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(114, Short.MAX_VALUE))
        );
        
        getContentPane().add(midPanel, BorderLayout.PAGE_END);
        
        pack();
    }// </editor-fold>
    
    //functions here
    private void loginBtnActionPerformed(ActionEvent evt) {
        JFrame f = new JFrame();
        if (evt.getSource() == loginBtn) {
            String studNumVerify = studentNumber.getText(); //perform your operation
        
            char[] pass = passWord.getPassword();
            String passConverted = String.valueOf(pass).toLowerCase();
            passConverted = passConverted.replaceAll("\\p{Punct}","");
            //System.out.println(pass);
            //System.out.println(passConverted);
            if(Arrays.asList(studentNumDB).contains(studNumVerify) && Arrays.asList(passkeyDB).contains(passConverted)){
                int indexNumber = findIndex(studentNumDB,studNumVerify);
                loginBtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        loginBtn.setText("Processing");
                        JOptionPane.showMessageDialog(f,"hi " + studentNameDB[indexNumber] + ", you may now vote!");
                        setVisible(false);
                        new menu();
                    }
                });
            }else{
                JOptionPane.showMessageDialog(f,"Please enter a valid information");
            }
        
        }
    }
    
    public static int findIndex(String[] arr, String t) {
        if (arr == null) {
            return -1;
        }
        
        int len = arr.length;
        int i = 0;
        while (i < len) {
            
            if (arr[i].equals(t)) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return i;
    }


    
}
