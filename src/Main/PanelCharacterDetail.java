/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lachtara
 */
public class PanelCharacterDetail extends javax.swing.JPanel {

	protected int ID;

	/**
	 * Creates new form PanelCharacterDetail
	 */
	public PanelCharacterDetail() {
		initComponents();
	}

	public PanelCharacterDetail getDetail(int ID, ResultSet result) {
		this.ID = ID;
		String name = "pnlCharDetail" + Integer.toString(ID);
		setName(name);
		try {
			result.beforeFirst();
			while (result.next() != false) {
				if (result.getInt("ID") == ID) {
					// both null
					if ((result.getString("Char_Lastname") == null) && (result.getString("Char_Alias") == null)) {
						lblCharname.setText(result.getString("Char_Firstname"));
						// lastname null
					} else if ((result.getString("Char_Lastname") == null) && !(result.getString("Char_Alias") == null)) {
						lblCharname.setText(result.getString("Char_Firstname") + " '" + result.getString("Char_Alias") + "'");
						// alias null
					} else if (!(result.getString("Char_Lastname") == null) && (result.getString("Char_Alias") == null)) {
						lblCharname.setText(result.getString("Char_Firstname") + " " + result.getString("Char_Lastname"));
						// none null
					} else {
						lblCharname.setText(result.getString("Char_Firstname") + " '" + result.getString("Char_Alias") + "' " + result.getString("Char_Lastname"));
					}
					lblRealname.setText("(" + result.getString("Real_Name") + ")");
					// body 
					lblRaceVal.setText(result.getString("Char_Race"));
					lblSexVal.setText(result.getString("Char_Sex"));
					lblAgeVal.setText(result.getString("Char_Age"));
					lblBeliefVal.setText(result.getString("Char_Belief"));
					lblGuildVal.setText(result.getString("Char_Guild"));
					txtareaDescriptionVal.setText(result.getString("Char_Description"));
					return this;
				}
			}
		} catch (SQLException ex) {
			Logger.getLogger(PanelCharacterDetail.class.getName()).log(Level.SEVERE, null, ex);
		}
		return this;
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

        lblCharname = new javax.swing.JLabel();
        lblRealname = new javax.swing.JLabel();
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

        setBackground(java.awt.Color.black);
        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        setLayout(new java.awt.GridBagLayout());

        lblCharname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCharname.setForeground(java.awt.Color.white);
        lblCharname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCharname.setText("CHAR_NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblCharname, gridBagConstraints);

        lblRealname.setForeground(java.awt.Color.white);
        lblRealname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRealname.setText("(REAL_NAME)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblRealname, gridBagConstraints);

        pnlSetAgeSex.setOpaque(false);
        pnlSetAgeSex.setPreferredSize(new java.awt.Dimension(305, 20));
        pnlSetAgeSex.setLayout(new java.awt.GridBagLayout());

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
                .addComponent(lblSexVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetSexLayout.setVerticalGroup(
            pnlSetSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSexVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlSetAgeSex.add(pnlSetSex, gridBagConstraints);

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
                .addComponent(lblAgeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetAgeLayout.setVerticalGroup(
            pnlSetAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlSetAgeSex.add(pnlSetAge, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(pnlSetAgeSex, gridBagConstraints);

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
                .addComponent(lblRaceVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetRaceLayout.setVerticalGroup(
            pnlSetRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblRace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRaceVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlSetRace, gridBagConstraints);

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
                .addComponent(lblBeliefVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetBeliefLayout.setVerticalGroup(
            pnlSetBeliefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetBeliefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblBelief, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBeliefVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlSetBelief, gridBagConstraints);

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
                .addComponent(lblGuildVal, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetGuildLayout.setVerticalGroup(
            pnlSetGuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetGuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblGuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGuildVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlSetGuild, gridBagConstraints);

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
                .addComponent(pnlScrollDescriptionVal, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSetDescriptionLayout.setVerticalGroup(
            pnlSetDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetDescriptionLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlScrollDescriptionVal))
            .addGroup(pnlSetDescriptionLayout.createSequentialGroup()
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pnlSetDescription, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextArea txtareaDescriptionVal;
    // End of variables declaration//GEN-END:variables
}
