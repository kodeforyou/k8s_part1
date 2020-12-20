package com.kodeforyou.apps.springboot.resourcesconsumer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceDto {
    private int id;
    private String lastname;
    private String firstname;
    private String role;
    private String skillset;
    private int salary;
	@Override
	public String toString() {
		return "ResourceDto [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", role=" + role
				+ ", skillset=" + skillset + ", salary=" + salary + "]";
	}
    
}
