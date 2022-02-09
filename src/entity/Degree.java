package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Degree {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String title;
	private String details;
	@ManyToMany
	private List<Member> member = new ArrayList<>();
	public List<Member> getMember() {
		return member;
	}
	public void setMember(List<Member> member) {
		this.member = member;
	}
	

}
