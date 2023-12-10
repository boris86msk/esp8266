package ru.esp8266.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "indications")
@Data
public class IndicationsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="time")
    private LocalDateTime time = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);

    @Column(name="millis")
    private int millis;
}
