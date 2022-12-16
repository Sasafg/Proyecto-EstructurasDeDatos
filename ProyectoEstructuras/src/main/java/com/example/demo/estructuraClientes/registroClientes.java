package com.example.demo.estructuraClientes;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class registroClientes {

    private node<Cliente> head;
    private node<Cliente> info;
    private node<Cliente> tail;
    private int conteo;

    public int getConteo() {
        return conteo;
    }

    public void registrar(Cliente value) {
        node<Cliente> nuevoNodo = new node<>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);

        } else if (head.getValue().getCedula() > nuevoNodo.getValue().getCedula()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);

        } else if (tail.getValue().getCedula() <= nuevoNodo.getValue().getCedula() /*&& head.getNext() == null*/) {
            //head.setNext(nuevoNodo);
            nuevoNodo.setBack(tail);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);

        } else {
            node<Cliente> aux = head;
            while (aux.getNext() != null && aux.getNext().getValue().getCedula() < nuevoNodo.getValue().getCedula()) {
                aux = aux.getNext();
            }

            /*nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);*/
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);

            aux.getNext().getNext().setBack(nuevoNodo);
            nuevoNodo.setBack(aux);
        }
        conteo++;
    }

    public void mostrarRegistros() {

        if (head == null) {
            //System.out.println("\nNo hay clientes registrados.");

        } else {
            node<Cliente> aux = head;

            do {
                /*System.out.println("Cédula: " + aux.getValue().getCedula() + ". Nombre: "
                        + aux.getValue().getNombre());*/
                aux = aux.getNext();
                info = aux;
            } while (aux != head);
            //System.out.println("\n");
        }
    }
    
    public void imprimirRegistros() {

        if (head == null) {
            //System.out.println("\nNo hay clientes registrados.");

        } else {
            node<Cliente> aux = head;

            do {
                info = aux;
                aux = aux.getNext();
            } while (aux != head);
            //System.out.println("\n");
        }
    }

    public void consultarCliente(int cedula_buscada) {

        if (head == null) {
            info = null;
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");

        } else if (cedula_buscada == head.getValue().getCedula()) {
                //System.out.println("\nDetalles del cliente consultado en la cabeza:" + head.getValue().toString() + "\n");
                info = head;
                
        } else if (cedula_buscada == tail.getValue().getCedula()) {
                //System.out.println("\nDetalles del cliente consultado en la cola:" + tail.getValue().toString() + "\n");
                info = tail;
            
        } else {
            mostrarRegistros();

            node<Cliente> temp = head;

            while (temp.getNext() != tail && cedula_buscada != temp.getValue().getCedula()) {
                temp = temp.getNext();
            }

            if (cedula_buscada == temp.getValue().getCedula()) {
                //System.out.println("\nDetalles del cliente consultado:" + temp.getValue().toString() + "\n");
                info = temp;
            } else {
                info = null;
                JOptionPane.showMessageDialog(null, "No hay un cliente con la cédula indicada.");
            }
        }
    }

    public void eliminarCliente(int cedula_buscada) {

        if (head == null) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");

        } else {

            if (head.getValue().getCedula() == cedula_buscada && head.getNext() != head) { //Si el valor está al inicio pero hay más elementos
                node<Cliente> aux = head.getNext();
                //System.out.println("\nDatos eliminados: " + head.getNext().getValue().toString() + "\n");
                aux.setBack(tail);
                tail.setNext(aux);
                head = aux;
                JOptionPane.showMessageDialog(null, "Se han eliminado los datos correctamente.");
                
            } else if (head.getValue().getCedula() == cedula_buscada && head.getNext() == head) { //Si el valor está al inicio y es el único en la lista
                head.setBack(null);
                head.setNext(null);
                head = null;
                tail = null;
                JOptionPane.showMessageDialog(null, "Se han eliminado los datos correctamente.");

            } else if (tail.getValue().getCedula() == cedula_buscada) { //Si el valor está al final
                node<Cliente> aux = head.getNext();
                aux = aux.getBack().getBack();
                aux.setNext(head);
                head.setBack(aux);
                tail = aux;
                JOptionPane.showMessageDialog(null, "Se han eliminado los datos correctamente.");

            } else { //Si el valor está en medio
                node<Cliente> temp = head;

                while (temp.getNext() != tail && cedula_buscada != temp.getNext().getValue().getCedula()) {
                    temp = temp.getNext();
                }

                if (cedula_buscada == temp.getNext().getValue().getCedula()) {
                    //System.out.println("\nDatos eliminados: " + temp.getNext().getValue().toString() + "\n");
                    //temp.setNext(temp.getNext().getNext());
                    temp = temp.getNext();
                    temp.setBack(temp.getBack().getBack());
                    temp = temp.getBack();
                    temp.setNext(temp.getNext().getNext());
                    mostrarRegistros();
                    JOptionPane.showMessageDialog(null, "Se han eliminado los datos correctamente.");

                } else {
                    JOptionPane.showMessageDialog(null, "No hay un cliente con la cédula indicada.");
                }
            }
        }
    }

    public void modificarCliente(Cliente value) {
        boolean existe = false;

        if (head == null) {
            System.out.println("\nNo hay clientes registrados.");

        } else if (head.getValue().getCedula() == value.getCedula()) { //Si el valor está al inicio
            head.getValue().setNombre(value.getNombre());
            head.getValue().setCorreo(value.getCorreo());
            head.getValue().setFecha_nacimiento(value.getFecha_nacimiento());
            head.getValue().setCategoria(value.getCategoria());
            existe = true;
            
            } else if (tail.getValue().getCedula() == value.getCedula()) { //Si el valor está al final
            tail.getValue().setNombre(value.getNombre());
            tail.getValue().setCorreo(value.getCorreo());
            tail.getValue().setFecha_nacimiento(value.getFecha_nacimiento());
            tail.getValue().setCategoria(value.getCategoria());
            existe = true;

        } else { //Si está en medio
            node<Cliente> aux = head;
            while (aux != tail && aux.getValue().getCedula() != value.getCedula()) {
                aux = aux.getNext();
            }

            if (aux.getValue().getCedula() == value.getCedula()) {
                aux.getValue().setNombre(value.getNombre());
                aux.getValue().setCorreo(value.getCorreo());
                aux.getValue().setFecha_nacimiento(value.getFecha_nacimiento());
                aux.getValue().setCategoria(value.getCategoria());
                existe = true;
            }
        }

        if (existe == false) {
            JOptionPane.showMessageDialog(null, "No hay ningún cliente registrado con la cédula indicada.");
        } else {
            JOptionPane.showMessageDialog(null, "Se realizaron los cambios exitosamente");
        }
    }

    public node<Cliente> getInfo() {
        return info;
    }

    public void setInfo(node<Cliente> info) {
        this.info = info;
    }

}
