package showTimePro.spring.service.mapper;

import showTimePro.spring.dto.response.ShoppingCartResponseDto;
import showTimePro.spring.model.ShoppingCart;
import showTimePro.spring.model.Ticket;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper implements
        ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart> {

    @Override
    public ShoppingCartResponseDto mapToDto(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto responseDto = new ShoppingCartResponseDto();
        responseDto.setUserId(shoppingCart.getUser().getId());
        responseDto.setTicketIds(shoppingCart.getTickets()
                .stream()
                .map(Ticket::getId)
                .toList());
        return responseDto;
    }
}
