package net.fernandosimon.emp_control.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:16
 */
@Getter
@Setter
@Entity
public class BU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
}
