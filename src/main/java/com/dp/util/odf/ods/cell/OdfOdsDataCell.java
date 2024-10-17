package com.dp.util.odf.ods.cell;

import java.util.Locale;

import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

import com.dp.util.odf.ods.OdfOdsCellStyle;

//for ODFtoolkit 0.9.0 & Java8
public class OdfOdsDataCell implements OdfOdsCell {

	private int col;
	private int row;
	private String cont;
	private Integer number;
	private OdfOdsCellStyle odsStyle;

	public OdfOdsDataCell(int col, int row, String cont, OdfOdsCellStyle odsStyle) {
		this.col = col;
		this.row = row;
		this.cont = cont;
		this.odsStyle = odsStyle;
	}
	
	public OdfOdsDataCell(int col, int row, Integer number, OdfOdsCellStyle odsStyle) {
		this.col = col;
		this.row = row;
		this.number = number;
		this.odsStyle = odsStyle;
	}
	
	@Override
	public void write(Table table) {
		Cell cell = table.getCellByPosition(col, row);
		if (cont == null) {
			cell.setDoubleValue(number.doubleValue());			
		} else {
			cell.setStringValue(cont);			
		}
		setStyle(cell);
	}

	@Override
	public void setStyle(Cell cell) {
		cell.getStyleHandler().setBackgroundColor(odsStyle.getBackgroundColor());
		cell.getStyleHandler().setFont(odsStyle.getFont());
		cell.getStyleHandler().setFont(odsStyle.getFont(), Locale.getDefault());
		
		cell.getStyleHandler().setHorizontalAlignment(odsStyle.getHorizontalAlignmentType());
		if (odsStyle.getVerticalAlignmentType() != null) {
			cell.getStyleHandler().setVerticalAlignment(odsStyle.getVerticalAlignmentType());
		}

		cell.getStyleHandler().setBorders(odsStyle.getBorder(), odsStyle.getCellBordersType());
		cell.getStyleHandler().setTextWrapped(odsStyle.getTextWrapped());
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public OdfOdsCellStyle getOdsStyle() {
		return odsStyle;
	}

	public void setOdsStyle(OdfOdsCellStyle odsStyle) {
		this.odsStyle = odsStyle;
	}
	
}
