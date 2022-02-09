package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

//import javax.persistence.Id;


@Entity
@Table(name="member")
public class Member {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Integer id;
private String name;
private String family;


@OneToOne
private Address Address;

@ManyToOne
private MemberType type;

@ManyToMany(mappedBy="member")
private List<Degree> degree = new ArrayList<>();


public List<Degree> getDegree() {
	return degree;
}
public void setDegree(List<Degree> degree) {
	this.degree = degree;
}
public MemberType getType() {
	return type;
}
public void setType(MemberType type) {
	this.type = type;
}
public Address getAddress() {
	return Address;
}
public void setAddress(Address address) {
	Address = address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFamily() {
	return family;
}
public void setFamily(String family) {
	this.family = family;
}
}
