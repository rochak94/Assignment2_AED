/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rocha
 */
public class PersonDirectory {
    
    private List<Person> list;
    
    public PersonDirectory(){
    list= new ArrayList<>();
    }
    
    public List<Person> getList(){
        return this.list;
    }
    
    public void add(Patient p){
    this.list.add(p);
    }
}
