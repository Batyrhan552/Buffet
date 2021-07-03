package kg.megacom.buffet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operation_id")
    private Operations operations;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buffet_id")
    private Buffet buffet;
}
