/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 2
 * Singly linked list Node class
 */
public class CitizenRegistration 
{
    private Node headNode;
    private Node tailNode;
    private int totalRegisteredCitizens;
    private LinkedList<Citizen> list = new LinkedList<Citizen>();
    
    static class Node 
    {
        String data;
        Node next;

        Node(String d)
        {
            data = d; 
            next = null;
        }

        private Node(Node newNode) 
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
    public String lookup(String x)
    {
        Node temp = headNode;
        String search = "false";

        if(headNode.data == x)
        {
            search = "true";
        }

        while(temp.next != null)
        {
            if(temp.data == x)
            {
                search = "true";
            }
            else
            {
                temp = temp.next;
            }
        }
        return search;
    }
    
    public Citizen head()
    {
        Node current = headNode;
        
        if(current != null)
        {
            System.out.println(current.data + " ");
        }
        else
        {
            System.out.println("Error: No Citizen in head position!");
        }
        return headNode;
    }
    
    public Citizen tail()
    {
        System.out.println(list.getLast());
        return tailNode;
    }
    
    public int size() 
    {
        return totalRegisteredCitizens;
    }
    
    public boolean isEmpty()
    {
        boolean check;
        if(list == null)
        {
            check = true;
        }
        else
        {
            check = false;
        }
        return check;
    }
    
    public void addCitizenAtHead(Node newNode)
    {
        newNode.next = headNode;
        headNode = newNode;
        
        if(tailNode==null)
        {
            tailNode = headNode;
        }
        totalRegisteredCitizens++;
    }
    
    public void addCitizenAtTale(Node newNode)
    {
        while(newNode.next != null)
        {
            newNode = newNode.next;
        }
        newNode.next = newNode;
        newNode.next = null;
    }
    
    public void addCitizenBefore(String CitizenID, Node newNode)
    {
        
        
        //if(!(CitizenID.equalsIgnoreCase(Citizen.getCitizenID())))
        {
            System.out.println("Citizen has not registered for vaccine");
        }
    }
    
    public void addCitizenAfter(String CitizenID, Node newNode)
    {
        Node curr = headNode;
        
        while(curr!=null)
        {
            if(curr.data == CitizenID)
            {
                Node n = new Node(newNode);
                n.next = curr.next;
                curr.next = n;
                break;
            }
            curr = curr.next;
        }
        
        //if(!(CitizenID.equalsIgnoreCase(Citizen.getCitizenID())))
        {
            System.out.println("Citizen has not registered for vaccine");
        }
    }
    
    public void removeCitizen(String CitizenID)
    {
        if (lookup(CitizenID).equals(true))
        {
            if (headNode.data == CitizenID)
            {
                headNode = headNode.next;
            }
        }
        
        else if(lookup(CitizenID).equals(false))
        {
            System.out.println("“Citizen has not registered for vaccine");
        }

        else
        {
            Node temp = headNode;
            while (temp.next != null)
            {
                if ((temp.next).data == CitizenID)
                {
                    temp.next = (temp.next).next;
                }
                else
                {
                    temp = temp.next;
                }
            }
        }
    }
    
    public void removeLastCitizen()
    {
        Node curr = headNode;
        
        if(curr==null||curr.next==null)
        {
            headNode = null;
            return curr;
        }
        Node nextNode = curr.next;
        
        while(curr.next!=null)
        {
            if(nextNode.next==null)
            {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        totalRegisteredCitizens--;
        return curr;
    }
    
    public void removeFirstCitizen()
    {
        if(headNode == null)
        {
            System.out.println("null");
        }
        else
        {
            Node temp = headNode;
            headNode = headNode.next;
            
            System.out.println(headNode);
            //return headNode;
        }
        totalRegisteredCitizens--;
    }
    
    public void displayAllCitizens()
    {
        Node current = headNode;
        
        while(current!=null)
        {
            //System.out.println("citizenID"+ current.getCitizenID() + 
                    //"\ncitizenName citizenSurname" + list.getCitizenName() + " " 
                    //+ list.getCitizenSurname() + "\n");
            current = current.next;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Covid vaccine registration program."
                + "\nEnter the numbers for various menu options:"
                + "\n1\tShow the first citizen registered"
                + "\n2\tShow the last citizen registered"
                + "\n3\tShow the total amount of citizens registered"
                + "\n4\tShow whether the list is empty"
                + "\n5\tAdd a citizen in front of the list"
                + "\n6\tAdd a citizen at the end of the list"
                + "\n7\tAdd citizen before a given ID"
                + "\n8\tAdd citizen after a given ID"
                + "\n9\tRemove citizen with a given ID"
                + "\n10\tRemove last citizen"
                + "\n11\tRemove first citizen"
                + "\n12\tShow all citizens in the list"
                + "\n13\tAny other integers to Quit.");
        
        int intEntered = userInput.nextInt();
        
        while(intEntered>0&&intEntered<13)
        {
            if(intEntered == 5)
            {
                System.out.println("5\nEnter citizen info in the following format"
                        + "\ncitizenID, citizenName, citizenSurname, citizenCellNumber, registrationDay, "
                        + "registrationMonth, registrationDay");
            }
            else if(intEntered == 6)
            {
                System.out.println("6\nEnter citizen info in the following format"
                        + "\ncitizenID, citizenName, citizenSurname, citizenCellNumber, registrationDay, "
                        + "registrationMonth, registrationDay");
            }
            else if(intEntered == 7)
            {
                System.out.println("7\nEnter citizen info in the following format"
                        + "\ncitizenID, citizenName, citizenSurname, citizenCellNumber, registrationDay, "
                        + "registrationMonth, registrationDay");
            }
            else if(intEntered == 8)
            {
                System.out.println("8\nEnter citizen info in the following format"
                        + "\ncitizenID, citizenName, citizenSurname, citizenCellNumber, registrationDay, "
                        + "registrationMonth, registrationDay");
            }
        }
        
        if(intEntered<0 || intEntered>13)
        {
            System.out.println("Program terminated due to invalid input. Thanks for using our system.");
            System.exit(0);
        }
    }
}
