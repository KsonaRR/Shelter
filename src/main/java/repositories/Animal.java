package repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "animal", schema = "public")
@SequenceGenerator(name = "gen_seq_animal" , sequenceName = "seq_animal_id" , allocationSize = 1)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal {
    public Animal(String name, int age, String typeAnimal, String gender, String size, String[] other) {
        this.name = name;
        this.age = age;
        this.typeAnimal = typeAnimal;
        this.gender = gender;
        this.size = size;
        this.other = other;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "gen_seq_animal")
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "type_animal")
    private String typeAnimal;

    @Column(name = "gender")
    private String gender;
    @Column(name = "size")
    private String size;
    @Column(name = "other")
    private String[] other;

}
