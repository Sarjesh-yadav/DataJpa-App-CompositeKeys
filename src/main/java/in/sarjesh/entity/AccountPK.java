package in.sarjesh.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class AccountPK implements Serializable {

    private Integer accId;
    private String accType;
    private String holderName;
}
