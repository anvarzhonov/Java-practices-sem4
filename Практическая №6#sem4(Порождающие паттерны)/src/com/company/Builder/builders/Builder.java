package com.company.Builder.builders;

import com.company.Builder.cars.CarType;
import com.company.Builder.components.Engine;
import com.company.Builder.components.GPSNavigator;
import com.company.Builder.components.Transmission;
import com.company.Builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
