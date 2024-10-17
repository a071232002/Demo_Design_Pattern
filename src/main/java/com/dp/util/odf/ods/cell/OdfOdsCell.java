package com.dp.util.odf.ods.cell;

import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

//for ODFtoolkit 0.9.0 & Java8
public interface OdfOdsCell {

	public void write(Table table);

	public void setStyle(Cell cell);

}
