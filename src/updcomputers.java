import java.sql.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cameras.java
 *
 * Created on Nov 14, 2002, 10:21:48 PM
 */

/**
 *
 * @author XYZ
 */
public class updcomputers extends javax.swing.JFrame {

    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;

    String query;
    int d=0, m=0 ,n=0,c=0;
    String b="",q="",r="",ms="" ;



    /** Creates new form cameras */
    public updcomputers() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        resol = new javax.swing.JTextField();
        mem = new javax.swing.JTextField();
        mktprice = new javax.swing.JTextField();
        disc = new javax.swing.JTextField();
        net = new javax.swing.JTextField();
        updcamera = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ccod = new javax.swing.JTextField();
        searchcamera = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Brand");

        bname.setFont(new java.awt.Font("Tahoma", 0, 24));
        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel2.setText("Quality");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel3.setText("Resolution");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setText("Memory support");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel5.setText("Market price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setText("Homeshop18 discount ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel7.setText("Net amount");

        qua.setFont(new java.awt.Font("Tahoma", 0, 24));
        qua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaActionPerformed(evt);
            }
        });

        resol.setFont(new java.awt.Font("Tahoma", 0, 24));
        resol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolActionPerformed(evt);
            }
        });

        mem.setFont(new java.awt.Font("Tahoma", 0, 24));

        mktprice.setFont(new java.awt.Font("Tahoma", 0, 24));

        disc.setFont(new java.awt.Font("Tahoma", 0, 24));
        disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discActionPerformed(evt);
            }
        });

        net.setFont(new java.awt.Font("Tahoma", 0, 24));

        updcamera.setFont(new java.awt.Font("Tahoma", 0, 24));
        updcamera.setText("UPDATE");
        updcamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updcameraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel8.setText("UPDATE FORM OF COMPUTERS");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton7.setText("<<MENU");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("COMPUTER CODE");

        ccod.setFont(new java.awt.Font("Tahoma", 0, 24));
        ccod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccodActionPerformed(evt);
            }
        });

        searchcamera.setText("SEARCH");
        searchcamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcameraActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ccod, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(searchcamera))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(net)
                                .addComponent(disc)
                                .addComponent(mktprice)
                                .addComponent(mem)
                                .addComponent(resol)
                                .addComponent(qua)
                                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(125, 125, 125)
                        .addComponent(updcamera))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ccod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(resol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mktprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(disc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addComponent(updcamera)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(searchcamera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_bnameActionPerformed

    private void quaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_quaActionPerformed

    private void resolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolActionPerformed
         // TODO add your handling code here:
}//GEN-LAST:event_resolActionPerformed

    private void updcameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updcameraActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","123");
            stmt=con.createStatement();

            //c=Integer.parseInt(ccod.getText());


            b=bname.getText();
            q=qua.getText();
            r=resol.getText();
            ms=mem.getText();

            m=Integer.parseInt(mktprice.getText());
            d=Integer.parseInt(disc.getText());
            n=Integer.parseInt(net.getText());

            query="update mycomcart set bname='"+b+"',qual='"+q+"',resol='"+r+"',memory='"+ms+"',mprice="+m+",disc="+d+",netprice="+n+" where ccode="+c+";";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"UPDATION DONE");
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }
}//GEN-LAST:event_updcameraActionPerformed

    private void discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ccodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccodActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ccodActionPerformed

    private void searchcameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcameraActionPerformed


        // TODO add your handling code here:
try
{
         Class.forName("java.sql.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","123");
         stmt=con.createStatement();

         c=Integer.parseInt(ccod.getText());


         query="select * from mycomcart where ccode="+c+";";
         rs=stmt.executeQuery(query);

            if(rs.next())
            {
             b=rs.getString("bname");
             bname.setText(b);

             q=rs.getString("qual");
             qua.setText(q);

             r=rs.getString("resol");
             resol.setText(r);

             ms=rs.getString("memory");
             mem.setText(ms);

             m=rs.getInt("mprice");
             mktprice.setText(""+m);

             d=rs.getInt("disc");
             disc.setText(""+d);

             n=rs.getInt("netprice");
             net.setText(""+n);


            }
            else
            {
              JOptionPane.showMessageDialog(null,"RECORD DOES NOT EXIST");
            }
}
 catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }

}//GEN-LAST:event_searchcameraActionPerformed


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updcameras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bname;
    private javax.swing.JTextField ccod;
    private javax.swing.JTextField disc;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField mem;
    private javax.swing.JTextField mktprice;
    private javax.swing.JTextField net;
    private javax.swing.JTextField qua;
    private javax.swing.JTextField resol;
    private javax.swing.JButton searchcamera;
    private javax.swing.JButton updcamera;
    // End of variables declaration//GEN-END:variables

}
