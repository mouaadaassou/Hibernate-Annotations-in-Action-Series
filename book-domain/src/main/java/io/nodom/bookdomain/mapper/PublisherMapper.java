package io.nodom.bookdomain.mapper;

import io.nodom.bookdomain.domain.ContactPoint;
import io.nodom.bookdomain.domain.Publisher;
import io.nodom.bookdomain.dto.ContactPointDTO;
import io.nodom.bookdomain.dto.PublisherDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublisherMapper {
    PublisherDTO publisherToPublisherDTO(Publisher publisher);
    ContactPointDTO contactPointToContactPointDTO(ContactPoint contactPoint);
}
