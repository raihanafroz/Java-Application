/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaaaaaa;

import java.awt.Graphics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class talkable_clock extends javax.swing.JFrame{
    public JPanel jPanel1=new JPanel();
    public JLabel jLabel1,jLabel2=new JLabel();
    Thread t1=null;
    int hour=0,min=0,sec=0,day=0,mon=0,year=0,aa=0;
    String time;
    void abcdefg(){
        this.setTitle("Date & Time");
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 170));
        setMinimumSize(new java.awt.Dimension(250, 170));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(250, 150));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 150));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 255), 3, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        pack();
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setLocation(1116, 45);
        this.setVisible(true);
        xxx();
        talk();
    }
    void xxx(){
        try{
            while(true){
                Calendar cal=Calendar.getInstance();
                year=cal.get(Calendar.YEAR);
                mon=cal.get(Calendar.MONTH);
                day=cal.get(Calendar.DAY_OF_MONTH);
                hour=cal.get(Calendar.HOUR);
                aa=cal.get(Calendar.AM_PM);
                if(hour>12){
                    hour-=12;
                }
                if(hour==0){
                    hour=12;
                }                
                min=cal.get(Calendar.MINUTE);
                sec=cal.get(Calendar.SECOND);
                jLabel1.setText(day+"-"+(mon+1)+"-"+year);
                if(aa==0){
                    jLabel2.setText(hour+":"+min+":"+sec+" "+"AM");
                }else{
                    jLabel2.setText(hour+":"+min+":"+sec+" "+"PM");
                }
//                NewClass t=new NewClass("It's  "+hour+","+min+"");
                t1.sleep(1000);
            }
        }catch(Exception e){
            
        }
    }
    void talk(){
        while(true){
            try{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
                DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH");
                DateTimeFormatter min = DateTimeFormatter.ofPattern("mm"); 
                DateTimeFormatter ss = DateTimeFormatter.ofPattern("ss");
                LocalDateTime now = LocalDateTime.now();  
                String fr="AM";
                int hh=Integer.parseInt(hour.format(now));
                int mm=Integer.parseInt(min.format(now));
                int iss=Integer.parseInt(ss.format(now));
                if(hh>12){
                    hh=hh-12;
                    fr="PM";
                }
                if(iss==0){
                    NewClass t=new NewClass("It's  "+hh+","+mm+""+fr);
                }
                t1.sleep(1000);
            }catch(Exception e){

            }
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter min = DateTimeFormatter.ofPattern("mm"); 
        DateTimeFormatter ss = DateTimeFormatter.ofPattern("ss"); 
        LocalDateTime now = LocalDateTime.now();   
        String fr="AM";
        int hh=Integer.parseInt(hour.format(now));
        int mm=Integer.parseInt(min.format(now));
        int iss=Integer.parseInt(ss.format(now));
        if(hh>12){
            hh=hh-12;
            fr="PM";
        }
        if(iss==0){
            NewClass t=new NewClass("It's  "+hh+","+mm+""+fr);
        }
        repaint();
    }
}
