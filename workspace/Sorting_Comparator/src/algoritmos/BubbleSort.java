package algoritmos;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import readCSV.CSVReader;
import readCSV.TableArray;
public class BubbleSort {
	public static void bubbleSort() {
		DefaultTableModel modelBS = CSVReader.getModel();
		float[] arrayAAA = TableArray.getArray();
		int rowFuck = arrayAAA.length;
		float tempVal = 0;  
	    for(int x = 0; x < rowFuck; x++) {  
	    	for(int i = 1; i < (rowFuck - x); i++) {  
	    		if(arrayAAA[i - 1] > arrayAAA[i]) {
	    			tempVal = arrayAAA[i - 1];  
	    			arrayAAA[i - 1] = arrayAAA[i];  
	    			arrayAAA[i] = tempVal; 
	    			modelBS.moveRow(i, i, i - 1);}}}}
	public static void BS_String() {
		DefaultTableModel modelBS = CSVReader.getModel();
		String [] arrayObj = TableArray.getStringArray();
		int rowbs2 = arrayObj.length;  
	    String tempVal = null;  
	    for(int x = 0; x < rowbs2; x++) {  
	    	for(int i = 1; i < (rowbs2 - x); i++) {  
	    		if(arrayObj[i - 1].compareTo(arrayObj[i]) > 0) {
	    			tempVal = arrayObj[i - 1];  
	    			arrayObj[i - 1] = arrayObj[i];  
	    			arrayObj[i] = tempVal; 
	    			modelBS.moveRow(i, i, i - 1);}}}}
	public static void BS_Date() {
		DefaultTableModel modelBS = CSVReader.getModel();
		Date [] arrayObj = TableArray.getDateArray();
		int rowC = arrayObj.length;  
	    Date tempVal;  
	    for(int x = 0; x < rowC; x++) {  
	    	for(int i = 1; i < (rowC - x); i++) {  
	    		if(arrayObj[i - 1].compareTo(arrayObj[i]) > 0) {
	    			tempVal = arrayObj[i - 1];  
	    			arrayObj[i - 1] = arrayObj[i];  
	    			arrayObj[i] = tempVal; 
	    			modelBS.moveRow(i, i, i - 1);}}}}}