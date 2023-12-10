package ru.esp8266.service;

import org.springframework.stereotype.Service;
import ru.esp8266.entity.IndicationsEntity;
import ru.esp8266.repository.MillisRepository;
import ru.esp8266.repository.SensorRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class SensorService {
    private final SensorRepository sensorRepository;
    private final MillisRepository millisRepository;

    public SensorService(SensorRepository sensorRepository, MillisRepository millisRepository) {
        this.sensorRepository = sensorRepository;
        this.millisRepository = millisRepository;
    }

    public void saveIndications(int temp, int hum){

    }

    public void saveMillis(int millis){
        IndicationsEntity indications = new IndicationsEntity();
        indications.setMillis(millis);
        millisRepository.save(indications);
    }

    public List<IndicationsEntity> getIndications() {
        millisRepository.findAll();
        return millisRepository.findAll();
    }
}
