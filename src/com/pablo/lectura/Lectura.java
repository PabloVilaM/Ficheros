package com.pablo.lectura;

import exemplofichero.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class Lectura {
    Scanner sc;
    public void leerLiña(File fichero){
        String nom;
        try {
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                nom = sc.nextLine();
                System.out.println(nom);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 " + ex.toString());
        }
        finally{
            sc.close();
        }
    }
    
    public void lerNome(File fichero){
        
        try {
            sc = new Scanner(fichero);
            while (sc.hasNext()){
                System.out.println(sc.next()); //next lee ata un espacio en blanco o \n
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 " + ex.toString());
        }
        finally{
            sc.close();
        }
    }
    
    public void lerConDelimitadores(File fich, String delimitador){
        try {
            sc = new Scanner(fich).useDelimiter(delimitador); //useDelimiter("\\s*"+delimitador+"\\s*")
            while (sc.hasNext()){
                System.out.println(sc.next()); 
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3 " + ex.toString());
        }
        finally{
            sc.close();
        }
    }
    
    public void amosarPares(File fich){
        String cadea;

        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
               cadea = sc.nextLine();
               String [] lista= cadea.split(",");
               for(int i = 0; i<lista.length;i++){
                   if (Integer.parseInt(lista[i])%2==0){
                                         System.out.println(lista[i]);
                   }
                   
               }
               
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 4" + ex.toString());
        }
        finally{
            sc.close();
        }
    }
    
    public void lerObxectos(File fich){
       
        try{
            String cadea;
            sc = new Scanner(fich);
            while (sc.hasNextLine()){
                cadea = sc.nextLine();
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Erro 5" + ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public ArrayList<Xogador> lerObxectosMeterArray(File fich,String delimitador){
       ArrayList<Xogador>lista = new ArrayList();
       Xogador xo;
        try{
            String cadea;
            sc = new Scanner(fich);
            while (sc.hasNextLine()){
                cadea = sc.nextLine();
                String[] linea = cadea.split(delimitador);
                xo = new Xogador(linea[0], Integer.parseInt(linea[1]));
                lista.add(xo);
            }
            for(Xogador x: lista){
                System.out.println(x);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Erro 5" + ex.getMessage());
        }
        finally{
            
            sc.close();
        }
        return lista;
    }
}
