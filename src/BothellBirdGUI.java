import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BothellBirdGUI {
	//-------------------------------------------------------
	// Member variables
	// ------------------------------------------------------
	// for pictures, instead of two separate text areas
	// added a JLabel and set the ImageIcon
	// ------------------------------------------------------
	private static JLabel birdPicture;
	private static JFrame frame;
	private static final String FRAME_TITLE = "Bothell Birder Application";
	private static final int FRAME_COORD_X = 0;
	private static final int FRAME_COORD_Y = 0;
	private static JTextArea birdTextArea; //not used b/c area replaced by picture
	private static JLabel searchLabel;
	private static JTextArea loadingTextArea;
	private static JTextField searchTextField;
	private static JButton descriptionButton;
	private static JButton soundButton;
	private static JButton searchButton;
	private static JButton recipeButton;
	private static JButton nextBirdButton;
	private static JButton prevBirdButton;
	private static final String SEARCH_FIELD_TEXT = "Enter a Bird Name";
	private static final String DESCRIP_TEXT = "Description";
	private static final String SOUND_TEXT = "Sound";
	private static final String SEARCH_TEXT = "Search";
	private static final String RECIPE_TEXT = "Recipe";
	private static final String NEXT_TEXT = "Next Bird >>";
	private static final String BACK_TEXT = "<< Previous Bird";
	private static final int TEXT_FIELD_SIZE = 20;
	private static final int TEXT_AREA_ROWS = 20; //not used b/c area replaced by picture
	private static final int TEXT_AREA_COLUMNS = 50;//not used b/c area replaced by picture
	private static final int LOAD_TEXT_AREA_ROWS = 15;
	private static final int LOAD_TEXT_AREA_COLUMNS = 50;
	private static JPanel centerPanel;
	private static JPanel northPanel;
	private static JPanel southPanel;
	private final static int YES_NO_OPTION = 0; // not currently used--for exiting out Y/N

	//-------------------------------------------------------
	// members for constructing things
	//-------------------------------------------------------
	public static BirdHandler program;
	public static BirdWhisperer control;
	public static BothellBirdGUI iBirdsFrame;
	private Bird currentBird;

	public static void main(String[] args) {

		// initialize these object class
		try {
			program = new BirdHandler(new File("birdcage.csv"));
			control = new BirdWhisperer(program); // what does this really return?
			iBirdsFrame = new BothellBirdGUI(control);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//-------------------------------------------------------
	// constructor to build the GUI and take in the BirdWhisperer Controller
	// to get a current bird for use
	//-------------------------------------------------------
	public BothellBirdGUI(BirdWhisperer control) {

		// get current bird
		currentBird = control.getBird();
		// call to the Birdwhisperer getBird, goes to Bird to getBird
		// give to the currentBird
		// now you can just call currentBird.getThisThatw/e();

		// call methods to construct javapad
		setComponents();
		createPanel();
		setFrame();
		addListeners();
	}

	public void setComponents() {
		// set components
		birdTextArea = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLUMNS); //not used
		loadingTextArea = new JTextArea(LOAD_TEXT_AREA_ROWS,
				LOAD_TEXT_AREA_COLUMNS);
		birdTextArea.setLineWrap(true);//not used b/c area replaced by picture
		birdTextArea.setForeground(Color.BLACK);//not used b/c area replaced by picture
		birdTextArea.setBackground(Color.WHITE);//not used b/c area replaced by picture
		searchLabel = new JLabel(SEARCH_TEXT);
		searchTextField = new JTextField(TEXT_FIELD_SIZE);
		searchTextField.setText(SEARCH_FIELD_TEXT);
		descriptionButton = new JButton(DESCRIP_TEXT);
		soundButton = new JButton(SOUND_TEXT);
		searchButton = new JButton(SEARCH_TEXT);
		recipeButton = new JButton(RECIPE_TEXT);
		nextBirdButton = new JButton(NEXT_TEXT);
		prevBirdButton = new JButton(BACK_TEXT);

		// set picture
		String path = "bird4.jpg";
		BufferedImage image = null;
		File file = null;
		file = new File(path);
		try {
			image = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		birdPicture = new JLabel(new ImageIcon(image));

	}

	public void setFrame() {
		// Master Frame
		frame = new JFrame(FRAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(FRAME_COORD_X, FRAME_COORD_Y);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());

		// add components to frame & set visible
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

	public void createPanel() {
		// north
		// 4 buttons on grid
		southPanel = new JPanel(new GridLayout(1, 3));
		southPanel.add(descriptionButton);
		southPanel.add(soundButton);
		southPanel.add(searchButton);
		southPanel.add(recipeButton);

		// center
		// picture space and scrollable text area
		centerPanel = new JPanel(new BorderLayout());
		centerPanel.add(birdPicture, BorderLayout.NORTH);
		// centerPanel.add(new JScrollPane(birdTextArea), BorderLayout.CENTER);
		centerPanel.add(new JScrollPane(loadingTextArea), BorderLayout.SOUTH);

		// south
		// buttons/label 2 flows embedded in grid layout
		JPanel southLayer = new JPanel(new FlowLayout());

		southLayer.add(prevBirdButton);
		southLayer.add(nextBirdButton);

		JPanel southLayer2 = new JPanel(new FlowLayout());
		southLayer2.add(searchLabel);
		southLayer2.add(searchTextField);

		northPanel = new JPanel(new GridLayout(2, 2));
		northPanel.add(southLayer);
		northPanel.add(southLayer2);
	}

	public void addListeners() {
		// event listeners added to buttons

		// ------------------------------------------
		// this method sets the description textArea to the generic info of the
		// bird -----can add anything else we want in this area
		// ------------------------------------------
		descriptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//gets the currentbird generic info as string and displays it
				//pops up an error message if it cannot be done
				try {
					String info = currentBird.getMyGenericInfo().toString();
					loadingTextArea.append(info);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not find the bird description, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		// --------------------------------------
		// OTHER EVENT LISTENERS To Implement
		// --------------------------------------
		searchTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ---------------------------------------------
					// IMPLEMENT AN ACTION
					// this one may not be necessary b/c the search "button"
					// should be able to handle this action
					// unless we want to let the user press "Enter" to search
					// ---------------------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not find the bird, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		soundButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ------------------------------
					// IMPLEMENT AN ACTION
					// ------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not find the bird sound please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		// -----------------------------------------------------
		// This method should be the one to change the controller
		// because it is requesting for a new bird to display
		// ------------------------------------------------------
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ------------------------------
					// IMPLEMENT AN ACTION
					// ------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not find the bird, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		recipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ------------------------------
					// IMPLEMENT AN ACTION
					// ------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not find the bird recipe, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		nextBirdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ------------------------------
					// IMPLEMENT AN ACTION
					// ------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not execute next Bird Action, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
		prevBirdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					// ------------------------------
					// IMPLEMENT AN ACTION
					// ------------------------------
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							BothellBirdGUI.getFrame(),
							"Could not execute previous bird action, please verify and try again.",
							null, JOptionPane.ERROR_MESSAGE, null);
				}

			}
		});
	}

	// GETTER AND SETTER METHODS FOR ACTIONLISTENERS TO USE
	// ADD MORE as necessary
	public static JTextArea getLoadTextArea() {
		return loadingTextArea;
	}

	public static void setLoadTextArea(JTextArea textArea) {
		BothellBirdGUI.loadingTextArea = textArea;
	}

	public static String getSearchFieldText() {
		return searchTextField.getText();
	}

	public static JTextArea getBirdTextArea() {
		return birdTextArea;
	}

	public static void setBirdTextArea(JTextArea textArea) {
		BothellBirdGUI.birdTextArea = textArea;
	}

	public static JTextField getSearchTextField() {
		return searchTextField;
	}

	public static void setFontTextField(JTextField searchTextField) {
		BothellBirdGUI.searchTextField = searchTextField;
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		BothellBirdGUI.frame = frame;
	}

	public static int getYesNoOption() {
		return YES_NO_OPTION;
	}
}
