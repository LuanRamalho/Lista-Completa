import java.util.*;
/**
 *
 * @author Luan Ramalho
 */
public class ListaCompleta 
{
    Stack dado = new Stack();
    
    void CriaLista()
    {
        System.out.println("CRIANDO LISTA");
        dado.add(0, 5);
        System.out.println(dado);
        dado.add(0, "49daj");
        System.out.println(dado);
        dado.add(2, 65);
        System.out.println(dado);
        dado.add(1, -33);
        System.out.println(dado);
        dado.add(3, "dla3");
        System.out.println(dado);
        dado.add(0, "xl5y");
        System.out.println(dado);
        dado.add(1, 88);
        System.out.println(dado);
        
    }
    
    void RetiraLista()
    {
        System.out.println("RETIRA LISTA");
        dado.removeElement(88);
        System.out.println(dado);
        dado.remove(4);
        System.out.println(dado);
        dado.remove(2);
        System.out.println(dado);
        
    }
    
    
    public static void main(String[] args) 
    {
        ListaCompleta l = new ListaCompleta();
        l.CriaLista();
        
        System.out.println("");
        
        l.RetiraLista();
        
        
    }
    
}
