package com.dp.util.odf.ods.cell;

import java.util.Locale;

import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

import com.dp.util.odf.ods.OdfOdsCellStyle;

//for ODFtoolkit 0.9.0 & Java8
public class OdfOdsMergeCell implements OdfOdsCell {

	private int startCol;
	private int startRow;
	private int endCol;
	private int endRow;
	private String cont;
	private OdfOdsCellStyle odsStyle;

	public OdfOdsMergeCell(int startCol, int startRow, int endCol, int endRow, String cont, OdfOdsCellStyle odsStyle) {
		this.startCol = startCol;
		this.startRow = startRow;
		this.endCol = endCol;
		this.endRow = endRow;
		this.cont = cont;
		this.odsStyle = odsStyle;
	}
	
	@Override
	public void write(Table table) {
		table.getCellRangeByPosition(startCol, startRow, endCol, endRow).merge();
		Cell cell = table.getCellByPosition(startCol, startRow);
		cell.setStringValue(cont);
		setStyle(cell);
	}
	
	@Override
	public void setStyle(Cell cell) {
		cell.getStyleHandler().setBackgroundColor(odsStyle.getBackgroundColor());
		cell.getStyleHandler().setFont(odsStyle.getFont(), Locale.getDefault());
		cell.getStyleHandler().setFont(odsStyle.getFont());
		
		cell.getStyleHandler().setHorizontalAlignment(odsStyle.getHorizontalAlignmentType());
		if (odsStyle.getVerticalAlignmentType() != null) {
			cell.getStyleHandler().setVerticalAlignment(odsStyle.getVerticalAlignmentType());
		}

		cell.getStyleHandler().setBorders(odsStyle.getBorder(), odsStyle.getCellBordersType());
		cell.getStyleHandler().setTextWrapped(odsStyle.getTextWrapped());
	}

	public int getStartCol() {
		return startCol;
	}

	public void setStartCol(int startCol) {
		this.startCol = startCol;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndCol() {
		return endCol;
	}

	public void setEndCol(int endCol) {
		this.endCol = endCol;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public OdfOdsCellStyle getOdsStyle() {
		return odsStyle;
	}

	public void setOdsStyle(OdfOdsCellStyle odsStyle) {
		this.odsStyle = odsStyle;
	}

}
