package gift.dto.response;

import java.time.LocalDateTime;

public class OrderResponse {

    private Long id;
    private Long optionId;
    private int quantity;
    private LocalDateTime orderDateTime;
    private String message;

    public OrderResponse() { }

    public OrderResponse(Long id, Long optionId, int quantity, LocalDateTime orderDateTime, String message) {
        this.id = id;
        this.optionId = optionId;
        this.quantity = quantity;
        this.orderDateTime = orderDateTime;
        this.message = message;
    }

}
