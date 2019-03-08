/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Jesus Lozano
 */
public class Methods {
    public Character fragmentar(String expresion, int x) {  //Este metodo separa la expresion en caracteres individuales
        Character caracter = expresion.charAt(x);
        return caracter;
    }

    public boolean isNumeric(String cadena){ //Este metodo verifica si el caracter analizado es un operando o un operador aritmetico
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public void postOrden(Node raiz){
        if(raiz!=null){
            postOrden(raiz.left);
            postOrden(raiz.right);
            System.out.print(raiz.value);
        }
    }

    public void inOrden(Node root){
        if(root!=null){
            inOrden(root.left);
            System.out.print(root.value);
            inOrden(root.right);
        }
    }



    public float sumar(float a, float b){

        return a+b;
    }

    public float restar(float a, float b){
        
        return a-b;
    }

    public float multiplicar(float a, float b){
        return a*b;
    }

    public float dividir(float a, float b){       
        return a/b;
    }


    public float exponencial(float a, float b){
        float r = (float)Math.pow(a, b);
        return r;
    }
}
