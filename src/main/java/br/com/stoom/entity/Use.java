package br.com.stoom.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "use")
public class Use {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Column(name = "STREETNAME")
    @Size(min = 3, max = 100)
    private String streetName ; 
    
    @Column(name = "NUMBER")
    private long number;
    
    @Column(name = "COMPLEMENT")
    private  String complement ;
    
    @Column(name = "NEIGHBOURHOOD")
    private  String neighbourhood ;
    
    @Column(name = "CITY")
    private  String city ;
    
    @Column(name = "STATE")
    private  String state ;
    
    @Column(name = "COUNTRY")
    private  String country ;
    
    @Column(name = "ZIPCODE")
    private  String zipCode ;
    
    @Column(name = "LATIDUDE")
    private  String latitude ;
    
    @Column(name = "LONGITUDE")
    private  String longitude ;
    
    @Email
    @Column(name = "EMAIL")
    private  String email ;
    
    @Column(name = "CREATIONDATE")
    private Calendar creationDate;
    
     
}

