package com.example.demo.estructuraClientes;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class registroClientes {

    private node<Cliente> head;
    private node<Cliente> info;

    public void registrar(Cliente value) {
        node<Cliente> nuevoNodo = new node<>(value);

        if (head == null) {
            head = nuevoNodo;

        } else if (head.getValue().getCedula() > nuevoNodo.getValue().getCedula()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;

        } else if (head.getValue().getCedula() < nuevoNodo.getValue().getCedula() && head.getNext() == null) {
            head.setNext(nuevoNodo);

        } else {
            node<Cliente> aux = head;
            while (aux.getNext() != null && aux.getNext().getValue().getCedula() < nuevoNodo.getValue().getCedula()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void mostrarRegistros() {

        if (head == null) {
            //System.out.println("\nNo hay clientes registrados.");

        } else {
            node<Cliente> aux = head;

            while (aux != null) {
                /*System.out.println("Cédula: " + aux.getValue().getCedula() + ". Nombre: "
                        + aux.getValue().getNombre());*/
                aux = aux.getNext();
                info = aux;
            }
            //System.out.println("\n");
        }
    }

    public void consultarCliente(int cedula_buscada) {

        if (head == null) {
            JOptionPane.showMessageDialog(null,"No hay clientes registrados.");

        } else {
            mostrarRegistros();

            node<Cliente> temp = head;

            while (temp.getNext() != null && cedula_buscada != temp.getValue().getCedula()) {
                temp = temp.getNext();
            }

            if (cedula_buscada == temp.getValue().getCedula()) {
                //System.out.println("\nDetalles del cliente consultado:" + temp.getValue().toString() + "\n");
                info = temp;
            } else {
                JOptionPane.showMessageDialog(null, "No hay un cliente con la cédula indicada.");
            }
        }
    }

    public void eliminarCliente(int cedula_buscada) {

        if (head == null) {
            JOptionPane.showMessageDialog(null,"No hay clientes registrados.");

        } else {
            
            if (head.getValue().getCedula() == cedula_buscada) {
                node<Cliente> aux = head.getNext();
                //System.out.println("\nDatos eliminados: " + head.getNext().getValue().toString() + "\n");
                head.setNext(null);
                head = aux;
                JOptionPane.showMessageDialog(null, "Se han eliminado los datos correctamente.");

            } else {
                node<Cliente> temp = head;

                while (temp.getNext() != null && cedula_buscada != temp.getNext().getValue().getCedula()) {
                    temp = temp.getNext();
                }

                if (cedula_buscada == temp.getNext().getValue().getCedula()) {
                    //System.out.println("\nDatos eliminados: " + temp.getNext().getValue().toString() + "\n");
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

        } else if (head.getValue().getCedula() == value.getCedula()) {
            head.getValue().setNombre(value.getNombre());
            head.getValue().setCorreo(value.getCorreo());
            head.getValue().setFecha_nacimiento(value.getFecha_nacimiento());
            head.getValue().setCategoria(value.getCategoria());
            existe = true;

        } else {
            node<Cliente> aux = head;
            while (aux != null && aux.getValue().getCedula() != value.getCedula()) {
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
            JOptionPane.showMessageDialog(null,"Se realizaron los cambios exitosamente");
        }
    }

    public node<Cliente> getInfo() {
        return info;
    }

    public void setInfo(node<Cliente> info) {
        this.info = info;
    }
    
    
}
