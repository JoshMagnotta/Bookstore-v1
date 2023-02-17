/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magnottajoshproject1.book;

import java.util.*;

/**
 *
 * @author jmhee
 */
public class Memberships {
    
    private ArrayList<String> memberships = new ArrayList<>();
    private ArrayList<Boolean> memberStatus = new ArrayList<>();
    private ArrayList<Double> memberPoints = new ArrayList<>();
    private ArrayList<String> memberNumber = new ArrayList<>();
    
    //add member
    public void addMember(String name, boolean premium) {
        memberships.add(name);
        memberStatus.add(premium);
        memberPoints.add(0.0);
        memberNumber.add("");
    }
    
    //find member
    public String findMember(String name) {
        for (int i = 0; i < memberships.size(); i++) {
            if (memberships.get(i).equals(name))
                if(memberStatus.get(i))
                    return "Valid premium member";
            else
                    return "Valid free member";
        }
        return "Sorry, your name is not in our system.";
    }
    
        public int findMemberID(String name) {
        for (int i = 0; i < memberships.size(); i++) {
            if (memberships.get(i).equals(name))
                if(memberStatus.get(i))
                    return i;
        }
        return -1;
    }
    
    public void changeMemberStatus(String name, boolean bool) {
        int ID = findMemberID(name);
        if(ID != -1)
            memberStatus.set(ID, bool);
        
        else 
            System.out.println("Sorry, your name is not in our system.");     
    }
    
    public boolean getMemberStatus(String name) {
        int ID = findMemberID(name);
        if (ID != -1) {
            if(memberStatus.get(ID)) 
            return true;
        }
        return false;
    }
    
    // point system
    // Not sure if the ID variable is going to work properly
    // ****TEST WHEN POSSIBLE****
    public void addMemberPoints(String name, Double total) {
        int ID = findMemberID(name);
        if (ID != -1)
            memberPoints.set(ID, (total));
    }
    
    public Double getMemberPoints(String name) {
        int ID = findMemberID(name);
        if (ID != -1)
            return memberPoints.get(ID);
        
        return -1.0;
    }
    
    // remove points after purchase
    public void removeMemberPoints (String name) {
        int ID = findMemberID(name);
        if (ID != -1 && memberStatus.get(ID) == true)
            memberPoints.set(ID, (memberPoints.get(ID) - 100));
        
        else if (ID != -1 && memberStatus.get(ID) == false)
            memberPoints.set(ID, (memberPoints.get(ID) - 150));
        else
            System.out.println("Sorry, your name is not in our system");
        
    }
    
    //remove member
    public String removeMember(String name) {
         for (int i = 0; i < memberships.size(); i++) {
            if (memberships.get(i).equals(name)) {
                memberships.remove(i);
                memberStatus.remove(i);
                memberPoints.remove(i);
                memberNumber.remove(i);
                return "Membership successfully removed.";
            }
        }
         return "Sorry, your name is not in our system.";
         
    }
    
    public void setMemberNumber(String name, String number) {
        int ID = findMemberID(name);
        if (ID != -1)
            memberNumber.set(ID, number);
        
        else
            System.out.println("Sorry, your name is not found in our system");
    } 
    
    public String getMemberNumber(String name) {
        int ID = findMemberID(name);
        if (ID != -1)
            return memberNumber.get(ID);
        
        else
            return "Sorry, your name is not in our system";
    }  
    
}
