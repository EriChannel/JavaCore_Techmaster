package org.example.model.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {


    private String fullName;

    private String mobile;
    private String specificAddress;
    private String ward;
    private String district;
    private String city;



    @Override
    public String toString() {
        return fullName + " - " + mobile + ", " + specificAddress + ", " +ward +", " + district + ", " + city;
    }
}
