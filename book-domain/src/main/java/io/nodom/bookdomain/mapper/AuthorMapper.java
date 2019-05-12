package io.nodom.bookdomain.mapper;

import io.nodom.bookdomain.domain.Address;
import io.nodom.bookdomain.domain.Author;
import io.nodom.bookdomain.dto.AddressDTO;
import io.nodom.bookdomain.dto.AuthorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDTO authorToAuthorDTO(Author author);
    AddressDTO addressToAddressDTO(Address address);
}
