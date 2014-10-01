/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadora_genetica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author slenderman
 */
public class Lavadora {
    
   private int programaLavado;
   private int pesoCarga;
   private int pesoPermitido;
   private int nivelAgua;
   private int nivelDetergente;
   private int tempAgua;

    public Lavadora() {
        
    }
    
    public Lavadora(int programaLavado, int pesoCarga, int pesoPermitido, int nivelAgua, int nivelDetergente, int tempAgua) {
        this.programaLavado = programaLavado;
        this.pesoCarga = pesoCarga;
        this.pesoPermitido = pesoPermitido;
        this.nivelAgua = nivelAgua;
        this.nivelDetergente = nivelDetergente;
        this.tempAgua = tempAgua;
    }
   
   

    public int getProgramaLavado() {
        return programaLavado;
    }

    public void setProgramaLavado(int programaLavado) {
        this.programaLavado = programaLavado;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getPesoPermitido() {
        return pesoPermitido;
    }

    public void setPesoPermitido(int pesoPermitido) {
        this.pesoPermitido = pesoPermitido;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getNivelDetergente() {
        return nivelDetergente;
    }

    public void setNivelDetergente(int nivelDetergente) {
        this.nivelDetergente = nivelDetergente;
    }

    public int getTempAgua() {
        return tempAgua;
    }

    public void setTempAgua(int tempAgua) {
        this.tempAgua = tempAgua;
    }
   
   public List<String> cruzamiento(String lavadora,int dado){
       List<String> listLavadora=new ArrayList();
       String hab1 = "";
       String hab2 = "";
       for (int i = 0; i < lavadora.length(); i++) {
           if(i>dado){
               
           }else{
               hab1=hab1+hab1.charAt(i);
               hab2=hab2+hab2.charAt(i);
           }
       }
       
       for (int i = 0; i < hab1.length(); i++) {
           if (hab1.indexOf(hab2.charAt(i))<0) {
               hab1=hab1+hab2.charAt(i);
           }
           if(hab2.indexOf(hab1.charAt(i))<0){
               hab2=hab2+hab1.charAt(i);
           }
       }
       
   }
   
    
    
}
