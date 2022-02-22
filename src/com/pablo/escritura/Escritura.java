package com.pablo.escritura;

import com.pablo.lectura.Lectura;
import exemplofichero.Xogador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Escritura {
    
    FileWriter fich;
    PrintWriter escribir;
    BufferedWriter bf;
    Xogador xo;
    
    public void escribirNumeros(String nomeFicheiro){
        try {
            fich = new FileWriter(nomeFicheiro, false); //True para engadir, false ou nada para escribir
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            
            System.out.println("Ficheiro creado cone xito");
            
        } catch (IOException ex) {
            System.out.println("erro escritura 1"+ ex.getMessage());
            
        }
        finally{
            escribir.close();
        }
    }
    
    public void engadirNumeros(String nomeFicheiro){
        try {
            fich = new FileWriter(nomeFicheiro, true); //True para engadir, false ou nada para escribir
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            
            System.out.println("Ficheiro editado con exito");
            
        } catch (IOException ex) {
            System.out.println("erro escritura 2"+ ex.getMessage());
            
        }
        finally{
            escribir.close();
        }
    }
    
    public void escribirBuffer(String nomeFich){
        try {
            fich = new FileWriter(nomeFich);
            bf = new BufferedWriter(fich);
            bf.write("aaaaa\n");
            bf.write("bbbbb\n");
            bf.write("ccccc\n");
            bf.write("ddddd\n");
            bf.close();
            
            System.out.println("Archivo creado");
            
        } catch (IOException ex) {
            System.out.println("escritura erro 3: " + ex.getMessage());
        }
        
        finally{
            try{
                fich.close();
            }
            catch(IOException ex){
                System.out.println("Non se pode pechar o arquivo");
            }
        }
    }
    
    public void escribirObxetos(String nomeFich){
        try {
            fich = new FileWriter(nomeFich, false);
            escribir = new PrintWriter(fich);
            xo = new Xogador("Messi", 10);
            escribir.println(xo);
            escribir.println(new Xogador("aaaaa", 22222));
            xo = new Xogador("A", 20);
            escribir.println(xo.getNome()+"," + xo.getDorsal());
            System.out.println("Creado o ficheiro");
            
            
        } catch (IOException ex) {
            System.out.println("****");
        }
        finally{
            escribir.close();
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println("Erro 4");
            }
        }
        
    }
    
    public void crearFichNomesXogadires(){
        try {
            
            Lectura l = new Lectura();
            ArrayList<Xogador> lista = l.lerObxectosMeterArray(new File("xogadores.txt"), "\\s , \\s");
            fich = new FileWriter("nomesX.txt");
        }
            
        catch (IOException ex) {
            System.out.println("error 5");
        }
        
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println("Non se pode fechar o ficheiro");
            }
        }

    }
}
