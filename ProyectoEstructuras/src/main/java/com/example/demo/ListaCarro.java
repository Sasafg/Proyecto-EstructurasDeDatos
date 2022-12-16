 
package com.example.demo;

import javax.swing.JOptionPane;

/**
 *
 * @author Saryf
 */
public class ListaCarro {
    
    private NodoCarro head;

    public NodoVehiculo getCabeza() {
        return head;
    }

    public void setCabeza(NodoVehiculo head) {
        this.head = head;
    }

        public boolean existe(String NPlaca) {
        boolean esta = false; //Busca en la lista y retorna true si un
        //Vehiculo tiene ese número de placa 
        if (head != null) {
            //Si hay algo en la lista busca
            NodoCarro aux = head;
            //Utilizo aux como indice 
            //Mientras no se acabe la lista y el elemento de la lista sea 
            //diferente del buscado
            while (aux != null && !aux.getDato().getPlaca().equals(NPlaca)) {
                aux = aux.getNext(); //avanzo en la lista 
            }
            esta = (aux != null && aux.getDato().getPlaca().equals(NPlaca));
        }
        return esta;
    }
     public void buscarPorPlaca(String NPlaca) {
        if (existe(NPlaca)) {
            //Vehiculo tiene ese número de placa 
            if (head != null) {
                //Si hay algo en la lista busca
                NodoCarro aux = head;
                //Utilizo aux como indice 
                //Mientras no se acabe la lista y el elemento de la lista sea 
                //diferente del buscado
                while (aux != null && !aux.getDato().getPlaca().equals(NPlaca)) {
                    aux = aux.getNext(); //avanzo en la lista 
                }
                System.out.println(aux);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe esa placa.");
        }

    }
    
}
