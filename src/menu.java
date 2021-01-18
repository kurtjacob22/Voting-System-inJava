
import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class menu extends JFrame {
    JComboBox<String> presCandidates,proCandidates,selectPos,treasCandidates,vpCandidates,secCandidates;
    JPanel addCandidatePanel,bannerPanel1,congratsPanel,cardLayoutPanel,homePanel,mainPanel,mainPanel1,sidePanel,titlePanel,
            topContainer,topPanel,viewWinnerPanel,votePanel,winnerPanel;
    JButton audBtn,viewWinnerBtn, addCandidateBtn,submitVote, resetBtn,presBtn,proBtn,saveCandidate,secBtn,treasBtn,voteBtn,vpBtn;
    JComboBox<String> audCandidates;
    JTextField audChosen,audWinner,emailInput,lastName,lastNameInput,nameInput,presChosen,presWinner,proChosen,proWinner,secChosen,
            secWinner,sectionInput,studNumInput,studentNumber,treasChosen,treasWinner,vpChosen,vpWinner;
    JLabel audLbl, addCandidatesLbl,congratsLbl,emailLbl,lastNameCandidate,lastNameLbl,nameCandidate,positionLbl,presLbl,proLbl,secLbl,sectionLbl,
            studentNumLbl,studNumLbl,titleLbl1,treasLbl,vpLbl;
    ItemListener itemListener;




    String[] studentNumDB = new String[]{
            "3180590","3180208","3180023","3180306","3180168","3180169","3180034","3180080","3180143","3180400","3180301","3180491","3180429","3180002","3180076","3180068","3180010","3180004","3180288","3180285","3180007","3180305","3180248","3180387","3180266","3180099","3180105","3180302","3180083","3180247"
    };

    String[] studentNameDB = new String[]{
            "GADDI","AMODIA","ANTOR","BANAYAG","BAU","BAUTISTA","BETITA","DELA PEÑA","DELOS REYES","ESPARTERO","FRANCO","GAVIERES","HALILI","ISIDRO","LAO","MAROTO","MATITO","METRO","PAGUIA","PATRICIO","QUIROZ","REYES","SAN JUAN","SUAREZ","TECSON","TOLENTINO","URQUICO","VILLALON","ZACARIAS","ZARATE"
    };

    String[] passkeyDB = new String[]{
            "letran","arriba","admin"
    };

    String[] candidatesForPres = new String[]{
            "",""
    };

    int[] presCount = new int[2];
    //int presCount1,presCount2;

    String[] candidatesForVp = new String[]{
            "",""
    };

    int[] vpCount = new int[2];

    String[]candidatesForSec = new String[]{
            "",""
    };

    int[] secCount = new int[2];

    String[] candidatesForTreas = new String[]{
            "",""
    };

    int[] treasCount = new int[2];

    String[] candidatesForAud = new String[]{
            "",""
    };

    int[] audCount = new int[2];

    String[] candidatesForPro = new String[]{
            "",""
    };

    int[] proCount = new int[2];

    String[] position = new String[]{
            "President","President 2", "Vice President" , "Vice President 2", "Secretary", "Secretary 2", "Treasurer" ,"Treasurer 2", "Auditor", "Auditor 2","PRO","PRO 2"

    };

    public menu() {
        topPanel = new JPanel();
        topContainer = new JPanel();
        studentNumLbl = new JLabel();
        studentNumber = new JTextField();
        lastNameLbl = new JLabel();
        lastName = new JTextField();
        sidePanel = new JPanel();
        resetBtn = new JButton();
        submitVote = new JButton();
        addCandidateBtn = new JButton();
        viewWinnerBtn = new JButton();
        cardLayoutPanel = new JPanel();
        homePanel = new JPanel();
        addCandidatePanel = new JPanel();
        titlePanel = new JPanel();
        addCandidatesLbl = new JLabel();
        mainPanel1 = new JPanel();
        nameCandidate = new JLabel();
        nameInput = new JTextField();
        lastNameInput = new JTextField();
        lastNameCandidate = new JLabel();
        positionLbl = new JLabel();
        sectionInput = new JTextField();
        studNumInput = new JTextField();
        sectionLbl = new JLabel();
        emailLbl = new JLabel();
        emailInput = new JTextField();
        studNumLbl = new JLabel();
        selectPos = new JComboBox<>();
        saveCandidate = new JButton();
        votePanel = new JPanel();
        bannerPanel1 = new JPanel();
        titleLbl1 = new JLabel();
        mainPanel = new JPanel();
        presLbl = new JLabel();
        presCandidates = new JComboBox<>();
        presChosen = new JTextField();
        vpLbl = new JLabel();
        vpCandidates = new JComboBox<>();
        vpChosen = new JTextField();
        secLbl = new JLabel();
        treasLbl = new JLabel();
        secCandidates = new JComboBox<>();
        treasCandidates = new JComboBox<>();
        treasChosen = new JTextField();
        audLbl = new JLabel();
        proLbl = new JLabel();
        audCandidates = new JComboBox<>();
        proCandidates = new JComboBox<>();
        proChosen = new JTextField();
        audChosen = new JTextField();
        secChosen = new JTextField();
        voteBtn = new JButton();
        viewWinnerPanel = new JPanel();
        congratsPanel = new JPanel();
        congratsLbl = new JLabel();
        winnerPanel = new JPanel();
        presBtn = new JButton();
        presWinner = new JTextField();
        secBtn = new JButton();
        secWinner = new JTextField();
        audBtn = new JButton();
        audWinner = new JTextField();
        vpBtn = new JButton();
        vpWinner = new JTextField();
        treasBtn = new JButton();
        treasWinner = new JTextField();
        proBtn = new JButton();
        proWinner = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voting System");
        setLocation(300,300);
        setResizable(false);
        setVisible(true);

        topPanel.setBackground(new Color(0, 0, 0));

        topContainer.setBackground(new Color(0, 0, 0));

        studentNumLbl.setFont(new Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        studentNumLbl.setForeground(new Color(255, 255, 255));
        studentNumLbl.setText("Student Number : ");

        studentNumber.setText("Enter username");
        studentNumber.setMargin(new Insets(2, 8, 2, 2));

        studentNumber.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                studentNumber.setBackground(Color.LIGHT_GRAY);
                studentNumber.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                studentNumber.setBackground(Color.WHITE);
                studentNumber.setForeground(Color.BLACK);
            }
        });

        lastNameLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        lastNameLbl.setForeground(new Color(255, 255, 255));
        lastNameLbl.setText("Last Name : ");

        lastName.setText("Enter your Last name");
        lastName.setMargin(new Insets(2, 8, 2, 2));
        lastName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lastName.setBackground(Color.LIGHT_GRAY);
                lastName.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lastName.setBackground(Color.WHITE);
                lastName.setForeground(Color.BLACK);
            }
        });

        GroupLayout topContainerLayout = new GroupLayout(topContainer);
        topContainer.setLayout(topContainerLayout);
        topContainerLayout.setHorizontalGroup(
                topContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(topContainerLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(studentNumLbl)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(studentNumber, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lastNameLbl)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastName, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(118, Short.MAX_VALUE))
        );
        topContainerLayout.setVerticalGroup(
                topContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, topContainerLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(topContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentNumber, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentNumLbl)
                                        .addComponent(lastNameLbl)
                                        .addComponent(lastName, GroupLayout.PREFERRED_SIZE, 31,GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
        );

        GroupLayout topPanelLayout = new GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
                topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 866, Short.MAX_VALUE)
                        .addGroup(topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(topPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(topContainer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        topPanelLayout.setVerticalGroup(
                topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(topPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(topPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(topContainer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(topPanel, BorderLayout.PAGE_START);

        sidePanel.setBackground(new Color(153, 153, 153));

        resetBtn.setBackground(new Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        resetBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                resetBtn.setBackground(Color.BLACK);
                resetBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                resetBtn.setBackground(Color.WHITE);
                resetBtn.setForeground(Color.BLACK);
            }
        });

        submitVote.setBackground(new Color(204, 204, 204));
        submitVote.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        submitVote.setText("Vote");
        submitVote.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submitVoteActionPerformed(evt);
            }
        });

        submitVote.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                submitVote.setBackground(Color.BLACK);
                submitVote.setForeground(Color.WHITE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                submitVote.setBackground(Color.WHITE);
                submitVote.setForeground(Color.BLACK);
            }
        });

        addCandidateBtn.setBackground(new Color(255, 255, 255));
        addCandidateBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        addCandidateBtn.setText("Add Candidates");
        addCandidateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addCandidateBtnActionPerformed(evt);
            }
        });

        addCandidateBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                addCandidateBtn.setBackground(Color.BLACK);
                addCandidateBtn.setForeground(Color.WHITE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                addCandidateBtn.setBackground(Color.WHITE);
                addCandidateBtn.setForeground(Color.BLACK);
            }
        });

        viewWinnerBtn.setBackground(new Color(255, 255, 255));
        viewWinnerBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        viewWinnerBtn.setText("View Winners");
        viewWinnerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewWinnerBtnActionPerformed(evt);
            }
        });

        viewWinnerBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                viewWinnerBtn.setBackground(Color.BLACK);
                viewWinnerBtn.setForeground(Color.WHITE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewWinnerBtn.setBackground(Color.WHITE);
                viewWinnerBtn.setForeground(Color.BLACK);
            }
        });

        GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
                sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap(31, Short.MAX_VALUE)
                                .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                                                .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                                                .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(addCandidateBtn, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(submitVote, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(viewWinnerBtn, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28))))
        );
        sidePanelLayout.setVerticalGroup(
                sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap(155, Short.MAX_VALUE)
                                .addComponent(submitVote, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addCandidateBtn, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewWinnerBtn, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        getContentPane().add(sidePanel, BorderLayout.LINE_END);

        cardLayoutPanel.setLayout(new CardLayout());

        homePanel.setBackground(new Color(204, 204, 204));

        GroupLayout homePanelLayout = new GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 644, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 487, Short.MAX_VALUE)
        );

        cardLayoutPanel.add(homePanel, "card4");

        addCandidatePanel.setLayout(new BorderLayout());

        titlePanel.setBackground(new Color(204, 204, 204));

        addCandidatesLbl.setFont(new Font("Tahoma", 0, 48)); // NOI18N
        addCandidatesLbl.setHorizontalAlignment(SwingConstants.CENTER);
        addCandidatesLbl.setText("ADD CANDIDATES");

        GroupLayout titlePanelLayout = new GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(addCandidatesLbl, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                                .addGap(81, 81, 81))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(addCandidatesLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
        );

        addCandidatePanel.add(titlePanel, BorderLayout.PAGE_START);

        mainPanel1.setBackground(new Color(255, 255, 255));

        nameCandidate.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        nameCandidate.setText("First Name : ");

        nameInput.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        nameInput.setMargin(new Insets(2, 8, 2, 2));

        lastNameInput.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        lastNameInput.setMargin(new Insets(2, 8, 2, 2));

        lastNameCandidate.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        lastNameCandidate.setText("Last Name : ");

        positionLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        positionLbl.setText("Position : ");

        sectionInput.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        sectionInput.setMargin(new Insets(2, 8, 2, 2));

        studNumInput.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        studNumInput.setMargin(new Insets(2, 8, 2, 2));

        sectionLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        sectionLbl.setText("Section : ");

        emailLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        emailLbl.setText("Email : ");

        emailInput.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        emailInput.setMargin(new Insets(2, 8, 2, 2));

        studNumLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        studNumLbl.setText("Student Number : ");

        selectPos.setBackground(new Color(153, 153, 153));
        selectPos.setForeground(new Color(255, 255, 255));
        selectPos.setModel(new DefaultComboBoxModel<>(new String[] { position[0], position[1], position[2], position[3], position[4], position[5], position[6], position[7], position[8], position[9], position[10], position[11] }));
        itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    String item = (String) itemEvent.getItem();
                    System.out.println("Item: " + item + " removed from list");
                    removeItem(item);
                }
            }
        };
        selectPos.addItemListener(itemListener);

        saveCandidate.setBackground(new Color(0, 0, 0));
        saveCandidate.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        saveCandidate.setForeground(new Color(255, 255, 255));
        saveCandidate.setText("Save Candidate");
        saveCandidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCandidateActionPerformed(e);
            }
        });

        saveCandidate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                saveCandidate.setBackground(Color.WHITE);
                saveCandidate.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                saveCandidate.setBackground(Color.BLACK);
                saveCandidate.setForeground(Color.WHITE);
            }
        });

        GroupLayout mainPanel1Layout = new GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
                mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saveCandidate, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                                .addComponent(sectionLbl)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sectionInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                                .addComponent(lastNameCandidate)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                                .addComponent(nameCandidate)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nameInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(positionLbl)
                                                        .addComponent(emailLbl))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(selectPos, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                                .addComponent(studNumLbl)
                                                .addGap(12, 12, 12)
                                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(studNumInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31))
        );
        mainPanel1Layout.setVerticalGroup(
                mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(nameCandidate)
                                                .addComponent(nameInput, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(studNumLbl, GroupLayout.Alignment.TRAILING)
                                        .addComponent(studNumInput, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastNameCandidate)
                                        .addComponent(lastNameInput, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLbl)
                                        .addComponent(emailInput, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(sectionLbl)
                                        .addComponent(sectionInput, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(positionLbl)
                                        .addComponent(selectPos, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addComponent(saveCandidate, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addCandidatePanel.add(mainPanel1, BorderLayout.PAGE_END);

        cardLayoutPanel.add(addCandidatePanel, "card5");

        votePanel.setBackground(new Color(255, 255, 255));
        votePanel.setLayout(new BorderLayout());

        bannerPanel1.setBackground(new Color(204, 204, 204));

        titleLbl1.setFont(new Font("Tahoma", 0, 48)); // NOI18N
        titleLbl1.setText("SELECT CANDIDATES");

        GroupLayout bannerPanel1Layout = new GroupLayout(bannerPanel1);
        bannerPanel1.setLayout(bannerPanel1Layout);
        bannerPanel1Layout.setHorizontalGroup(
                bannerPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, bannerPanel1Layout.createSequentialGroup()
                                .addContainerGap(94, Short.MAX_VALUE)
                                .addComponent(titleLbl1)
                                .addGap(88, 88, 88))
        );
        bannerPanel1Layout.setVerticalGroup(
                bannerPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bannerPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(titleLbl1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        votePanel.add(bannerPanel1, BorderLayout.PAGE_START);

        mainPanel.setBackground(new Color(255, 255, 255));

        presLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        presLbl.setText("President");


        presCandidates.setBackground(new Color(153, 153, 153));
        presCandidates.setForeground(new Color(255, 255, 255));
        presCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for President"}));
        presCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) presCandidates.getSelectedItem();
                presChosen.setText("You choose: " + selected);

            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        presChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        presChosen.setText("");
        presChosen.setMargin(new Insets(2, 8, 2, 2));
        presChosen.setEditable(false);

        vpLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        vpLbl.setText("Vice Pres");




        vpCandidates.setBackground(new Color(153, 153, 153));
        vpCandidates.setForeground(new Color(255, 255, 255));
        vpCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for Vice President"}));
        vpCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) vpCandidates.getSelectedItem();
                vpChosen.setText("You choose: " + selected);
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        vpChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        vpChosen.setText("");
        vpChosen.setMargin(new Insets(2, 8, 2, 2));
        vpChosen.setEditable(false);

        secLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        secLbl.setText("Secretary");

        treasLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        treasLbl.setText("Treasurer");


        secCandidates.setBackground(new Color(153, 153, 153));
        secCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for Secretary"}));
        secCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) secCandidates.getSelectedItem();
                secChosen.setText("You choose: " + selected);
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });



        treasCandidates.setBackground(new Color(153, 153, 153));
        treasCandidates.setForeground(new Color(255, 255, 255));
        treasCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for Treasurer"}));
        treasCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                //do nothing
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) treasCandidates.getSelectedItem();
                treasChosen.setText("You choose: " + selected);
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        treasChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        treasChosen.setText("");
        treasChosen.setMargin(new Insets(2, 8, 2, 2));
        treasChosen.setEditable(false);

        audLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        audLbl.setText("Auditor");

        proLbl.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        proLbl.setText("PRO");

        audCandidates.setBackground(new Color(153, 153, 153));
        audCandidates.setForeground(new Color(255, 255, 255));
        audCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for Auditor" }));
        audCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) audCandidates.getSelectedItem();
                audChosen.setText("You choose: " + selected);
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        proCandidates.setBackground(new Color(153, 153, 153));
        proCandidates.setForeground(new Color(255, 255, 255));
        proCandidates.setModel(new DefaultComboBoxModel<>(new String[] { "Candidates for PRO"}));
        proCandidates.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                String selected = (String) proCandidates.getSelectedItem();
                proChosen.setText("You choose: " + selected);
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        proChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        proChosen.setText("");
        proChosen.setMargin(new Insets(2, 8, 2, 2));
        proChosen.setEditable(false);

        audChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        audChosen.setText("");
        audChosen.setMargin(new Insets(2, 8, 2, 2));
        audChosen.setEditable(false);

        secChosen.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        secChosen.setText("");
        secChosen.setMargin(new Insets(2, 8, 2, 2));
        secChosen.setEditable(false);

        voteBtn.setBackground(new Color(0, 0, 0));
        voteBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        voteBtn.setForeground(new Color(255, 255, 255));
        voteBtn.setText("Submit Votes");
        voteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                voteBtnActionPerformed(evt);
            }
        });

        voteBtn.setToolTipText("Click to view Winners");
        voteBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                voteBtn.setBackground(Color.WHITE);
                voteBtn.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                voteBtn.setBackground(Color.BLACK);
                voteBtn.setForeground(Color.WHITE);;
            }
        });

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(voteBtn, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(secChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                        .addComponent(secLbl)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(secCandidates, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                                .addComponent(treasLbl)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(treasCandidates, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(treasChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                        .addGap(3, 3, 3)
                                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(proChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                                        .addComponent(proLbl)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(proCandidates, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))))))
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                                                        .addComponent(presLbl)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(presCandidates, 0, 1, Short.MAX_VALUE))
                                                                .addComponent(presChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(59, 59, 59)
                                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(vpChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                        .addComponent(vpLbl)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(vpCandidates, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(audChosen, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addComponent(audLbl)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(audCandidates, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))))
                                .addGap(74, 74, 74))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(vpLbl)
                                                        .addComponent(vpCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vpChosen, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(presLbl)
                                                        .addComponent(presCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(presChosen, GroupLayout.PREFERRED_SIZE, 40,GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(treasLbl)
                                                        .addComponent(treasCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(treasChosen, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(secChosen, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(secLbl)
                                                .addComponent(secCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(proLbl)
                                                        .addComponent(proCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(proChosen, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(audLbl)
                                                        .addComponent(audCandidates, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(audChosen,GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(voteBtn, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        votePanel.add(mainPanel,BorderLayout.PAGE_END);

        cardLayoutPanel.add(votePanel, "card2");

        viewWinnerPanel.setBackground(new Color(255, 255, 255));
        viewWinnerPanel.setLayout(new BorderLayout());

        congratsPanel.setBackground(new Color(204, 204, 204));

        congratsLbl.setBackground(new Color(102, 102, 102));
        congratsLbl.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        congratsLbl.setHorizontalAlignment(SwingConstants.CENTER);
        congratsLbl.setText("CONGRATULATIONS!");

        GroupLayout congratsPanelLayout = new GroupLayout(congratsPanel);
        congratsPanel.setLayout(congratsPanelLayout);
        congratsPanelLayout.setHorizontalGroup(
                congratsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(congratsLbl, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        congratsPanelLayout.setVerticalGroup(
                congratsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(congratsLbl, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        viewWinnerPanel.add(congratsPanel, BorderLayout.PAGE_START);

        winnerPanel.setBackground(new Color(255, 255, 255));

        presBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        presBtn.setText("President");
        presBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                presBtnActionPerformed(evt);
            }
        });

        presBtn.setToolTipText("Click to view Winners");
        presBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                presBtn.setBackground(Color.BLACK);
                presBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                presBtn.setBackground(Color.WHITE);
                presBtn.setForeground(Color.BLACK);;
            }
        });

        presWinner.setEditable(false);
        presWinner.setHorizontalAlignment(JTextField.CENTER);
        presWinner.setMargin(new Insets(2, 8, 8, 2));

        secBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        secBtn.setText("Secretary");
        secBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                secBtnActionPerformed(evt);
            }
        });

        secBtn.setToolTipText("Click to view Winners");
        secBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                secBtn.setBackground(Color.BLACK);
                secBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                secBtn.setBackground(Color.WHITE);
                secBtn.setForeground(Color.BLACK);;
            }
        });

        secWinner.setEditable(false);
        secWinner.setHorizontalAlignment(JTextField.CENTER);
        secWinner.setMargin(new Insets(2, 8, 8, 2));

        audBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        audBtn.setText("Auditor");
        audBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                audBtnActionPerformed(evt);
            }
        });

        audBtn.setToolTipText("Click to view Winner");
        audBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                audBtn.setBackground(Color.BLACK);
                audBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                audBtn.setBackground(Color.WHITE);
                audBtn.setForeground(Color.BLACK);;
            }
        });

        audWinner.setEditable(false);
        audWinner.setHorizontalAlignment(JTextField.CENTER);
        audWinner.setMargin(new Insets(2, 8, 8, 2));

        vpBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        vpBtn.setText("Vice President");
        vpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                vpBtnActionPerformed(evt);
            }
        });

        vpBtn.setToolTipText("Click to view Winner");
        vpBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                vpBtn.setBackground(Color.BLACK);
                vpBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                vpBtn.setBackground(Color.WHITE);
                vpBtn.setForeground(Color.BLACK);;
            }
        });


        vpWinner.setEditable(false);
        vpWinner.setHorizontalAlignment(JTextField.CENTER);
        vpWinner.setMargin(new Insets(2, 8, 8, 2));

        treasBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        treasBtn.setText("Treasurer");
        treasBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                treasBtnActionPerformed(evt);
            }
        });

        treasBtn.setToolTipText("Click to view Winners");
        treasBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                treasBtn.setBackground(Color.BLACK);
                treasBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                treasBtn.setBackground(Color.WHITE);
                treasBtn.setForeground(Color.BLACK);;
            }
        });

        treasWinner.setEditable(false);
        treasWinner.setHorizontalAlignment(JTextField.CENTER);
        treasWinner.setMargin(new Insets(2, 8, 8, 2));

        proBtn.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        proBtn.setText("PRO");
        proBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                proBtnActionPerformed(evt);
            }
        });

        proBtn.setToolTipText("Click to view Winners");
        proBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                proBtn.setBackground(Color.BLACK);
                proBtn.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                proBtn.setBackground(Color.WHITE);
                proBtn.setForeground(Color.BLACK);;
            }
        });

        proWinner.setEditable(false);
        proWinner.setHorizontalAlignment(JTextField.CENTER);
        proWinner.setMargin(new Insets(2, 8, 8, 2));

        GroupLayout winnerPanelLayout = new GroupLayout(winnerPanel);
        winnerPanel.setLayout(winnerPanelLayout);
        winnerPanelLayout.setHorizontalGroup(
                winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(winnerPanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(audWinner)
                                                .addComponent(audBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(secWinner)
                                                .addComponent(secBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(presWinner)
                                                .addComponent(presBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(proWinner)
                                                .addComponent(proBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(treasWinner)
                                                .addComponent(treasBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(vpWinner)
                                                .addComponent(vpBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        winnerPanelLayout.setVerticalGroup(
                winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(winnerPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(winnerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(winnerPanelLayout.createSequentialGroup()
                                                .addComponent(vpBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(vpWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(treasBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(treasWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addComponent(proBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(proWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(winnerPanelLayout.createSequentialGroup()
                                                .addComponent(presBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(presWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(secBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(secWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(audBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(audWinner, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
    );

        viewWinnerPanel.add(winnerPanel, BorderLayout.CENTER);

        cardLayoutPanel.add(viewWinnerPanel, "card3");

        getContentPane().add(cardLayoutPanel, BorderLayout.CENTER);

        pack();
    }



    private void submitVoteActionPerformed(ActionEvent evt) {
        cardLayoutPanel.removeAll();
        cardLayoutPanel.add(votePanel);
        cardLayoutPanel.repaint();
        cardLayoutPanel.revalidate();
    }

    private void addCandidateBtnActionPerformed(ActionEvent evt) {
        JPanel verifyAdmin = new JPanel();
        JLabel messageTitle = new JLabel("Enter a password:");
        JPasswordField password = new JPasswordField(10);
        verifyAdmin.add(messageTitle);
        verifyAdmin.add(password);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, verifyAdmin, "Login",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if(option == 0) // pressing OK button
        {
            char[] passKey = password.getPassword();
            String passTranslated = Arrays.toString(passKey);
            passTranslated = passTranslated.replaceAll("\\p{Punct}", "");
            passTranslated = passTranslated.replaceAll("\\s", "");
            System.out.println(passTranslated);

            if(Arrays.asList(passkeyDB).contains(passTranslated.toLowerCase())){
                JOptionPane.showMessageDialog(null, "Hello Admin");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(addCandidatePanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Password");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(homePanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }


        }
    }

    private void viewWinnerBtnActionPerformed(ActionEvent evt) {

        JPanel verifyAdmin = new JPanel();
        JLabel messageTitle = new JLabel("Enter a password:");
        JPasswordField password = new JPasswordField(10);
        verifyAdmin.add(messageTitle);
        verifyAdmin.add(password);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, verifyAdmin, "Login",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if(option == 0) // pressing OK button
        {
            char[] passKey = password.getPassword();
            String passTranslated = Arrays.toString(passKey);
            passTranslated = passTranslated.replaceAll("\\p{Punct}", "");
            passTranslated = passTranslated.replaceAll("\\s", "");
            System.out.println(passTranslated);

            if(Arrays.asList(passkeyDB).contains(passTranslated.toLowerCase())){
                JOptionPane.showMessageDialog(null, "Hello Admin");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(viewWinnerPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Password");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(homePanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }


        }



    }

    //reset button
    private void resetBtnActionPerformed(ActionEvent evt) {
        JFrame f = new JFrame();
        if(evt.getSource() == resetBtn){
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all data?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if(!candidatesForPres[0].equals("") || !candidatesForVp[0].equals("") || !candidatesForSec[0].equals("") || !candidatesForTreas[0].equals("") ||
                   !candidatesForAud[0].equals("") || !candidatesForPro[0].equals("") || !candidatesForPres[1].equals("") || !candidatesForVp[1].equals("") ||
                   !candidatesForSec[1].equals("") || !candidatesForTreas[1].equals("") || !candidatesForAud[1].equals("") || !candidatesForPro[1].equals("")){

                    resetFunction(presCandidates,presCount);
                    resetFunction(vpCandidates,vpCount);
                    resetFunction(secCandidates,secCount);
                    resetFunction(audCandidates,audCount);
                    resetFunction(treasCandidates,treasCount);
                    resetFunction(proCandidates,proCount);

                    saveCandidate.setEnabled(true);
                    selectPos.removeAllItems();
                    selectPos.setModel(new DefaultComboBoxModel<>(new String[] { position[0], position[1], position[2], position[3], position[4], position[5], position[6], position[7], position[8], position[9], position[10], position[11] }));

                    //creates new Database
                    studentNumDB = new String[]{
                            "3180590","3180208","3180023","3180306","3180168","3180169","3180034","3180080","3180143","3180400","3180301","3180491","3180429","3180002","3180076","3180068","3180010","3180004","3180288","3180285","3180007","3180305","3180248","3180387","3180266","3180099","3180105","3180302","3180083","3180247"
                    };

                    studentNameDB = new String[]{
                            "GADDI","AMODIA","ANTOR","BANAYAG","BAU","BAUTISTA","BETITA","DELA PEÑA","DELOS REYES","ESPARTERO","FRANCO","GAVIERES","HALILI","ISIDRO","LAO","MAROTO","MATITO","METRO","PAGUIA","PATRICIO","QUIROZ","REYES","SAN JUAN","SUAREZ","TECSON","TOLENTINO","URQUICO","VILLALON","ZACARIAS","ZARATE"
                    };



                    JOptionPane.showMessageDialog(null, "Done!");
                }else{
                    JOptionPane.showMessageDialog(null, "no data found");
                }
            }  // no option

        }
    }

    public void resetFunction(JComboBox<String> candidates, int[] voteCount){
        candidates.removeAllItems();
        voteCount[0] = 0;
        voteCount[1] = 0;
    }

    private void saveCandidateActionPerformed(ActionEvent e){
        int posItemCounter = selectPos.getItemCount();
        System.out.println(posItemCounter);

        if(e.getSource() == saveCandidate){
            if(!nameInput.getText().equals("") && !lastNameInput.getText().equals("") && !sectionInput.getText().equals("") && !studNumInput.getText().equals("") && emailInput.getText() != ""){
                letCheck(nameInput,lastNameInput,selectPos);
                removeFromList(selectPos);
                if(posItemCounter == 1){
                    saveCandidate.setEnabled(false);
                    saveCandidate.setToolTipText("no available positions yet");
                }

            }else{
                JOptionPane.showMessageDialog(null,"Please Check your personal information");
            }
        }


    }

    public void removeFromList(JComboBox<String> selectPos){
        removeItem((String) selectPos.getSelectedItem());
    }

    public void letCheck(JTextField fName, JTextField lstName, JComboBox<String> positionList){


            if(!fName.getText().equals("") && positionList.getSelectedItem() == "President"){
                candidatesForPres[0] = fName.getText() + " " + lstName.getText();
                presCandidates.addItem(candidatesForPres[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForPres[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "President 2" ){
                candidatesForPres[1] = fName.getText() + " " + lstName.getText();
                presCandidates.addItem(candidatesForPres[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForPres[1] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Vice President" ){
                candidatesForVp[0] = fName.getText() + " " + lstName.getText();
                vpCandidates.addItem(candidatesForVp[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForVp[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Vice President 2" ){
                candidatesForVp[1] = fName.getText() + " " + lstName.getText();
                vpCandidates.addItem(candidatesForVp[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForVp[1] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Secretary" ){
                candidatesForSec[0] = fName.getText() + " " + lstName.getText();
                secCandidates.addItem(candidatesForSec[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForSec[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Secretary 2" ){
                candidatesForSec[1] = fName.getText() + " " + lstName.getText();
                secCandidates.addItem(candidatesForSec[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForSec[1] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Treasurer" ){
                candidatesForTreas[0] = fName.getText() + " " + lstName.getText();
                treasCandidates.addItem(candidatesForTreas[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForTreas[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Treasurer 2" ){
                candidatesForTreas[1] = fName.getText() + " " + lstName.getText();
                treasCandidates.addItem(candidatesForTreas[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForTreas[1] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Auditor" ){
                candidatesForAud[0] = fName.getText() + " " + lstName.getText();
                audCandidates.addItem(candidatesForAud[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForAud[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "Auditor 2" ){
                candidatesForAud[1] = fName.getText() + " " + lstName.getText();
                audCandidates.addItem(candidatesForAud[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForAud[1] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "PRO" ){
                candidatesForPro[0] = fName.getText() + " " + lstName.getText();
                proCandidates.addItem(candidatesForPro[0]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForPro[0] + " for " + positionList.getSelectedItem() + "?");
            }else if(!fName.getText().equals("") && positionList.getSelectedItem() == "PRO 2" ){
                candidatesForPro[1] = fName.getText() + " " + lstName.getText();
                proCandidates.addItem(candidatesForPro[1]);
                JOptionPane.showMessageDialog(null, "Are you sure you want to add " + candidatesForPro[1] + " for " + positionList.getSelectedItem() + "?");
            }else{
                JOptionPane.showMessageDialog(null,"Please Check your personal information");
            }
    }

    private void removeItem(String item) {
        //this step is required to keep from calling back to the listener with new selection when item is removed
        selectPos.removeItemListener(itemListener);
        selectPos.removeItem(item);
        selectPos.addItemListener(itemListener); //okay now we what to know about changes again
    }

    private void winnerChecker(int[] voteCount, JTextField txtFld, String[]nameOfCandidate){
        double totalVotes = voteCount[0] + voteCount[1];

        if(voteCount[0] != 0 || voteCount[1] != 0){// if not zero
            if(voteCount[0] > voteCount[1]){
                double votePercent = (voteCount[0] / totalVotes) * 100;
                txtFld.setText(nameOfCandidate[0].toUpperCase() +" - " +votePercent + "%");
            }else if(voteCount[1] > voteCount[0]) {
                double votePercent = (voteCount[0] / totalVotes) * 100;
                txtFld.setText(nameOfCandidate[1].toUpperCase() + " - " + votePercent + "%");
            }else if(voteCount[1] == voteCount[0]){
                txtFld.setText("Tie");
            }

        }else if(voteCount[1] == 0 || voteCount[0] == 0){//if zero
            txtFld.setText("NO VOTES YET");
        }


//        else if(voteCount[1] == voteCount[0]){
//            txtFld.setText("Tie");
//        }else{
//            txtFld.setText("NO VOTES YET");
//        }
    }

    private void voteBtnActionPerformed(ActionEvent evt){
        JFrame f = new JFrame();
        String[] candidatesChecker = new String[]{
          "Candidates for President", "Candidates for Vice President" , "Candidates for Secretary", "Candidates for Auditor" , "Candidates for Treasurer", "Candidates for PRO"
        };
        String lastN = lastName.getText().toUpperCase();
        String id = studentNumber.getText();
        int index = findIndex(studentNumDB,id);
        if(evt.getSource() == voteBtn && Arrays.asList(studentNumDB).contains(id) && studentNameDB[index].equals(lastN) && !id.equals("") && !lastN.equals("")){
            //System.out.println(studentNameDB[index]);
            if (JOptionPane.showConfirmDialog(f, "Are you sure?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if(presCandidates.getSelectedItem() == candidatesChecker[0] && vpCandidates.getSelectedItem() == candidatesChecker[1]
                        && secCandidates.getSelectedItem() == candidatesChecker[2] && audCandidates.getSelectedItem() == candidatesChecker[3]
                        && treasCandidates.getSelectedItem() == candidatesChecker[4] && proCandidates.getSelectedItem() == candidatesChecker[5]){
                    JOptionPane.showMessageDialog(f,"Please select or add candidate");
                }else{
                    voteCounter(candidatesForPres,presCandidates,presCount);
                    voteCounter(candidatesForVp,vpCandidates,vpCount);
                    voteCounter(candidatesForSec,secCandidates,secCount);
                    voteCounter(candidatesForTreas,treasCandidates,treasCount);
                    voteCounter(candidatesForAud,audCandidates,audCount);
                    voteCounter(candidatesForPro,proCandidates,proCount);
                    studentNumber.setText("");
                    lastName.setText("");
                    int removeIndex = findIndex(studentNumDB,id);
                    studentNumDB[removeIndex] = "";
                    studentNameDB[removeIndex] = "";
                }
            }

        }else{
            JOptionPane.showMessageDialog(f,"Please check your information or you've already voted");
        }
    }

    public void voteCounter(String[] candidate, JComboBox<String> options, int[] voteCounter){

        if(options.getSelectedItem() == candidate[0]){
            voteCounter[0]++;
            System.out.println(candidate[0]);
            System.out.println(voteCounter[0]);
        }else if(options.getSelectedItem() == candidate[1]){
            voteCounter[1]++;
            System.out.println(candidate[1]);
            System.out.println(voteCounter[1]);
        }
    }

    private void presBtnActionPerformed(ActionEvent evt) {
        winnerChecker(presCount,presWinner,candidatesForPres);
    }

    private void secBtnActionPerformed(ActionEvent evt) {
        winnerChecker(secCount,secWinner,candidatesForSec);
    }

    private void audBtnActionPerformed(ActionEvent evt) {
        winnerChecker(audCount,audWinner,candidatesForAud);
    }

    private void vpBtnActionPerformed(ActionEvent evt) {
        winnerChecker(vpCount,vpWinner,candidatesForVp);
    }

    private void treasBtnActionPerformed(ActionEvent evt) {
        winnerChecker(treasCount,treasWinner,candidatesForTreas);
    }

    private void proBtnActionPerformed(ActionEvent evt) {
        winnerChecker(proCount,proWinner,candidatesForPro);
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
