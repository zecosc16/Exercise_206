/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author oskar
 */
public class tableModel extends AbstractTableModel{
    
    private ArrayList<Article> articles = new ArrayList<>();
    private String[] colNames = {"ID","Description","Amount","Place"};
    

    @Override
    public int getRowCount() {
        return articles.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return articles.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    
    
}
