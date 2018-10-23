/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author oskar
 */
public class Article {
    private int id;
    private String description;
    private int amount=0,place,maxAmount=75;

    public Article(int id, String description, int place) {
        this.id = id;
        this.description = description;
       
        this.place = place;
    }
    
    public void buyAmount(int i) throws Exception{
        if(amount+i>=maxAmount){
            amount=75;
            throw new Exception("the maximum amount is reached");
        }
        amount+=i;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public int getPlace() {
        return place;
    }
    
    public void sellAmount(int i) throws Exception{
        if(amount-i<0){
            amount=0;
            throw new Exception("you cannot sell more than you have");
        }
        amount-=i;
    }
            
}
