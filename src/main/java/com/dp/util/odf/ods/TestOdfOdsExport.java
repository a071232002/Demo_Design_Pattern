package com.dp.util.odf.ods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.odftoolkit.odfdom.type.Color;
import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.style.Font;
import org.odftoolkit.simple.style.StyleTypeDefinitions.FontStyle;
import org.odftoolkit.simple.style.StyleTypeDefinitions.HorizontalAlignmentType;
import org.odftoolkit.simple.table.Table;

import com.dp.util.DateTimeFormatterUtil;
import com.dp.util.DateTimeFormatterUtil.FormatterPattern;
import com.dp.util.odf.ods.cell.OdfOdsCell;
import com.dp.util.odf.ods.cell.OdfOdsDataCell;
import com.dp.util.odf.ods.cell.OdfOdsMergeCell;
import com.dp.util.odf.ods.cell.OdfOdsTittleCell;

public class TestOdfOdsExport {

	private static OdfOdsCellStyle centerFormat, rightFormat;

	public static void main(String[] args) {

		List<OdsTestDTO> resultList = new ArrayList<OdsTestDTO>();

		resultList.add(new OdsTestDTO("20240822", "MT956", 1, 2, 3, 6));
		resultList.add(new OdsTestDTO("20240822", "MT888", 3, 1, 2, 6));
		resultList.add(new OdsTestDTO("20240823", "MT956", 10, 15, 0, 25));
		resultList.add(new OdsTestDTO("20240824", "MT956", 3, 17, 1, 21));
		resultList.add(new OdsTestDTO("20240824", "MT888", 2, 11, 1, 14));
		resultList.add(new OdsTestDTO("20240824", "MT975", 5, 30, 1, 36));
		resultList.add(new OdsTestDTO("20240824", "MT777", 0, 0, 1, 1));
		resultList.add(new OdsTestDTO("20240825", "MT777", 11, 10, 11, 32));

		Font font = new Font("Times New Roman", FontStyle.REGULAR, 12.0d, Color.BLACK);
		centerFormat = new OdfOdsCellStyle(font, HorizontalAlignmentType.CENTER);
		rightFormat = new OdfOdsCellStyle(font, HorizontalAlignmentType.RIGHT);

		try {
			SpreadsheetDocument ods = SpreadsheetDocument.newSpreadsheetDocument();
			
			if (ods != null) {
				Table table = ods.getSheetByName("Sheet1");
				List<OdfOdsCell> cells = new ArrayList<OdfOdsCell>();
				
				String exportDate = DateTimeFormatterUtil.format(LocalDateTime.now(), FormatterPattern.DATE_DASH);
				String exportDateTime = DateTimeFormatterUtil.format(LocalDateTime.now(), FormatterPattern.SECOND_DASH);
				
				int rowNum = 0;
				cells.add(new OdfOdsMergeCell(0, rowNum, 5, rowNum, "Test ODF.ods export", centerFormat));
				rowNum++;
				cells.add(new OdfOdsMergeCell(0, rowNum, 5, rowNum, "列印日期：" + exportDateTime, centerFormat));
				rowNum++;
				cells.add(new OdfOdsTittleCell(0, rowNum, "日期", 30, centerFormat));
				cells.add(new OdfOdsTittleCell(1, rowNum, "flightNo", 30, centerFormat));
				cells.add(new OdfOdsTittleCell(2, rowNum, "typeA", 15, centerFormat));
				cells.add(new OdfOdsTittleCell(3, rowNum, "typeB", 15, centerFormat));
				cells.add(new OdfOdsTittleCell(4, rowNum, "typeC", 15, centerFormat));
				cells.add(new OdfOdsTittleCell(5, rowNum, "總計", 15, centerFormat));

				int countA = 0;
				int countB = 0;
				int countC = 0;
				int sum = 0;
				String temp = "";

				for (int i = 0; i < resultList.size(); i++) {
					if (i == 0 || temp.equals(resultList.get(i).getDate())) {
						temp = resultList.get(i).getDate();

						rowNum++;
						inputData(cells, rowNum, resultList, i);

						countA += resultList.get(i).getTypeA();
						countB += resultList.get(i).getTypeB();
						countC += resultList.get(i).getTypeC();
						sum += resultList.get(i).getTotal();

					} else {
						temp = resultList.get(i).getDate();

						rowNum++;
						cells.add(new OdfOdsMergeCell(0, rowNum, 1, rowNum, "總計", centerFormat));
						cells.add(new OdfOdsDataCell(2, rowNum, countA, rightFormat));
						cells.add(new OdfOdsDataCell(3, rowNum, countB, rightFormat));
						cells.add(new OdfOdsDataCell(4, rowNum, countC, rightFormat));
						cells.add(new OdfOdsDataCell(5, rowNum, sum, rightFormat));

						countA = 0;
						countB = 0;
						countC = 0;
						sum = 0;

						rowNum++;
						inputData(cells, rowNum, resultList, i);

						countA += resultList.get(i).getTypeA();
						countB += resultList.get(i).getTypeB();
						countC += resultList.get(i).getTypeC();
						sum += resultList.get(i).getTotal();
					}
				}

				rowNum++;
				cells.add(new OdfOdsMergeCell(0, rowNum, 1, rowNum, "總計", centerFormat));
				cells.add(new OdfOdsDataCell(2, rowNum, countA, rightFormat));
				cells.add(new OdfOdsDataCell(3, rowNum, countB, rightFormat));
				cells.add(new OdfOdsDataCell(4, rowNum, countC, rightFormat));
				cells.add(new OdfOdsDataCell(5, rowNum, sum, rightFormat));

				for (OdfOdsCell c : cells) {
					c.write(table);
				}
				
			String directoryPath = "C:/testOds/";
		    String filePath = directoryPath + exportDate + "_outputFile.ods";
		    
		    File directory = new File(directoryPath);
		    
		    if (!directory.exists()) {
		        if (directory.mkdirs()) {
		            System.out.println("Directory created successfully.");
		        } else {
		            System.out.println("Failed to create directory.");
		            return;
		        }
		    }
			
			OutputStream out = new FileOutputStream(filePath);

			ods.save(out);
			ods.close();
			System.out.println(filePath + " export done.");
			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void inputData(List<OdfOdsCell> cells, int rowNum, List<OdsTestDTO> resultList, int index) {
		cells.add(new OdfOdsDataCell(0, rowNum, resultList.get(index).getDate(), centerFormat));
		cells.add(new OdfOdsDataCell(1, rowNum, resultList.get(index).getFlightNo(), centerFormat));
		cells.add(new OdfOdsDataCell(2, rowNum, resultList.get(index).getTypeA(), rightFormat));
		cells.add(new OdfOdsDataCell(3, rowNum, resultList.get(index).getTypeB(), rightFormat));
		cells.add(new OdfOdsDataCell(4, rowNum, resultList.get(index).getTypeC(), rightFormat));
		cells.add(new OdfOdsDataCell(5, rowNum, resultList.get(index).getTotal(), rightFormat));
	}
	
}
