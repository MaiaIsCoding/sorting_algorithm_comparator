package algoritmos;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import readCSV.CSVReader;
import readCSV.TableArray;
public class CocktailSort {
	public static void cocktailSort() {
		DefaultTableModel modelCS = CSVReader.getModel();
		float[] arrayObj = TableArray.getArray();
	    int rowC, start, end, swap;
	    float tempVal;
	    rowC = arrayObj.length;
	    start = 0;
	    end = rowC - 1;
	    swap = 0;
	    while (swap == 0 && start < end) {
	        swap = 1;
	        for (int i = start; i < end; i++) {
	            if (arrayObj[i] > arrayObj[i + 1]) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i + 1];
	                arrayObj[i + 1] = tempVal;
	                modelCS.moveRow(i, i, i + 1);
	                swap = 0;}}
	        end--;
	        for (int i = end; i > start; i--) {
	            if (arrayObj[i] < arrayObj[i - 1]) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i - 1];
	                arrayObj[i - 1] = tempVal;
	                modelCS.moveRow(i, i, i - 1);
	                swap = 0;}}
	        start++;}}
	
	public static void CS_String() {
		DefaultTableModel modelCS = CSVReader.getModel();
		String [] arrayObj = TableArray.getStringArray();
	    int rowC, start, end, swap;
	    String tempVal;
	    rowC = arrayObj.length;
	    start = 0;
	    end = rowC - 1;
	    swap = 0;
	    while (swap == 0 && start < end) {
	        swap = 1;
	        for (int i = start; i < end; i++) {
	            if (arrayObj[i].compareTo(arrayObj[i + 1]) > 0) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i + 1];
	                arrayObj[i + 1] = tempVal;
	                modelCS.moveRow(i, i, i + 1);
	                swap = 0;}}
	        end--;
	        for (int i = end; i > start; i--) {
	            if (arrayObj[i].compareTo(arrayObj[i - 1]) < 0) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i - 1];
	                arrayObj[i - 1] = tempVal;
	                modelCS.moveRow(i, i, i - 1);
	                swap = 0;}}
	        start++; }}
	public static void CS_Date() {
		DefaultTableModel modelCS = CSVReader.getModel();
		Date [] arrayObj = TableArray.getDateArray();
	    int rowC, start, end, swap;
	    Date tempVal;
	    rowC = arrayObj.length;
	    start = 0;
	    end = rowC - 1;
	    swap = 0;
	    while (swap == 0 && start < end) {
	        swap = 1;
	        for (int i = start; i < end; i++) {
	            if (arrayObj[i].compareTo(arrayObj[i + 1]) > 0) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i + 1];
	                arrayObj[i + 1] = tempVal;
	                modelCS.moveRow(i, i, i + 1);
	                swap = 0;}} end--;
	        for (int i = end; i > start; i--) {
	            if (arrayObj[i].compareTo(arrayObj[i - 1]) < 0) {
	                tempVal = arrayObj[i];
	                arrayObj[i] = arrayObj[i - 1];
	                arrayObj[i - 1] = tempVal;
	                modelCS.moveRow(i, i, i - 1);
	                swap = 0;}} start++; }}}
