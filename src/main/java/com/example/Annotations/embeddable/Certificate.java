package com.example.Annotations.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable  //it will add these columns as well otherwise it will not add in "PsaInfo" table
@Data
public class Certificate {

    private int certi_id;
    private String certi_name;
}
