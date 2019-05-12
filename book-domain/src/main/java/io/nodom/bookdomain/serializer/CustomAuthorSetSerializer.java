package io.nodom.bookdomain.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.nodom.bookdomain.domain.Author;
import io.nodom.bookdomain.dto.AuthorDTO;
import io.nodom.bookdomain.mapper.AuthorMapper;
import org.mapstruct.factory.Mappers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CustomAuthorSetSerializer extends StdSerializer<Set<Author>> {

    AuthorMapper authorMapper = Mappers.getMapper(AuthorMapper.class);

    public CustomAuthorSetSerializer() {
        this(null);
    }

    public CustomAuthorSetSerializer(Class<Set<Author>> s) {
        super(s);
    }

    @Override
    public void serialize(Set<Author> authors, JsonGenerator generator, SerializerProvider s) throws IOException, JsonProcessingException {
        Set<AuthorDTO> result = new HashSet<>();
        for (Author author : authors) {
            result.add(authorMapper.authorToAuthorDTO(author));
        }
        generator.writeObject(result);
    }
}
