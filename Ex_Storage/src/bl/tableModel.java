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
    
    public void add(Article a){
        articles.add(a);
        fireTableDataChanged();
    }
    
    public void delete(int row){
        articles.remove(row);
        fireTableDataChanged();
    }
    
    public void buyArticles(int row,int amount) throws Exception{
        articles.get(row).buyAmount(amount);
        fireTableDataChanged();
    }
    
    public void sellArticles(int row,int amount) throws Exception{
        articles.get(row).sellAmount(amount);
        fireTableDataChanged();
    }
    
    
    
}
