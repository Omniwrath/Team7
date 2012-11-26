import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BothellBirdGUI.java
 *
 * Created on Oct 18, 2012, 3:34:52 PM
 */

/**
 * 
 * @author Chad Hickenbottom
 */
public class BothellBirdGUI extends javax.swing.JFrame {

	/** Creates new form BothellBirdGUI */
	public BothellBirdGUI(BirdWhisperer control) {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		ButtonsPanel = new javax.swing.JPanel();
		DescriptionjButton = new javax.swing.JButton();
		soundjButton = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		RecipejButton = new javax.swing.JButton();
		picturejPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		SearchjTextField = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jMenuBar1 = new javax.swing.JMenuBar();
		FilejMenu = new javax.swing.JMenu();
		NextjMenuItem = new javax.swing.JMenuItem();
		PreviousjMenuItem = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		ExitjMenuItem = new javax.swing.JMenuItem();
		EditjMenu = new javax.swing.JMenu();
		HelpjMenu = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		AboutjMenu = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("iBirds");
		setResizable(false);

		ButtonsPanel.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		ButtonsPanel.setLayout(new java.awt.GridLayout(1, 4, 5, 5));

		DescriptionjButton.setText("Description");
		ButtonsPanel.add(DescriptionjButton);

		soundjButton.setText("Sound");
		soundjButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				soundjButtonActionPerformed(evt);
			}
		});
		ButtonsPanel.add(soundjButton);

		jButton3.setText("Search");
		ButtonsPanel.add(jButton3);

		RecipejButton.setText("Recipe");
		ButtonsPanel.add(RecipejButton);

		picturejPanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 255, 204)));

		jLabel1.setToolTipText("Bird Stupid");
		jLabel1.setMinimumSize(new java.awt.Dimension(383, 333));
		jLabel1.setPreferredSize(new java.awt.Dimension(383, 333));

		jButton1.setText("<<");

		jButton2.setText(">>");

		jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Bird");

		javax.swing.GroupLayout picturejPanelLayout = new javax.swing.GroupLayout(
				picturejPanel);
		picturejPanel.setLayout(picturejPanelLayout);
		picturejPanelLayout
				.setHorizontalGroup(picturejPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								picturejPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												picturejPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																383,
																Short.MAX_VALUE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																383,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton2)
										.addContainerGap()));
		picturejPanelLayout
				.setVerticalGroup(picturejPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								picturejPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												picturejPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																picturejPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				picturejPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								34,
																								Short.MAX_VALUE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								290,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				picturejPanelLayout
																						.createSequentialGroup()
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								191,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(51,
																								51,
																								51)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																picturejPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				190,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(64,
																				64,
																				64)))));

		SearchjTextField.setText("Search");
		SearchjTextField.setToolTipText("Type the name of the bird");

		jPanel1.setForeground(new java.awt.Color(0, 255, 204));

		jTextField1.setEditable(false);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTextField1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 177,
				Short.MAX_VALUE));

		FilejMenu.setText("File");

		NextjMenuItem.setText("Next");
		FilejMenu.add(NextjMenuItem);

		PreviousjMenuItem.setText("Previous");
		FilejMenu.add(PreviousjMenuItem);
		FilejMenu.add(jSeparator1);

		ExitjMenuItem.setText("Exit");
		ExitjMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ExitjMenuItemActionPerformed(evt);
			}
		});
		FilejMenu.add(ExitjMenuItem);

		jMenuBar1.add(FilejMenu);

		EditjMenu.setText("Edit");
		jMenuBar1.add(EditjMenu);

		HelpjMenu.setText("Help");

		jMenuItem1.setText("Search");
		HelpjMenu.add(jMenuItem1);

		jMenuBar1.add(HelpjMenu);

		AboutjMenu.setText("About");
		jMenuBar1.add(AboutjMenu);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														picturejPanel,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														ButtonsPanel,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														521, Short.MAX_VALUE)
												.addComponent(
														SearchjTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														129,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										21,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jButton4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														SearchjTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(picturejPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(ButtonsPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		pack();
	}// </editor-fold>

	private void soundjButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void ExitjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				BirdHandler program;
				BirdWhisperer control;
				BothellBirdGUI iBirdsFrame = null; // set to null to avoid
													// initialization error for
													// now
				try {
					program = new BirdHandler(new File("test"));
					control = new BirdWhisperer(program);
					iBirdsFrame = new BothellBirdGUI(control);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
				int x = (Screen.width - iBirdsFrame.getWidth()) / 2;
				int y = (Screen.height - iBirdsFrame.getHeight()) / 2;
				iBirdsFrame.setBounds(x, y, iBirdsFrame.getWidth(),
						iBirdsFrame.getHeight());

				iBirdsFrame.setVisible(true);
				iBirdsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JMenu AboutjMenu;
	private javax.swing.JPanel ButtonsPanel;
	private javax.swing.JButton DescriptionjButton;
	private javax.swing.JMenu EditjMenu;
	private javax.swing.JMenuItem ExitjMenuItem;
	private javax.swing.JMenu FilejMenu;
	private javax.swing.JMenu HelpjMenu;
	private javax.swing.JMenuItem NextjMenuItem;
	private javax.swing.JMenuItem PreviousjMenuItem;
	private javax.swing.JButton RecipejButton;
	private javax.swing.JTextField SearchjTextField;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JPanel picturejPanel;
	private javax.swing.JButton soundjButton;
	// End of variables declaration
}