package TableRenderer;

import Article.Article;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class StorageTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean hasRow, int row, int i) {
        Article a  =  (Article) o;
        JLabel label = new JLabel();
        label.setOpaque(true);
        
        switch(i)
        {
            case 0: label.setText(String.format("%d", a.getID())); break;
            case 1: label.setText(a.getDescription()); break;
            case 2: label.setText(String.format("%d", a.getAmount())); break;
            case 3: label.setText(String.format("%d", a.getPlace())); break;
        }
        return label;
    }
    
}
