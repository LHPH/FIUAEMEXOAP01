package organizacion;

/*Clase Que Crea El Archivo log hecha por Luis Humberto Ponce Hermosillo*/
import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.*;

public class Bitacora {
    private String dia,mes,año,hor,min,seg;
    private BufferedWriter acc;
    private PrintWriter esc;
   //static String Path = "C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos\\Bitacora.log";
   String Path="Archivos\\Bitacora.log";
    
    public void abrarc(){ //Metodo que Abrira o Creara El Archivo.log
        try{
            acc = new BufferedWriter(new FileWriter(Path,true));
            esc = new PrintWriter(acc);
        }catch(IOException e) {
        }   
    }
    
    public void cerr(){  //Metodo Que Cerrara El Archivo.log
        esc.print(";");
        esc.println("");
        esc.close();
    }
    
    public void Hora(){  //Metodo que escribira la Fecha: Hora,Dia,Mes,Año
       // Calendar fec = Calendar.getInstance();
        Calendar fec = new GregorianCalendar();
        hor=Integer.toString(fec.get(Calendar.HOUR));
        min=Integer.toString(fec.get(Calendar.MINUTE));
        seg=Integer.toString(fec.get(Calendar.SECOND));
        dia=Integer.toString(fec.get(Calendar.DATE));
        mes=Integer.toString(fec.get(Calendar.MONTH));
        año=Integer.toString(fec.get(Calendar.YEAR));
        esc.print(hor+":");
        esc.print(min+":");
        esc.print(seg);
        esc.print(" ");
        esc.print(dia+"/");
        esc.print(mes+"/");
        esc.print(año);
        esc.print(" ");
            
    }
    
    public void usuario(String usu) { //Metodo Que Escribira En El Archivo El Nombre De Usuario
        esc.print("Usuario: ");
        esc.print(usu);
        esc.print(" ");
    }
    
    public void eventos(String eve){ 
    // Metodo que Escribira En El Archivo Los Eventos
        esc.print(" ");
        esc.print(eve);
        esc.print(" ");
    }
    
    public boolean conexion(boolean disp){ //Metodo Que Escribira El Estado De Conexion Del Usuario
        if(disp==true){
            esc.print("Conectado");
            esc.print(" ");
            return true;
        }
        else{
            esc.print(" Desconectado");
            esc.print(" ");
            return false;
        }
    }
}
