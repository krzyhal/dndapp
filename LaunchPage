import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;



public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();
	//buttons
	JButton myButton = new JButton();
	JButton conButton = new JButton();
	JButton editButton = new JButton();
	JButton rollButton = new JButton();
	JButton rerollButton = new JButton();
	//labels
	JLabel appname = new JLabel();
	JLabel nameLabel = new JLabel();
	JLabel rollLabel = new JLabel();
	JLabel strLabel = new JLabel("Strength");
	JLabel dexLabel = new JLabel("Dexterity");
	JLabel conLabel = new JLabel("Constitution");
	JLabel intLabel = new JLabel("Intelligence");
	JLabel wisLabel = new JLabel("Wisdom");
	JLabel chaLabel = new JLabel("Charisma");
	JLabel strResult;
	JLabel dexResult;
	JLabel conResult;
	JLabel intResult;
	JLabel wisResult;
	JLabel chaResult;
	JLabel plus2 = new JLabel("+2");
	JLabel plus1 = new JLabel("+1");
	//panels
	JPanel charPanel = new JPanel();
	JPanel racePanel = new JPanel();
	JPanel statPanel = new JPanel();
	JPanel strPanel = new JPanel();
	JPanel dexPanel = new JPanel();
	JPanel conPanel = new JPanel();
	JPanel intPanel = new JPanel();
	JPanel wisPanel = new JPanel();
	JPanel chaPanel = new JPanel();
	//race options
	JRadioButton humanRadio = new JRadioButton("Human");
	JRadioButton dwarfRadio;
	JRadioButton elfRadio = new JRadioButton("Elf");
	JRadioButton tieflingRadio = new JRadioButton("Tiefling");
	//name input
	JTextField charName = new JTextField();
	//character's name
	static String name;
	String strength;
	String dexterity;
	String constitution;
	String intelligence;
	String wisdom;
	String charisma;
	
	ArrayList<Integer> diceRolls = new ArrayList<Integer>();
	boolean racebonus = true;
	int bonus2 = 0;
	int bonus1 = 0;
	int i = 1;
	
	public List<String> convert() {
	List<String> result = new ArrayList<>();
	for (Integer i : diceRolls) {
	    result.add(i.toString());
	    }
	return result;
	}
	
	
	
	LaunchPage(){
		
		myButton.setEnabled(false);
		
		diceRolls.add(0);
		diceRolls.add(0);
		diceRolls.add(0);
		diceRolls.add(0);
		diceRolls.add(0);
		diceRolls.add(0);
		rerollButton.setText("Re-roll");
		
		nameLabel.setText("Character's name:");
		strength = (diceRolls.get(0).toString()); 
		dexterity = (diceRolls.get(1).toString()); 
		constitution = (diceRolls.get(2).toString());
		intelligence = (diceRolls.get(3).toString()); 
		wisdom = (diceRolls.get(4).toString()); 
		charisma = (diceRolls.get(5).toString()); 
		
		//race options group
		dwarfRadio = new JRadioButton("Dwarf");
		dwarfRadio.addActionListener(this);
		elfRadio = new JRadioButton("Elf");
		elfRadio.addActionListener(this);
		tieflingRadio = new JRadioButton("Tiefling");
		tieflingRadio.addActionListener(this);
		humanRadio.addActionListener(this);
		ButtonGroup racegroup = new ButtonGroup();
		racegroup.add(humanRadio);
		racegroup.add(dwarfRadio);
		racegroup.add(elfRadio);
		racegroup.add(tieflingRadio);
		
		
		//panel for character's name
		charPanel.setBackground(Color.LIGHT_GRAY);
		charPanel.setBounds(100,70,600,40);
		//panel for character's race option
		racePanel.setBackground(Color.LIGHT_GRAY);
		racePanel.setBounds(100,120,600,40);
		racePanel.add(humanRadio);
		racePanel.add(dwarfRadio);
		racePanel.add(elfRadio);
		racePanel.add(tieflingRadio);
		
		//dicerolls
		
		Collections.sort(diceRolls, Collections.reverseOrder());
		
		rollLabel.setText("Roll results are: "+Arrays.asList(diceRolls));
		rollLabel.setHorizontalAlignment(JLabel.CENTER);
		rollLabel.setVerticalAlignment(JLabel.TOP);
		//Arrays.toString(diceRolls);
		
		//panel for rolling statistics
		statPanel.setBackground(Color.LIGHT_GRAY);
		statPanel.setBounds(100,170,600,50);
		statPanel.add(rollLabel);
		rerollButton.addActionListener(this);
		statPanel.add(rerollButton);

		//strength panel
		strPanel.setBackground(Color.LIGHT_GRAY);
		strPanel.setBounds(100,190,600,50);
		strPanel.add(strLabel);
		strResult = new JLabel();
		strResult.setText(strength);
		strResult.setBackground(Color.white);
		strResult.setOpaque(true);
		strPanel.add(strResult);

		
		//dexterity panel
		dexPanel.setBackground(Color.LIGHT_GRAY);
		dexPanel.setBounds(100,190,600,50);
		dexPanel.add(dexLabel);
		dexResult = new JLabel();
		dexResult.setText(dexterity);
		dexResult.setBackground(Color.white);
		dexResult.setOpaque(true);
		dexPanel.add(dexResult);
		
		//constitution panel
		conPanel.setBackground(Color.LIGHT_GRAY);
		conPanel.setBounds(100,190,600,50);
		conPanel.add(conLabel);
		conResult = new JLabel();
		conResult.setText(constitution);
		conResult.setBackground(Color.white);
		conResult.setOpaque(true);
		conPanel.add(conResult);
		
		//intelligence panel
		intPanel.setBackground(Color.LIGHT_GRAY);
		intPanel.setBounds(100,190,600,50);
		intPanel.add(intLabel);
		intResult = new JLabel();
		intResult.setText(intelligence);
		intResult.setBackground(Color.white);
		intResult.setOpaque(true);
		intPanel.add(intResult);
		
		//wisdom panel
		wisPanel.setBackground(Color.LIGHT_GRAY);
		wisPanel.setBounds(100,190,600,50);
		wisPanel.add(wisLabel);
		wisResult = new JLabel();
		wisResult.setText(wisdom);
		wisResult.setBackground(Color.white);
		wisResult.setOpaque(true);
		wisPanel.add(wisResult);
		
		//charisma panel
		chaPanel.setBackground(Color.LIGHT_GRAY);
		chaPanel.setBounds(100,190,600,50);
		chaPanel.add(chaLabel);
		chaResult = new JLabel();
		chaResult.setText(charisma);
		chaResult.setBackground(Color.white);
		chaResult.setOpaque(true);
		chaPanel.add(chaResult);
		
		//confirmation button for textfield
		conButton.setText("Confirm");
		conButton.addActionListener(this);
		
		//edit button for textfield
		editButton.setText("Edit");
		editButton.addActionListener(this);
		
		//textfield for name
		charName.setPreferredSize(new Dimension(150,30));
		charName.setText("");
		nameLabel.setHorizontalTextPosition(JLabel.LEFT);
		charPanel.add(nameLabel);
		charPanel.add(charName);
		charPanel.add(conButton);
		charPanel.add(editButton);
		
		//header
		appname.setText("DnD 5.0 Character Planner");
		appname.setBounds(200,10,400,50);
		appname.setHorizontalAlignment(JLabel.CENTER);
		appname.setHorizontalTextPosition(JLabel.CENTER);
		appname.setFont(new Font(null, Font.BOLD, 25));
		
		//new window with results
		myButton.setText("Preview");
		myButton.setBounds(350, 680, 100, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		//frame contents and properties
		frame.add(appname);
		frame.add(charPanel);
		frame.add(racePanel);
		frame.add(statPanel);
		frame.add(strPanel);
		frame.add(dexPanel);
		frame.add(conPanel);
		frame.add(intPanel);
		frame.add(wisPanel);
		frame.add(chaPanel);
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,800);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(20,4));
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==myButton) {
			NewWindow previewPage = new NewWindow();
		}
		else if (e.getSource()==conButton) {
			charName.getText();
			name = charName.getText();
			conButton.setEnabled(false);
			charName.setEditable(false);
			System.out.println(name);
		}
		else if (e.getSource()==editButton) {
			charName.setEditable(true);
			conButton.setEnabled(true);
		}
		
		else if (e.getSource()==dwarfRadio) {
			bonus2 = 2;
			bonus1 = 1;
			plus1.setVisible(true);
			plus2.setVisible(true);
			strResult.setText(String.valueOf(Integer.parseInt(strength)+bonus1));
			strPanel.add(plus1);
			dexResult.setText(dexterity);
			conResult.setText(String.valueOf(Integer.parseInt(constitution)+bonus2));
			conPanel.add(plus2);
			intResult.setText(intelligence);
			wisResult.setText(wisdom);
			chaResult.setText(charisma);
			System.out.println("A Dwarf");
			bonus2 = -2;
			bonus1 = -1;
			
			frame.repaint();
		}
		else if (e.getSource()==elfRadio) {
			bonus2 = 2;
			bonus1 = 1;
			plus1.setVisible(true);
			plus2.setVisible(true);
			strResult.setText(strength);
			dexResult.setText(String.valueOf(Integer.parseInt(dexterity)+bonus2));
			dexPanel.add(plus2);
			conResult.setText(constitution);
			intResult.setText(intelligence);
			wisResult.setText(String.valueOf(Integer.parseInt(wisdom)+bonus1));
			wisPanel.add(plus1);
			chaResult.setText(charisma);
			System.out.println("An Elf");
			bonus2 = -2;
			bonus1 = -1;
			frame.repaint();
		}
		else if (e.getSource()==tieflingRadio) {
			bonus2 = 2;
			bonus1 = 1;
			plus1.setVisible(true);
			plus2.setVisible(true);
			strResult.setText(strength);
			dexResult.setText(dexterity);
			conResult.setText(constitution);
			intResult.setText(String.valueOf(Integer.parseInt(intelligence)+bonus1));
			intPanel.add(plus1);
			wisResult.setText(wisdom);
			chaResult.setText(String.valueOf(Integer.parseInt(charisma)+bonus2));
			chaPanel.add(plus2);
			System.out.println("A Tiefling");
			bonus2 = -2;
			bonus1 = -1;
			frame.repaint();
		}
		else if (e.getSource()==humanRadio) {
			bonus2 = 0;
			bonus1 = 0;
			plus1.setVisible(false);
			plus2.setVisible(false);
			strResult.setText(strength);
			dexResult.setText(dexterity);
			conResult.setText(constitution);
			intResult.setText(intelligence);
			wisResult.setText(wisdom);
			chaResult.setText(charisma);
			System.out.println("A Human");
			
		}
		else if (e.getSource()==rerollButton) {
			diceRolls.clear();
			diceRolls.add(diceRoll());
			diceRolls.add(diceRoll());
			diceRolls.add(diceRoll());
			diceRolls.add(diceRoll());
			diceRolls.add(diceRoll());
			diceRolls.add(diceRoll());
			
			strength = (diceRolls.get(0).toString()); 
			dexterity = (diceRolls.get(1).toString()); 
			constitution = (diceRolls.get(2).toString());
			intelligence = (diceRolls.get(3).toString()); 
			wisdom = (diceRolls.get(4).toString()); 
			charisma = (diceRolls.get(5).toString()); 
			
			strResult.setText(strength);
			dexResult.setText(dexterity);
			conResult.setText(constitution);
			intResult.setText(intelligence);
			wisResult.setText(wisdom);
			chaResult.setText(charisma);
			
			
			rollLabel.setText("Roll results are: "+Arrays.asList(diceRolls));
			}
		}


	//Diceroll method for rolling 4d6, drop the lowest, sum the rest, result must be no lower than 8
	public Integer diceRoll() {
		Integer result = 0;
		Random random = new Random();
		int[] rolls = {0,1,2,3};
		while (result<8) {
		for (int i=0; i<4; i++) {
		int roll = random.nextInt(6)+1;
		rolls[i] = roll;
		}
		Arrays.sort(rolls);
		Integer drop = rolls[0];
		result = (Arrays.stream(rolls).sum() - drop);
		}
		return result;
		}
	}
	

