package kg.megacom.buffet.models;

import jdk.jfr.MemoryAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operations {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date addDate;
    private Date editeDate;
    private String summ;
    private String debtSum;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pin_pins")
    private Pin pin;
    @Enumerated(EnumType.STRING)
    private Status status;



}
