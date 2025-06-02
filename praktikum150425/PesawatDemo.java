/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

/**
 *
 * @author Lif Rdwn
 */
public class PesawatDemo {
    
    public static void main(String[] args){
        // TODO code application logic here
        Pesawat p = new Pesawat("Boeing",2010,true,120);
        p.cetak();
        
        System.out.println("Setelah reset");
        p.reset("Airbus",2020,false,200);
        p.cetak();
                
    }
}
