/*
 * StudentInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;


import java.sql.Connection;

import javax.swing.JOptionPane;
import com.DMModel.Googs;
import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;
/**
 *
 * @author  __USER__
 */
public class ruku extends javax.swing.JInternalFrame {
	
	public static DMUtil dmutil = new DMUtil();
	public static GoogsDao googs = new GoogsDao();
	/** Creates new form StudentInterFrm */
	public ruku() {
		initComponents();
		this.setLocation(200, 50);
	}



	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

new javax.swing.ButtonGroup();
jLabel1 = new javax.swing.JLabel();
huohaoTxt = new javax.swing.JTextField();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jLabel7 = new javax.swing.JLabel();
jLabel8 = new javax.swing.JLabel();
jb_add = new javax.swing.JButton();
jb_reset = new javax.swing.JButton();
huomingTxt = new javax.swing.JTextField();
canghaoTxt = new javax.swing.JTextField();
jiahaoTxt = new javax.swing.JTextField();
shuliangTxt = new javax.swing.JTextField();
beizhuTxt = new javax.swing.JTextField();

setClosable(true);
setIconifiable(true);
setResizable(true);
setTitle("入库登记");

jLabel1.setText("货物编号：");


jLabel3.setText("货物名：");

jLabel4.setText("仓库号：");


jLabel6.setText("货架号：");

jLabel7.setText("数量：");

jLabel8.setText("货物单价：");

jb_add.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\add.png")); // NOI18N
jb_add.setText("登记");
jb_add.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
			Druku.jb_addActionPerformed(evt);
			
}
});

jb_reset.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\exit.png")); // NOI18N
jb_reset.setText("重置");
jb_reset.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
	  Druku.jb_resetActionPerformed(evt);

}
});



javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel6)
.addGap(192, 192, 192))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(huohaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel7)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(shuliangTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel8)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(beizhuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel4)
.addGap(20, 20, 20))
.addGroup(layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jiahaoTxt)
.addComponent(canghaoTxt)
.addComponent(huomingTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jb_add))
.addGroup(layout.createSequentialGroup()
.addGap(125, 125, 125)
.addComponent(jb_reset)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
);

layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addContainerGap())
.addGroup(layout.createSequentialGroup()
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(huohaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(huomingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(canghaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(jiahaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel7)
.addComponent(shuliangTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel8)
.addComponent(beizhuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jb_add)
.addComponent(jb_reset))))
.addContainerGap(18, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents




	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	public static javax.swing.JTextField jiahaoTxt;
	public static javax.swing.JTextField canghaoTxt;
	public static javax.swing.JLabel jLabel1;
	public static javax.swing.JLabel jLabel3;
	public static javax.swing.JLabel jLabel4;
	public static javax.swing.JLabel jLabel6;
	public static javax.swing.JLabel jLabel7;
	public static javax.swing.JLabel jLabel8;
	public static javax.swing.JButton jb_reset;
	public static javax.swing.JButton jb_add;
	public static javax.swing.JTextField huohaoTxt;
	public static javax.swing.JTextField huomingTxt;
	public static javax.swing.JTextField shuliangTxt;
	public static javax.swing.JTextField beizhuTxt;
	// End of variables declaration//GEN-END:variables

}