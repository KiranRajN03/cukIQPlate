package com.plateIQ.utility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {


	static String WorkBookName = "WorkBookName";
	static Workbook workbook;
	Sheet sheet, tcSheet;
	static Sheet testDataSheet;
	Sheet testStepSheet;
	Cell cell;
	private static int j;
	int tot_Rows;
	int tot_Cols;
	static int tot_testData_rows;
	static int tot_test_steps_cols;
	String testID;
	/* Creating testdata and testDataColumns HashMap */
	static Map<String,Integer> testDataColumns = new HashMap<String,Integer>();
	static Map<String, String> testData = new HashMap<String, String>();
	//private static String sheetname = "TestSheet";
	private static final String FILE_PATH = "C:\\Project_Intelligrated\\Sprints\\17.4.4\\Framework\\JBehave\\src\\test\\resources\\resource\\dataModel.xls";


    /***
     * This method is used to get List From Excel
     * @param sheetName,testID
     * @return Map
     */
	
	public static Map<String, String> getListFromExcel(String sheetName, String testID) {

		try {
			Workbook workbook = Workbook.getWorkbook(new File(FILE_PATH));
			int k;

			for (k = 1; k <= workbook.getSheet(sheetName).getColumns(); k++) {
				testDataColumns.put(workbook.getSheet(sheetName).getCell(k - 1, 0).getContents(), k - 1);
			}

			testDataSheet = workbook.getSheet(sheetName);
			tot_testData_rows = testDataSheet.getRows();

			tot_test_steps_cols = testDataSheet.getColumns();

			int rowNum = 1;

			for (j = rowNum; j < tot_testData_rows; j++) {

				if (testID.equalsIgnoreCase(
						testDataSheet.getCell((int) testDataColumns.get("Test_Id"), j).getContents())) {

					testData.put("rowNum", Integer.toString(j));

					/* ///////// USER DEFINED FIELDS ////////////// */
					testData.put(testDataSheet.getCell((int) testDataColumns.get("Response"), 0).getContents(),
							testDataSheet.getCell((int) testDataColumns.get("Response"), j).getContents());
				}
			}
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
			workbook.close();
		}
		return testData;

	}
}
