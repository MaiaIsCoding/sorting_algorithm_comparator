package readCSV;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import test.TestFrame;
public class TableArray {
private static float [] myArray;
private static String [] stringArray;
private static Date [] dateArray;
	public static void tabArray() {
		JTable arrayO = CSVReader.getTable_1();
		int rowc = 0;
		while(rowc < arrayO.getRowCount()) {
			if(arrayO.getValueAt(rowc, TestFrame.getColNum()).toString().equals("nan")){
				myArray [rowc] = 0;
				rowc++;
			} else {
				myArray [rowc] = Float.parseFloat(arrayO.getValueAt(rowc, TestFrame.getColNum()).toString());
				rowc++;}}
		setArray(myArray);}
	public static void tableArrayString() {
			
			JTable arrayobj = CSVReader.getTable_1();
			stringArray = new String [arrayobj.getRowCount()];
			int rowc = 0;
			while(rowc < arrayobj.getRowCount()) {
					stringArray [rowc] = arrayobj.getValueAt(rowc, TestFrame.getColNum()).toString();
					rowc++;}
			setStringArray(stringArray);}
	public static void tableArrayDate() {
			try{
			JTable arrayobj = CSVReader.getTable_1();
			dateArray = new Date [arrayobj.getRowCount()];
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			int rowc = 0;
			while(rowc < arrayobj.getRowCount()) {
					dateArray [rowc] = format.parse(arrayobj.getValueAt(rowc, TestFrame.getColNum()).toString());
					rowc++;}
			setDateArray(dateArray);
			}catch(Exception e){System.out.println(e);}}
	
	public static float [] getArray(){
		return myArray;}
	
	public static void setArray(float [] myArray) {
		TableArray.myArray = myArray;}
	
	public static String [] getStringArray() {
		return stringArray;}
	
	public static void setStringArray(String [] stringArray) {
		TableArray.stringArray = stringArray;}
	
	public static Date [] getDateArray() {
		return dateArray;}
	
	public static void setDateArray(Date [] dateArray) {
		TableArray.dateArray = dateArray;}}
