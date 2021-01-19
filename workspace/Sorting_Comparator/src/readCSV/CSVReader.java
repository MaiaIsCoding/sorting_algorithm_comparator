package readCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import test.TestFrame;
public class CSVReader {
	private static JTable table_1;
	private static JTable setUpMyCSVArray() {
		try {
			table_1 = new JTable();
			table_1.setBounds(42, 35, 344, 197);
			String xfileLocation = TestFrame.getFilename();
			BufferedReader br = new BufferedReader(new FileReader(xfileLocation));
			DefaultTableModel model = getModel();
			String [] columnNames = {"0.Data/Hora", "1.Satelite", "2.País", "3.Estado", "4.Municipio", "5.Bioma", "6.Dias s/chuva", "7.Precipitação", "8.Risco fogo", "9.Latitude", "10.Longitude", "11.FRP (Poder Radioativo do Fogo)"};
			model.setColumnIdentifiers(columnNames);
			Object [] tableLines = br.lines().toArray();
				for (int y = 1; y < tableLines.length; y++) {
					String line = tableLines[y].toString().trim();
					String [] dataRow = line.split(",");
					model.addRow(dataRow);
				}
			br.close();
			}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();}
		return table_1;}
	public static DefaultTableModel getModel() {
		DefaultTableModel model = (DefaultTableModel) getTable_1().getModel();
		return model;}
	
	public static JTable getCSVArray() {
		return setUpMyCSVArray();}
	
	public static JTable getTable_1() {
		return table_1;}}