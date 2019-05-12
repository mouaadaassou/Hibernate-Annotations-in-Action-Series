package io.nodom.bookdomain.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.nodom.bookdomain.domain.Publisher;
import io.nodom.bookdomain.dto.PublisherDTO;
import io.nodom.bookdomain.mapper.PublisherMapper;
import org.mapstruct.factory.Mappers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CustomPublisherSetSerializer extends StdSerializer<Set<Publisher>> {

    private PublisherMapper mapper = Mappers.getMapper(PublisherMapper.class);

    public CustomPublisherSetSerializer() {
        this(null);
    }

    public CustomPublisherSetSerializer(Class<Set<Publisher>> s) {
        super(s);
    }

    @Override
    public void serialize(Set<Publisher> publishers, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        Set<PublisherDTO> result = new HashSet<>();
        for (Publisher publisher : publishers) {
            result.add(mapper.publisherToPublisherDTO(publisher));
        }
        jsonGenerator.writeObject(result);
    }
}
