package com.cs.trade.order.matchingengine.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@Getter
@Value
public class OfferOrder {
    private double quantity;
    private long instumentId;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date entryDate;
    private BigDecimal orderPrice;
    private OrderType orderType;
}
