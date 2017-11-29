package lototeste;
public class LotoTeste {
    public static void main(String[] args) {
       Arranjo ar= new Arranjo();
       ar.adicionar(2);
       ar.adicionar(5);
       ar.adicionar(3);
       ar.listar();
       ar.ordenar();
       ar.listar();
       Arranjo ar2= new Arranjo();
       ar2.adicionar(2);
       ar2.adicionar(5);
       ar2.adicionar(3);
       ar2.listar();
       ar2.ordenar();
       ar2.listar();
       System.out.println(ar.comparar(ar, ar2));   
       
       Arranjo ar3= new Arranjo();
       ar3.adicionar(2);
       ar3.adicionar(5);
       
       ar3.listar();
       ar3.ordenar();
       ar3.listar();
       System.out.println(ar.compararParte(ar2, ar3));
       
    }    
}
