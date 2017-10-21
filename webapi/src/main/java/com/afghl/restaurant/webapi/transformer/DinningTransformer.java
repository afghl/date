package com.afghl.restaurant.webapi.transformer;

import com.afghl.restaurant.dinning.domain.dinning.Dinning;
import com.afghl.restaurant.webapi.dto.DinningDto;
import org.springframework.stereotype.Component;

@Component
public class DinningTransformer {
    public DinningDto transDinning(Dinning i) {
        DinningDto o = new DinningDto();
        o.setId(i.getId());
        o.setTableId(i.getTableId());
        o.setStatus(i.getStatus());
        return o;
    }
}
