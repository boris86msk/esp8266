package ru.esp8266.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.esp8266.entity.IndicationsEntity;

import java.util.List;

public interface MillisRepository extends JpaRepository<IndicationsEntity, Long> {
}
