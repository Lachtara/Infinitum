/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author lachtara
 */
public class PanelCharacterTile extends javax.swing.JPanel implements MouseListener {

	protected int ID;

	/**
	 * Creates new form PanelCharacterTile
	 */
	public PanelCharacterTile() {
		initComponents();
	}

	// getter and setter
	// Head
	public void setLblCharname(String text) {
		lblCharname.setText(text);
	}

	public String getLblCharname() {
		return lblCharname.getText();
	}

	public void setLblRealname(String text) {
		lblRealname.setText(text);
	}

	public String getLblRealname() {
		return lblRealname.getText();
	}

	public void setActiveSelected(boolean state) {
		btnTglActive.setSelected(state);
		if (state) {
			btnTglActive.setText("deactivate");
		} else {
			btnTglActive.setText("activate");
		}
	}

	// body
	public void setLblRace(String text) {
		lblRaceVal.setText(text);
	}

	public String getLblRace() {
		return lblRaceVal.getText();
	}

	public void setLblSex(String text) {
		lblSexVal.setText(text);
	}

	public String getLblSex() {
		return lblSexVal.getText();
	}

	public void setLblAge(String text) {
		lblAgeVal.setText(text);
	}

	public String getLblAge() {
		return lblAgeVal.getText();
	}

	public void setLblBelief(String text) {
		lblBeliefVal.setText(text);
	}

	public String getLblBelief() {
		return lblBeliefVal.getText();
	}

	public void setLblGuild(String text) {
		lblGuildVal.setText(text);
	}

	public String getLblGuild() {
		return lblGuildVal.getText();
	}

	public void setTxtareaDescription(String text) {
		txtareaDescriptionVal.setText(text);
	}

