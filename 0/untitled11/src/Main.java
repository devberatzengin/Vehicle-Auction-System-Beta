import javax.swing.*;
import java.awt.*;

class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        JPanel headerPanel = new JPanel();
        JLabel systemNameLabel = new JLabel();
        JLabel systemLogoLabel = new JLabel();
        JLabel systemCreatorLabel = new JLabel();

        JPanel contentPanel = new JPanel();
        JLabel contentLabel = new JLabel();
        JLabel vehicleInfoLabel = new JLabel();
        JLabel auctionLabel = new JLabel();

        JPanel navbarPanel = new JPanel();
        JLabel navbarBtnLabel = new JLabel();

        JPanel footerPanel = new JPanel();
        JLabel footerLabel = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,800);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(headerPanel,BorderLayout.NORTH);
        frame.add(contentPanel,BorderLayout.CENTER);
        frame.add(navbarPanel,BorderLayout.WEST);
        frame.add(footerPanel,BorderLayout.SOUTH);

        headerPanel.setOpaque(true);
        headerPanel.setPreferredSize(new Dimension(frame.getWidth(),74));
        headerPanel.setBackground(Color.GRAY);
        headerPanel.setLayout(null);

        headerPanel.add(systemNameLabel);
        headerPanel.add(systemLogoLabel);
        headerPanel.add(systemCreatorLabel);

        systemNameLabel.setText("Car Auction System");
        systemNameLabel.setOpaque(false);
        systemNameLabel.setFont(new Font("",Font.BOLD,25));
        systemNameLabel.setForeground(Color.WHITE);
        systemNameLabel.setBounds(20,12,250,50);
        systemNameLabel.setHorizontalAlignment(JLabel.CENTER);
        systemNameLabel.setVerticalAlignment(JLabel.CENTER);


        systemLogoLabel.setText("Logo Area");
        systemLogoLabel.setOpaque(true);
        systemLogoLabel.setBackground(Color.WHITE);
        systemLogoLabel.setBounds((frame.getWidth()/2)-125,12,250,50);
        systemLogoLabel.setFont(new Font("",Font.BOLD,25));
        systemLogoLabel.setForeground(Color.RED);
        systemLogoLabel.setHorizontalAlignment(JLabel.CENTER);
        systemLogoLabel.setVerticalAlignment(JLabel.CENTER);

        systemCreatorLabel.setText("Dev. Berat Zengin");
        systemCreatorLabel.setBounds(((int)(frame.getWidth()/1.25))-25,12,250,50);
        systemCreatorLabel.setFont(new Font("",Font.BOLD,25));
        systemCreatorLabel.setHorizontalAlignment(JLabel.CENTER);
        systemCreatorLabel.setVerticalAlignment(JLabel.CENTER);


        navbarPanel.setOpaque(true);
        navbarPanel.setBackground(Color.LIGHT_GRAY);
        navbarPanel.setLayout(null);
        navbarPanel.setPreferredSize(new Dimension(120,frame.getHeight()));
        navbarPanel.add(navbarBtnLabel);


        navbarBtnLabel.setOpaque(true);
        navbarBtnLabel.setBounds(10,138,100,400);
        navbarBtnLabel.setBackground(Color.lightGray);
        navbarBtnLabel.setPreferredSize(new Dimension(100,frame.getHeight()));
        navbarBtnLabel.setLayout(new GridLayout(4,1,20,85));

        ImageIcon homeicon = new ImageIcon("C:\\Users\\berat\\OneDrive\\Masaüstü\\JFrame\\0\\untitled11\\HomeIcon2.png");

        JButton homeBtn = new JButton();
        //homeBtn.setIcon(homeicon);
        homeBtn.setFocusable(false);
        homeBtn.setPreferredSize(new Dimension(60,30));
        homeBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        homeBtn.setText("Home");
        homeBtn.setBackground(Color.gray);
        homeBtn.setForeground(Color.BLACK);

        JButton settingsBtn = new JButton();
        settingsBtn.setFocusable(false);
        settingsBtn.setPreferredSize(new Dimension(60,30));
        settingsBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        settingsBtn.setText("Settings");
        settingsBtn.setBackground(Color.gray);
        settingsBtn.setForeground(Color.BLACK);

        JButton loginBtn = new JButton();
        loginBtn.setFocusable(false);
        loginBtn.setPreferredSize(new Dimension(60,30));
        loginBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        loginBtn.setText("Login");
        loginBtn.setBackground(Color.gray);
        loginBtn.setForeground(Color.BLACK);

        JButton registerBtn = new JButton();
        registerBtn.setFocusable(false);
        registerBtn.setPreferredSize(new Dimension(60,30));
        registerBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        registerBtn.setText("Register");
        registerBtn.setBackground(Color.gray);
        registerBtn.setForeground(Color.BLACK);


        navbarBtnLabel.add(loginBtn);
        navbarBtnLabel.add(registerBtn);
        navbarBtnLabel.add(homeBtn);
        navbarBtnLabel.add(settingsBtn);



        contentPanel.setOpaque(true);
        contentPanel.setBackground(Color.YELLOW);
        contentPanel.add(contentLabel);
        contentPanel.setLayout(new GridLayout());

        contentLabel.setOpaque(true);
        contentLabel.setBackground(Color.MAGENTA);
        contentLabel.setLayout(new GridLayout());


        contentLabel.add(vehicleInfoLabel);
        vehicleInfoLabel.setOpaque(true);
        vehicleInfoLabel.setBackground(Color.BLUE);
        vehicleInfoLabel.setText("Vehicle Info Area");
        vehicleInfoLabel.setVerticalAlignment(JLabel.TOP);
        vehicleInfoLabel.setHorizontalAlignment(JLabel.CENTER);

        contentPanel.add(auctionLabel);
        auctionLabel.setOpaque(true);
        auctionLabel.setBackground(Color.GREEN);
        auctionLabel.setText("Auction Area");
        auctionLabel.setVerticalAlignment(JLabel.TOP);
        auctionLabel.setHorizontalAlignment(JLabel.CENTER);




        footerPanel.setOpaque(true);
        footerPanel.setBackground(Color.gray);
        footerPanel.setPreferredSize(new Dimension(frame.getWidth(),50));
        footerPanel.add(footerLabel);

        footerLabel.setOpaque(true);
        footerLabel.setPreferredSize(new Dimension((int)(frame.getWidth()/1.5),40));
        footerLabel.setBackground(Color.GRAY);
        footerLabel.setLayout(new FlowLayout());


        JButton gitHubBtn = new JButton();
        gitHubBtn.setFocusable(false);
        gitHubBtn.setText("GitHub");
        gitHubBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        gitHubBtn.setBackground(Color.lightGray);
        gitHubBtn.setForeground(Color.BLACK);
        gitHubBtn.setPreferredSize(new Dimension(70,25+5));

        JButton linkedInBtn = new JButton();
        linkedInBtn.setFocusable(false);
        linkedInBtn.setText("LinkedIn");
        linkedInBtn.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        linkedInBtn.setBackground(Color.lightGray);
        linkedInBtn.setForeground(Color.BLACK);
        linkedInBtn.setPreferredSize(new Dimension(70,30));


        footerLabel.add(gitHubBtn);
        footerLabel.add(linkedInBtn);


        frame.setVisible(true);
    }
}