package net.fernandosimon.emp_control.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:11
 */
@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name required")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last name required")
    private String lastName;
    private String ssn;
    private String email;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supervisor_id", referencedColumnName = "id")
    private Supervisor supervisor;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bu_id", referencedColumnName = "id")
    private BU bu;

    @Override
    public String toString() {
        return "[" + this.firstName + " " + this.lastName + "]";
    }
}
