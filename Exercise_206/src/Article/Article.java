package Article;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Article implements Comparable<Article>{
    private int ID;
    private String description;
    private int amount;
    private int place;

    public Article(int ID, String description, int amount, int place) {
        this.ID = ID;
        this.description = description;
        this.amount = amount;
        this.place = place;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public int compareTo(Article a) {
        if(this.ID < a.ID)
       {
           return -1;
       } else if(this.ID > a.ID)
       {
           return 1;
       } else{
           return this.getDescription().compareTo(a.getDescription());
       }
    }
    
    
}
