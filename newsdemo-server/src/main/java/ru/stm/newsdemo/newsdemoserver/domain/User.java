package ru.stm.newsdemo.newsdemoserver.domain;

import java.math.BigInteger;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="ND_USERS")
public class User {
	
	@Id
	
	private BigInteger ID;

    private String USERNAME;

    private String PASSWORD;
    
   protected User() {}
    
    public User(BigInteger ID,String USERNAME,String PASSWORD) {
    	this.ID=ID;
    	this.USERNAME=USERNAME;
    	this.PASSWORD=PASSWORD;
    	
    }
    public BigInteger getID() {
        return ID;
    }
 
    public void setID(BigInteger ID) {
        this.ID = ID;
    }
 
    public String getUSERNAME() {
        return USERNAME;
    }
 
    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
 
    public String getPASSWORD() {
        return PASSWORD;
    }
 
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
 
    @Override
    public String toString() {
        return String.format(
                "ID[ID=%d, USERNAME='%s', PASSWORD='%s']",
                ID, USERNAME, PASSWORD);
    }

	

}
