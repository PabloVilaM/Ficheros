package exemplofichero;
import com.pablo.escritura.Escritura;
import com.pablo.lectura.Lectura;
import java.io.File;
import java.util.ArrayList;

public class ExemploFichero {

    public static void main(String[] args) {
        
        /*Lectura lec = new Lectura();
        File fiche = new File("nomes.txt");   // Porque esta en el directorio raiz.
        lec.leerLiña(fiche);
        File f = new File("/home/dam1/Escritorio/numeros.txt");
        lec.leerLiña(f);       
        File f = new File("nomes.txt");
        lec.lerNome(f);
        File f = new File("nomes.txt");
        lec.lerConDelimitadores(f, " , ");
        File f = new File("/home/dam1/Escritorio/numeros.txt");
        lec.amosarPares(f);
        File f = new File("/home/dam1/Escritorio/xogadores.txt");
        lec.lerObxectosMeterArray(f, "\\s*,\\s*");*/
        Escritura esc = new Escritura();
        //esc.escribirNumeros("numEnteiros.txt");
        //esc.escribirObxetos("escribirXogadores.txt");
        Lectura lec = new Lectura();
        File f = new File("/home/dam1/Escritorio/xogadores.txt");
       ArrayList<Xogador> a = lec.lerObxectosMeterArray(f, ",");
       esc.escribirArray("nomeXogadores.txt", a);
      
       
        
    }
    
}
