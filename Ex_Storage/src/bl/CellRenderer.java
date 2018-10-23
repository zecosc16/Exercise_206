/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author oskar
 */
public class CellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel l = new JLabel();
        Article a = (Article) value;
        l.setBackground(Color.white);
        switch(column){
            case 0:
                l.setText(""+a.getId());
                break;
            case 1:
                l.setText(""+a.getDescription());
                break;
            case 2:
                l.setText(""+a.getAmount());
                break;
            case 3:
            l.setText(""+a.getPlace());
                break;
        }
        l.setOpaque(true);
        if(isSelected)
            l.setBackground(Color.gray);
        if(a.getAmount()==0)
            l.setBackground(Color.red);
        
        return l;
    }
    
}
