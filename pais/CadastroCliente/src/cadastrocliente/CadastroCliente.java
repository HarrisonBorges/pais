package cadastrocliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CadastroCliente {

    public static void main(String[] args) {
       
       Collection<Cliente> clientes = new ArrayList<Cliente>();
       Collection<Pais> paises = new ArrayList<Pais>();
       
       paises.add(new Pais("Brasil", "BR"));
       paises.add(new Pais("Estados Unidos", "EUA"));
       
       ClienteGUI gui = new ClienteGUI();//(ArrayList<Pais>) paises
       gui.setVisible(true);
       clientes = gui.retornarCliente();
       
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    
}
