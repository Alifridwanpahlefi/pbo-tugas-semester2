/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

/**
 *
 * @author Lif Rdwn
 */
public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }    
        
        @Override
    public void Suara(){
        System.out.println(nama+"bersuara : Guk Guk !!!");
    }
    
}
