package io.github.sheralam.api.messages.handlers;

import io.github.sheralam.api.commons.RequestHandler;
import io.github.sheralam.api.messages.model.request.ReScheduledPayload;
import io.github.sheralam.api.messages.model.response.ReScheduledResponse;
import lombok.NonNull;
import org.springframework.web.client.RestTemplate;

import java.util.function.Supplier;

public class RescheduleHandler extends RequestHandler<ReScheduledPayload, ReScheduledResponse> {
    private static final String endpointSuffix = "/messages/reschedule.json";

    public RescheduleHandler(@NonNull Supplier<RestTemplate> restTemplateSupplier) {
        super(endpointSuffix, restTemplateSupplier);
    }

    @Override
    protected Class<ReScheduledResponse> getResponseClass() {
        return ReScheduledResponse.class;
    }

}