/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfija;

/**
 *
 * @author Jesus Lozano
 */
public class Node {
    char value;
    Node left = null;
    Node right = null;
    Node (Character value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
