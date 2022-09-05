package guru.springframwork.msscbrewer2.web.model;

import lombok.*;

import java.util.UUID;

@Data               //Generates Getters and Setters
@NoArgsConstructor  //Generates constructors with no arguments
@AllArgsConstructor //Generates constructors with arguments
@Builder            //Implements the Builder Pattern
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;


}
