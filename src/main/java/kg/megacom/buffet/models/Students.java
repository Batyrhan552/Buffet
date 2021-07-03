package kg.megacom.buffet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String pin;
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "cours_id")
    private Courses courses;
}
