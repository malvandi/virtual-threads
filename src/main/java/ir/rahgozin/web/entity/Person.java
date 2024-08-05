package ir.rahgozin.web.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Person {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
}
