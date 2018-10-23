package TableModel;


import Article.Article;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class StorageTableModel extends AbstractTableModel{

    private LinkedList<Article> articles = new LinkedList<>();
    private String[] colNames = {"ID", "Description", "Amount", "Place"};
    
    public void addArticle(Article a)
    {
        articles.add(a);
        Collections.sort(articles);
        fireTableDataChanged();
    }
    
    public void deleteArticle(int i)
    {
        articles.remove(i);
        fireTableDataChanged();
    }
    
    public void editArticle()
    {
        
    }
    
    @Override
    public int getRowCount() {
        return articles.size();
    }
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Article a = articles.get(row);
        return a;
    }
    
}
