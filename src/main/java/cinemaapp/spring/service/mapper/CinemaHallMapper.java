package cinemaapp.spring.service.mapper;

import cinemaapp.spring.dto.request.CinemaHallRequestDto;
import cinemaapp.spring.dto.response.CinemaHallResponseDto;
import cinemaapp.spring.model.CinemaHall;
import org.springframework.stereotype.Component;

@Component
public class CinemaHallMapper implements RequestDtoMapper<CinemaHallRequestDto, CinemaHall>,
        ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> {
    @Override
    public CinemaHall mapToModel(CinemaHallRequestDto dto) {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setDescription(dto.getDescription());
        cinemaHall.setCapacity(dto.getCapacity());
        return cinemaHall;
    }

    @Override
    public CinemaHallResponseDto mapToDto(CinemaHall cinemaHall) {
        CinemaHallResponseDto responseDto = new CinemaHallResponseDto();
        responseDto.setId(cinemaHall.getId());
        responseDto.setCapacity(cinemaHall.getCapacity());
        responseDto.setDescription(cinemaHall.getDescription());
        return responseDto;
    }
}
