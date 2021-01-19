package algoritmos;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import readCSV.CSVReader;
import readCSV.TableArray;
public class GnomeSort {	
	public static void gnomeSort() {
		DefaultTableModel modelGS = CSVReader.getModel();
		float[] arrayObj = TableArray.getArray();
		try {
			int rowC = arrayObj.length;
			int i = 1;
			while(i < rowC) {
				if(arrayObj[i - 1] <= arrayObj[i]) {
					++i;}
				else {
					float tempVal = arrayObj[i];
					arrayObj[i] = arrayObj[i - 1];
					arrayObj[i - 1] = tempVal;
					modelGS.moveRow(i, i, i - 1);
					--i;
					if (i == 0) {
						i = 1;}};}
		}catch(Exception e ) {e.printStackTrace();}}
	public static void GS_String() {
		DefaultTableModel modelGS = CSVReader.getModel();
		String [] arrayObj = TableArray.getStringArray();
		try {
			int rowC = arrayObj.length;
			int i = 1;
			while(i < rowC) {
				if(arrayObj[i - 1].compareTo(arrayObj[i]) <= 0) {
					++i;}
				else {
					String tempVal = arrayObj[i];
					arrayObj[i] = arrayObj[i - 1];
					arrayObj[i - 1] = tempVal;
					modelGS.moveRow(i, i, i - 1);
					--i;
					if (i == 0) {i = 1;}};}
		}catch(Exception e ) {e.printStackTrace();}}
		public static void GS_Date() {
			DefaultTableModel modelGS = CSVReader.getModel();
			Date [] arrayObj = TableArray.getDateArray();
			try {
				int rowC = arrayObj.length;
				int i = 1;
				while(i < rowC) {
					if(arrayObj[i - 1].compareTo(arrayObj[i]) <= 0) {
						++i;}
					else {
						Date tempVal = arrayObj[i];
						arrayObj[i] = arrayObj[i - 1];
						arrayObj[i - 1] = tempVal;
						modelGS.moveRow(i, i, i - 1);
						--i;
						if (i == 0) {
							i = 1;}};}
			}catch(Exception e ) {e.printStackTrace();}}}