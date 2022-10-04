package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
    @SerializedName("name")
    private String fullName;

    @SerializedName("email")
    private String email;

    @SerializedName("mobile")
    private String mobile;
}
