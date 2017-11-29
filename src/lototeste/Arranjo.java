package lototeste;
import java.util.Collections;
import java.util.ArrayList;
/**
 * @author QI
 */
public class Arranjo {
    ArrayList<Integer> ar= new ArrayList<Integer>();    
    public void adicionar(int v) {
        ar.add(v);
    }
    public void listar() {
        for(int a:ar){
            System.out.print(" "+a);
        }
        System.out.println("");
    }
    public void ordenar() {
        Collections.sort(ar);
    }
    public boolean comparar(Arranjo ar1,Arranjo ar2) {
        if(ar1.ar.equals(ar2.ar)){
            return true;
        }else{
            return false;
        }
    }
    public boolean compararParte(Arranjo ar1,Arranjo ar2) {
        if(ar1.ar.containsAll(ar2.ar)){
            return true;
        }else{
            return false;
        }
    }
}
