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
    private int amount,place;

    public Article(int id, String description, int amount, int place) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.place = place;
    }
}
