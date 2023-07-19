/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.arboles.contacto.controller;

import ec.edu.ups.arboles.contacto.model.Contacto;
import ec.edu.ups.arboles.contacto.model.Node;

/**
 *
 * @author LENOVO
 */
public class ArbolContactos {
    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }
    public void insert(Contacto nuevoContacto)
    {
        if(raiz== null){
            raiz=new Node(nuevoContacto);
        }else{
            insertRecursivo(raiz,nuevoContacto);
        }
    } 
    public void insertRecursivo(Node node,Contacto nuevoContacto){
        if(nuevoContacto.getNombre().compareTo(node.getContacto().getNombre())<0){
            if(node.getLeft()==null){
                node.setLeft(new Node(nuevoContacto));
            }else{
                insertRecursivo(node.getLeft(), nuevoContacto);
            }
            
        }else if(nuevoContacto.getNombre().compareTo(node.getContacto().getNombre())>0){
            if(node.getRight()==null){
                node.setRight(new Node(nuevoContacto));
            }else{
                insertRecursivo(node.getRight(), nuevoContacto);
            }
        }else{
            //Si el nombre del contacti nueco es igual a uno existenre
        }
    }
    public boolean estaEquilibrada(){
        return verificarBalance(raiz);
    }
    private boolean verificarBalance(Node node ){
        if(node== null){
            return true;//tiene balance arbol vacio
        }
        int alturaIzquierda=obtenerAltura(node.getLeft());
                int alturaDerecha=obtenerAltura(node.getRight());
                        int diferencia=Math.abs(alturaIzquierda-alturaDerecha);
                        //verificamos la diferencia de las alturas
                        if(diferencia>1){
                            return false;
                        }
                        return verificarBalance(node.getLeft())&&verificarBalance(node.getRight());
        
    }
    public int obtenerAltura(Node node){
        if(node == null){
            return 0;
        }
         int alturaIzquierda=obtenerAltura(node.getLeft());
                int alturaDerecha=obtenerAltura(node.getRight());
                return Math.max(alturaIzquierda, alturaDerecha)+1;
    }
}
