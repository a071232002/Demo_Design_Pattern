package com.dp.util.odf.ods.cell;

import java.util.Locale;

import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

import com.dp.util.odf.ods.OdfOdsCellStyle;

//for ODFtoolkit 0.9.0 & Java8
public class OdfOdsTittleCell implements OdfOdsCell {
	private int col;
	private int row;
	private String tittleName;
	private Integer width;
	private OdfOdsCellStyle odsStyle;

	public OdfOdsTittleCell(int col, int row, String tittleName, Integer width, OdfOdsCellStyle odsStyle) {
		this.col = col;
		this.row = row;
		this.tittleName = tittleName;
		this.width = width;
		this.odsStyle = odsStyle;
	}
	
	// 不須設定欄寬
	public OdfOdsTittleCell(int col, int row, String tittleName, OdfOdsCellStyle odsStyle) {
		this.col = col;
		this.row = row;
		this.tittleName = tittleName;
		this.width = null;
		this.odsStyle = odsStyle;
	}

	@Override
	public void write(Table table) {
		Cell cell = table.getCellByPosition(col, row);
		cell.setStringValue(tittleName);
		if (width != null) {
			cell.getTableColumn().setWidth(width);
		}
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

	public String getTittleName() {
		return tittleName;
	}

	public void setTittleName(String tittleName) {
		this.tittleName = tittleName;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public OdfOdsCellStyle getOdsStyle() {
		return odsStyle;
	}

	public void setOdsStyle(OdfOdsCellStyle odsStyle) {
		this.odsStyle = odsStyle;
	}

}
