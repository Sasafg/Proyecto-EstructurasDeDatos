 
package com.example.demo;

import javax.swing.JOptionPane;

/**
 *
 * @author Saryf
 */
public class ListaCarro {
    private NodoCarro head;
     
    public NodoCarro gethead() {
        return head;
    }

    public void sethead(NodoCarro head) {
        this.head = head;
    }
        
    
       public void inserta(carro c) {
        if (head == null) { 
            head = new NodoCarro(c);
        } else if (c.getAnio()< head.getDato().getAnio()) {
            NodoCarro aux = new NodoCarro(c); 
            aux.setNext(head);   
            head = aux;    
        } else if (head.getNext() == null) {
           head.setNext(new NodoCarro(c));
        } else {
             NodoCarro aux = head;
            while (aux.getNext() != null && aux.getNext().getDato().getAnio()< c.getAnio()) {
                aux = aux.getNext();
            }
           NodoCarro temp = new NodoCarro(c);  
            temp.setNext(aux.getNext()); 
            aux.setNext(temp);  
        }
}

    
    
        public boolean existe(String NPlaca) {
        boolean esta = false;
        if (head != null) {
           NodoCarro aux = head;
            while (aux != null && !aux.getDato().getPlaca().equals(NPlaca)) {
                aux = aux.getNext(); 
            }
            esta = (aux != null && aux.getDato().getPlaca().equals(NPlaca));
        }
        return esta;
    }
        
     public void buscarPorPlaca(String NPlaca) {
        if (existe(NPlaca)) {
            if (head != null) {
                NodoCarro aux = head;
               while (aux != null && !aux.getDato().getPlaca().equals(NPlaca)) {
                    aux = aux.getNext();
                }
                System.out.println(aux);
            }
        } else {
            JOptionPane.showMessageDialog(null, "PLACA NO REGISTRADA!!");
        }

    }
    
}
