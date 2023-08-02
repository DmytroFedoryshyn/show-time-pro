package showTimePro.spring.service;

import showTimePro.spring.model.CinemaHall;

import java.util.List;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
