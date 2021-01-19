package test;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import algoritmos.BubbleSort;
import algoritmos.CocktailSort;
import algoritmos.GnomeSort;
import readCSV.CSVReader;
import readCSV.TableArray;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class TestFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txtGS;
	private JTextField txtCS;
	private JTextField txtBS;
	private static String filename;
	private static int colNum;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new com.jtattoo.plaf.graphite.GraphiteLookAndFeel());
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}
	public void setColNum(int colNum) {
		TestFrame.colNum = colNum;}
	public static int getColNum() {
		return colNum;}
	public void setFilename(String filename) {
		TestFrame.filename = filename;}
	public static String getFilename() {
		return filename;}
	
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width, screenSize.height - 40);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 54, 1304, 528);
		contentPane.add(scrollPane);
		
		JButton btnCSV = new JButton("Display Table");
		btnCSV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			CSVReader.getCSVArray();
			scrollPane.setViewportView(CSVReader.getTable_1());
			if(getColNum() == 0)
				TableArray.tableArrayDate();
			if(getColNum() > 0 && getColNum() < 6)
				TableArray.tableArrayString();
			if(getColNum() >= 6)
				TableArray.tabArray();
			}
		});
		btnCSV.setBounds(25, 593, 706, 30);
		contentPane.add(btnCSV);
		
		JButton btnGnome = new JButton("Gnome Sort");
		btnGnome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				long startTime = System.nanoTime();
				if(getColNum() == 0)
					GnomeSort.GS_Date();
				if(getColNum() > 0 && getColNum() < 6)
					GnomeSort.GS_String();
				if(getColNum() >= 6)
					GnomeSort.gnomeSort();
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				JOptionPane.showMessageDialog(null, timeElapsed / 1000000 + " Milissegundos" );
				txtGS.setText(timeElapsed / 1000000 + " Milissegundos");
			}
		});
		btnGnome.setBounds(25, 634, 216, 30);
		contentPane.add(btnGnome);
		
		JButton btnCS = new JButton("Cocktail Sort");
		btnCS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				long startTime = System.nanoTime();
				if(getColNum() == 0)
					CocktailSort.CS_Date();
				if(getColNum() > 0 && getColNum() < 6)
					CocktailSort.CS_String();
				if(getColNum() >= 6)
					CocktailSort.cocktailSort();
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				JOptionPane.showMessageDialog(null, timeElapsed / 1000000 + " Milissegundos" );
				txtCS.setText(timeElapsed / 1000000 + " Milissegundos");
			}
		});
		btnCS.setBounds(272, 634, 216, 30);
		contentPane.add(btnCS);
		
		JButton btnBubble = new JButton("Bubble Sort");
		btnBubble.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				long startTime = System.nanoTime();
				if(getColNum() == 0)
					BubbleSort.BS_Date();
				if(getColNum() > 0 && getColNum() < 6)
					BubbleSort.BS_String();
				if(getColNum() >= 6)
					BubbleSort.bubbleSort();
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				JOptionPane.showMessageDialog(null, timeElapsed / 1000000 + " Milissegundos" );
				txtBS.setText(timeElapsed / 1000000 + " Milissegundos");
			}
		});
		btnBubble.setBounds(515, 634, 216, 30);
		contentPane.add(btnBubble);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = CSVReader.getModel();
				model.setRowCount(0);
				CSVReader.getTable_1().setModel(model);
				scrollPane.setViewportView(CSVReader.getTable_1());
			}
		});
		btnClear.setBounds(1113, 593, 216, 30);
		contentPane.add(btnClear);
		
		JButton btnLoad = new JButton("Load Table");
		btnLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.getSelectedFile();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				filename = f.getPath();
				setFilename(filename);
			}
		});
		btnLoad.setBounds(25, 11, 164, 30);
		contentPane.add(btnLoad);
		
		JButton btnSelectColumn = new JButton("Select Column");
		btnSelectColumn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero da coluna", ""));
				setColNum(colNum);
				if(getColNum() == 0)
					TableArray.tableArrayDate();
				if(getColNum() > 0 && getColNum() < 6)
					TableArray.tableArrayString();
				if(getColNum() >= 6);
					TableArray.tabArray();
			}
		});
		btnSelectColumn.setBounds(200, 11, 164, 30);
		contentPane.add(btnSelectColumn);
		txtGS = new JTextField();
		txtGS.setBounds(756, 593, 256, 20);
		contentPane.add(txtGS);
		txtGS.setColumns(10);
		txtCS = new JTextField();
		txtCS.setColumns(10);
		txtCS.setBounds(756, 624, 256, 20);
		contentPane.add(txtCS);
		txtBS = new JTextField();
		txtBS.setColumns(10);
		txtBS.setBounds(756, 655, 256, 20);
		contentPane.add(txtBS);
		JLabel lblNewLabel = new JLabel("Gnome Sort");
		lblNewLabel.setBounds(1022, 593, 81, 14);
		contentPane.add(lblNewLabel);
		JLabel lblCocktailSort = new JLabel("Cocktail Sort");
		lblCocktailSort.setBounds(1022, 624, 81, 14);
		contentPane.add(lblCocktailSort);
		JLabel lblBubbleSort = new JLabel("Bubble Sort");
		lblBubbleSort.setBounds(1022, 658, 81, 14);
		contentPane.add(lblBubbleSort);
	}
}