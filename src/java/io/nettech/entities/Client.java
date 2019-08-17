/*
*Apply principles of creating computer software by developing a complete programme 
*to meet given business specifications.  
*/
package io.nettech.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nicole
 */
@Entity
@Table 
public class Client implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    
private Long id;
private Double customernumber;
private String name;
private String surname;
private String website;
   
public Client() {
}
public Client(String name, String surname, String website, Double customernumber, Long id) 
{ 
this.id = id;
this.name = name;
this.surname =surname;
this.website = website;
this.customernumber = customernumber; 
}
public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}
public void get(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setSurname(String surname) {
this.surname = name;
}
public String setSurname(){
return surname;
}
public void getCustomernumber(Double customernumber) {
this.customernumber = customernumber;
}
public Double getCustomernumber() {
return customernumber;
}
public void setWebsite(String website) {
this.website = website;
}
public Double setWebsite() {
return customernumber;
}    
@Override
public int hashCode() {
int hash = 0;
hash += (id != null ? id.hashCode() : 0);
return hash;
}

@Override
public boolean equals(Object object) {
// TODO: Warning - this method won't work in the case the id fields are not set
if (!(object instanceof Client)) {
return false;
}
Client other = (Client) object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
return false;
}
return true;
}

@Override
public String toString() {
return "io.nettech.entities.NettechwebEntity[ id=" + id + " ]";
}
    
}