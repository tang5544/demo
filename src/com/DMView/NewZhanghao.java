/*
 * StudentInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DMModel.User;
import com.DMUtil.DMUtil;
import com.Dao.UserDao;

/**
 *
 * @author  __USER__
 */
public class NewZhanghao extends javax.swing.JInternalFrame {
	public static DMUtil dmutil = new DMUtil();
	public static UserDao userDao = new UserDao();

	/** Creates new form StudentInterFrm */
	public NewZhanghao() {
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
zhanghaoTxt = new javax.swing.JTextField();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
jb_regist = new javax.swing.JButton();
jb_exit = new javax.swing.JButton();
mimaTxt = new javax.swing.JTextField();
nameTxt = new javax.swing.JTextField();
positionTxt = new javax.swing.JTextField();


setClosable(true);
setIconifiable(true);
setResizable(true);
setTitle("创建新用户");

jLabel1.setText("账号：");


jLabel3.setText("密码：");

jLabel4.setText("姓名：");


jLabel6.setText("职称：");


jb_regist.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\add.png")); // NOI18N
jb_regist.setText("创建");
jb_regist.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_registActionPerformed(evt);
}
});

jb_exit.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\exit.png")); // NOI18N
jb_exit.setText("退出");
jb_exit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_exitActionPerformed(evt);
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
.addComponent(zhanghaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup())

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
.addComponent(positionTxt)
.addComponent(nameTxt)
.addComponent(mimaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jb_regist))
.addGroup(layout.createSequentialGroup()
.addGap(125, 125, 125)
.addComponent(jb_exit)))
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
.addComponent(zhanghaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(mimaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(positionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jb_regist)
.addComponent(jb_exit))))
.addContainerGap(18, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents
	private void jb_registActionPerformed(java.awt.event.ActionEvent evt) {
		String zhanghao = this.zhanghaoTxt.getText();
		String mima = this.mimaTxt.getText();
		String name = this.nameTxt.getText();
		String position = this.positionTxt.getText();
		String userright = "员工";
		User user =new User(zhanghao,mima,userright,name,position);
		 if(zhanghaoTxt.getText().equals("")) {
		    	JOptionPane.showMessageDialog(null, "请输入账号！");
		    	return;
		    }
		    if(mimaTxt.getText().equals("")) {
		    	JOptionPane.showMessageDialog(null, "请输入密码！");
		    	return;
		    }
		    if(nameTxt.getText().equals("")) {
		    	JOptionPane.showMessageDialog(null, "请输入姓名！");
		    	return;
		    }
		    if(positionTxt.getText().equals("")) {
		    	JOptionPane.showMessageDialog(null, "请输入职位！");
		    	return;
		    }
		
		    Connection conn=null;
			int a = JOptionPane.showConfirmDialog(null, "确定添加？");	
		try {
			conn = dmutil.getCon();
			User use = userDao.updatedata(conn, user);
			if (a == 0) {
				JOptionPane.showMessageDialog(null, "添加成功！");
				this.resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "添加失败！");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "添加失败！");
			e.printStackTrace();
		}
	}

	private void resetValue() {
		zhanghaoTxt.setText("");
		mimaTxt.setText("");
		nameTxt.setText("");
		positionTxt.setText("");


	}

	private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {
			this.dispose();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField zhanghaoTxt;
	private javax.swing.JTextField positionTxt;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JButton jb_exit;
	private javax.swing.JButton jb_regist;
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTextField mimaTxt;

	// End of variables declaration//GEN-END:variables

}