/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 2
 * Singly linked list Node class
 */
public class Node 
{
    private Citizen citizen;
    private Node nextNode;

    public Node(Citizen citizen, Node nextNode) 
    {
        this.citizen = citizen;
        this.nextNode = nextNode;
    }

    public Citizen getCitizen() 
    {
        return citizen;
    }

    public Node getNextNode() 
    {
        return nextNode;
    }

    public void setCitizen(Citizen citizen) 
    {
        this.citizen = citizen;
    }

    public void setNextNode(Node nextNode) 
    {
        this.nextNode = nextNode;
    }
}
