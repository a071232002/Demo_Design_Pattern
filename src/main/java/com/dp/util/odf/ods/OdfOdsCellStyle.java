package com.dp.util.odf.ods;

import org.odftoolkit.odfdom.type.Color;
import org.odftoolkit.simple.style.Border;
import org.odftoolkit.simple.style.Font;
import org.odftoolkit.simple.style.StyleTypeDefinitions.CellBordersType;
import org.odftoolkit.simple.style.StyleTypeDefinitions.HorizontalAlignmentType;
import org.odftoolkit.simple.style.StyleTypeDefinitions.SupportedLinearMeasure;
import org.odftoolkit.simple.style.StyleTypeDefinitions.VerticalAlignmentType;

// for ODFtoolkit 0.9.0 & Java8
public class OdfOdsCellStyle {
	
	private Font font;
	private Color backgroundColor;
	private HorizontalAlignmentType horizontalAlignmentType;
	private VerticalAlignmentType verticalAlignmentType;
	private Border border;
	private CellBordersType cellBordersType;
	private Boolean textWrapped;
	
	public OdfOdsCellStyle(Font font, HorizontalAlignmentType horizontalAlignmentType) {
		this.font = font;
		this.backgroundColor = Color.WHITE;
		this.horizontalAlignmentType = horizontalAlignmentType;
		this.border = new Border(Color.BLACK, 1.0, SupportedLinearMeasure.PT);
		this.cellBordersType = CellBordersType.ALL_FOUR;
		this.textWrapped = true;
	}
	
	public OdfOdsCellStyle(Font font, Color backgroundColor, HorizontalAlignmentType horizontalAlignmentType,
			VerticalAlignmentType verticalAlignmentType, Border border, CellBordersType cellBordersType,
			Boolean textWrapped) {
		this.font = font;
		this.backgroundColor = backgroundColor;
		this.horizontalAlignmentType = horizontalAlignmentType;
		this.verticalAlignmentType = verticalAlignmentType;
		this.border = border;
		this.cellBordersType = cellBordersType;
		this.textWrapped = textWrapped;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	public Color getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public HorizontalAlignmentType getHorizontalAlignmentType() {
		return horizontalAlignmentType;
	}
	public void setHorizontalAlignmentType(HorizontalAlignmentType horizontalAlignmentType) {
		this.horizontalAlignmentType = horizontalAlignmentType;
	}
	public VerticalAlignmentType getVerticalAlignmentType() {
		return verticalAlignmentType;
	}
	public void setVerticalAlignmentType(VerticalAlignmentType verticalAlignmentType) {
		this.verticalAlignmentType = verticalAlignmentType;
	}
	public Border getBorder() {
		return border;
	}
	public void setBorder(Border border) {
		this.border = border;
	}
	public CellBordersType getCellBordersType() {
		return cellBordersType;
	}
	public void setCellBordersType(CellBordersType cellBordersType) {
		this.cellBordersType = cellBordersType;
	}
	public Boolean getTextWrapped() {
		return textWrapped;
	}
	public void setTextWrapped(Boolean textWrapped) {
		this.textWrapped = textWrapped;
	}
	
}