	public String getTxtareaDescription() {
		return txtareaDescriptionVal.getText();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTileHead = new javax.swing.JPanel();
        lblCharname = new javax.swing.JLabel();
        lblRealname = new javax.swing.JLabel();
        btnTglActive = new javax.swing.JToggleButton();
        pnlTileShortinfo = new javax.swing.JPanel();
        pnlSetAgeSex = new javax.swing.JPanel();
        pnlSetSex = new javax.swing.JPanel();
        lblSex = new javax.swing.JLabel();
        lblSexVal = new javax.swing.JLabel();
        pnlSetAge = new javax.swing.JPanel();
        lblAge = new javax.swing.JLabel();
        lblAgeVal = new javax.swing.JLabel();
        pnlSetRace = new javax.swing.JPanel();
        lblRace = new javax.swing.JLabel();
        lblRaceVal = new javax.swing.JLabel();
        pnlSetBelief = new javax.swing.JPanel();
        lblBelief = new javax.swing.JLabel();
        lblBeliefVal = new javax.swing.JLabel();
        pnlSetGuild = new javax.swing.JPanel();
        lblGuild = new javax.swing.JLabel();
        lblGuildVal = new javax.swing.JLabel();
        pnlSetDescription = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        pnlScrollDescriptionVal = new javax.swing.JScrollPane();
        txtareaDescriptionVal = new javax.swing.JTextArea();

        setBackground(java.awt.Color.pink);
        setForeground(java.awt.Color.white);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 200));
        setLayout(new java.awt.GridBagLayout());

        pnlTileHead.setBackground(java.awt.Color.black);
        pnlTileHead.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        lblCharname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCharname.setForeground(java.awt.Color.white);
        lblCharname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCharname.setText("Charname");
        lblCharname.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblRealname.setForeground(java.awt.Color.white);
        lblRealname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRealname.setText("(Realname)");

        btnTglActive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTglActiveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTileHeadLayout = new javax.swing.GroupLayout(pnlTileHead);
        pnlTileHead.setLayout(pnlTileHeadLayout);
        pnlTileHeadLayout.setHorizontalGroup(
            pnlTileHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTileHeadLayout.createSequentialGroup()
                .addGroup(pnlTileHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTileHeadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRealname))
                    .addGroup(pnlTileHeadLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblCharname)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
                .addComponent(btnTglActive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTileHeadLayout.setVerticalGroup(
            pnlTileHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTileHeadLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlTileHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTglActive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTileHeadLayout.createSequentialGroup()
                        .addComponent(lblCharname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRealname)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        add(pnlTileHead, gridBagConstraints);

        pnlTileShortinfo.setBackground(java.awt.Color.black);
        pnlTileShortinfo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlTileShortinfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        pnlSetAgeSex.setOpaque(false);
        pnlSetAgeSex.setPreferredSize(new java.awt.Dimension(305, 20));

        pnlSetSex.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetSex.setOpaque(false);
        pnlSetSex.setPreferredSize(new java.awt.Dimension(150, 20));

        lblSex.setForeground(java.awt.Color.white);
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSex.setText("Geschlecht");

        lblSexVal.setForeground(java.awt.Color.white);
        lblSexVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSexVal.setText("PH_sex");

        javax.swing.GroupLayout pnlSetSexLayout = new javax.swing.GroupLayout(pnlSetSex);
        pnlSetSex.setLayout(pnlSetSexLayout);
        pnlSetSexLayout.setHorizontalGroup(
            pnlSetSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetSexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSexVal, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetSexLayout.setVerticalGroup(
            pnlSetSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSexVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSetAge.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetAge.setOpaque(false);
        pnlSetAge.setPreferredSize(new java.awt.Dimension(150, 20));

        lblAge.setForeground(java.awt.Color.white);
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age");

        lblAgeVal.setForeground(java.awt.Color.white);
        lblAgeVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgeVal.setText("PH_Alter");

        javax.swing.GroupLayout pnlSetAgeLayout = new javax.swing.GroupLayout(pnlSetAge);
        pnlSetAge.setLayout(pnlSetAgeLayout);
        pnlSetAgeLayout.setHorizontalGroup(
            pnlSetAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetAgeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAgeVal, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetAgeLayout.setVerticalGroup(
            pnlSetAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSetAgeSexLayout = new javax.swing.GroupLayout(pnlSetAgeSex);
        pnlSetAgeSex.setLayout(pnlSetAgeSexLayout);
        pnlSetAgeSexLayout.setHorizontalGroup(
            pnlSetAgeSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetAgeSexLayout.createSequentialGroup()
                .addComponent(pnlSetAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlSetSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSetAgeSexLayout.setVerticalGroup(
            pnlSetAgeSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetAgeSexLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlSetAgeSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSetAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSetSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlTileShortinfo.add(pnlSetAgeSex);

        pnlSetRace.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetRace.setOpaque(false);
        pnlSetRace.setPreferredSize(new java.awt.Dimension(305, 20));

        lblRace.setForeground(java.awt.Color.white);
        lblRace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRace.setText("Volk");

        lblRaceVal.setForeground(java.awt.Color.white);
        lblRaceVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRaceVal.setText("PH_Volk");

        javax.swing.GroupLayout pnlSetRaceLayout = new javax.swing.GroupLayout(pnlSetRace);
        pnlSetRace.setLayout(pnlSetRaceLayout);
        pnlSetRaceLayout.setHorizontalGroup(
            pnlSetRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetRaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRace, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRaceVal, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetRaceLayout.setVerticalGroup(
            pnlSetRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblRace, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addComponent(lblRaceVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTileShortinfo.add(pnlSetRace);

        pnlSetBelief.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetBelief.setOpaque(false);
        pnlSetBelief.setPreferredSize(new java.awt.Dimension(305, 20));

        lblBelief.setForeground(java.awt.Color.white);
        lblBelief.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBelief.setText("Glaube");

        lblBeliefVal.setForeground(java.awt.Color.white);
        lblBeliefVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBeliefVal.setText("PH_Glaube");

        javax.swing.GroupLayout pnlSetBeliefLayout = new javax.swing.GroupLayout(pnlSetBelief);
        pnlSetBelief.setLayout(pnlSetBeliefLayout);
        pnlSetBeliefLayout.setHorizontalGroup(
            pnlSetBeliefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetBeliefLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBelief, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBeliefVal, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetBeliefLayout.setVerticalGroup(
            pnlSetBeliefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetBeliefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblBelief, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addComponent(lblBeliefVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTileShortinfo.add(pnlSetBelief);

        pnlSetGuild.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetGuild.setOpaque(false);
        pnlSetGuild.setPreferredSize(new java.awt.Dimension(305, 20));

        lblGuild.setForeground(java.awt.Color.white);
        lblGuild.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuild.setText("Gilde");

        lblGuildVal.setForeground(java.awt.Color.white);
        lblGuildVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGuildVal.setText("PH_Gilde");

        javax.swing.GroupLayout pnlSetGuildLayout = new javax.swing.GroupLayout(pnlSetGuild);
        pnlSetGuild.setLayout(pnlSetGuildLayout);
        pnlSetGuildLayout.setHorizontalGroup(
            pnlSetGuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetGuildLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuild, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGuildVal, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetGuildLayout.setVerticalGroup(
            pnlSetGuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetGuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblGuild, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addComponent(lblGuildVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTileShortinfo.add(pnlSetGuild);

        pnlSetDescription.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        pnlSetDescription.setOpaque(false);
        pnlSetDescription.setPreferredSize(new java.awt.Dimension(305, 60));

        lblDescription.setForeground(java.awt.Color.white);
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescription.setText("Beschreibung");

        pnlScrollDescriptionVal.setBorder(null);
        pnlScrollDescriptionVal.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtareaDescriptionVal.setEditable(false);
        txtareaDescriptionVal.setBackground(java.awt.Color.black);
        txtareaDescriptionVal.setColumns(1);
        txtareaDescriptionVal.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtareaDescriptionVal.setForeground(java.awt.Color.white);
        txtareaDescriptionVal.setLineWrap(true);
        txtareaDescriptionVal.setRows(1);
        txtareaDescriptionVal.setTabSize(4);
        txtareaDescriptionVal.setText("PH_Beschreibung");
        txtareaDescriptionVal.setWrapStyleWord(true);
        txtareaDescriptionVal.setBorder(null);
        txtareaDescriptionVal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlScrollDescriptionVal.setViewportView(txtareaDescriptionVal);

        javax.swing.GroupLayout pnlSetDescriptionLayout = new javax.swing.GroupLayout(pnlSetDescription);
        pnlSetDescription.setLayout(pnlSetDescriptionLayout);
        pnlSetDescriptionLayout.setHorizontalGroup(
            pnlSetDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescription)
                .addGap(18, 18, 18)
                .addComponent(pnlScrollDescriptionVal, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetDescriptionLayout.setVerticalGroup(
            pnlSetDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetDescriptionLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlScrollDescriptionVal))
            .addGroup(pnlSetDescriptionLayout.createSequentialGroup()
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pnlTileShortinfo.add(pnlSetDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pnlTileShortinfo, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTglActiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTglActiveMouseClicked
		ResultSet result = DB.getAll();
		try {
			while (result.next()) {
				if (result.getInt("ID") == ID) {
					Boolean state = result.getBoolean("Active");
					result.updateBoolean("Active", !state);
					result.updateRow();
					if (!state) {
						btnTglActive.setText("deactivate");
					} else {
						btnTglActive.setText("activate");
					}
					break;
				}
			}
		} catch (SQLException ex) {
			Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnTglActiveMouseClicked

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("activated");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseExited(MouseEvent e) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnTglActive;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeVal;
    private javax.swing.JLabel lblBelief;
    private javax.swing.JLabel lblBeliefVal;
    private javax.swing.JLabel lblCharname;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblGuild;
    private javax.swing.JLabel lblGuildVal;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblRaceVal;
    private javax.swing.JLabel lblRealname;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblSexVal;
    private javax.swing.JScrollPane pnlScrollDescriptionVal;
    private javax.swing.JPanel pnlSetAge;
    private javax.swing.JPanel pnlSetAgeSex;
    private javax.swing.JPanel pnlSetBelief;
    private javax.swing.JPanel pnlSetDescription;
    private javax.swing.JPanel pnlSetGuild;
    private javax.swing.JPanel pnlSetRace;
    private javax.swing.JPanel pnlSetSex;
    private javax.swing.JPanel pnlTileHead;
    private javax.swing.JPanel pnlTileShortinfo;
    private javax.swing.JTextArea txtareaDescriptionVal;
    // End of variables declaration//GEN-END:variables

}
