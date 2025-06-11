package school.hei.primaryNumber.endpoint.event.consumer.model;

import school.hei.primaryNumber.PojaGenerated;
import school.hei.primaryNumber.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
