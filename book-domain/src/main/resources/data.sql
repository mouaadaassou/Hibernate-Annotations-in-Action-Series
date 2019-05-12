--############## Address ###############--
INSERT INTO t_address(id, country, city, region, box_number, postal_code, street) VALUES(1, 'Morocco', 'Nador', 'Ost', '62000', '1830', 'Marakkech 31');

--############## Contact Point ###############--
INSERT INTO t_contact_point(id, email, telephone, fax, hours_available) VALUES(1, 'contact@nodomio.com', '0536600658', '036658931', '8-12 14-18');

--############## Available languages ###############--
INSERT INTO t_available_languages(t_contact_point_id, languages) VALUES(1, 'AR');
INSERT INTO t_available_languages(t_contact_point_id, languages) VALUES(1, 'EN');
INSERT INTO t_available_languages(t_contact_point_id, languages) VALUES(1, 'ES');

--############## Publisher ###############--
INSERT INTO t_publisher(id, tax_id, website, email, address_id, contact_point_id) VALUES(1, '123CDEE15FFF', 'www.nodom.io', 'publisher@nodomio.com', 1, 1);

--############## Author ###############--
INSERT INTO t_author(id, orcid, first_name, last_name, address_id, birth_date, email, gender, job_title, telephone)
VALUES(1, 'ERD333R12W', 'moaad', 'aassou', 1, '12.09.1994', 'aassou.moaad@gmail.com', 'male', 'Software Architect', '075698412');

--############## BOOK ###############--
INSERT INTO t_book(id, isbn, title, number_of_pages, number_of_copies_sold, date_of_publication)
VALUES(1, 'DDE456YTZZ', 'Hibernate Series In Action', 315, 125478, '21.09.2019');
INSERT INTO t_book(id, isbn, title, number_of_pages, number_of_copies_sold, date_of_publication)
VALUES(2, 'DDE456Y34Z', 'Spring Boot & DevOps', 225, 125478, '21.03.2020');
INSERT INTO t_book(id, isbn, title, number_of_pages, number_of_copies_sold, date_of_publication)
VALUES(3, 'DDE456YTEN', 'Spring Applications From Planification till deployment', 3, 125478, '21.08.2020');

--############## t_book_format ###############--
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(1, 'E_BOOK');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(1, 'HARDCOVER');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(1, 'AUDIOBOOK');

INSERT INTO t_book_format(t_book_id, book_formats) VALUES(2, 'HARDCOVER');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(2, 'E_BOOK');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(2, 'AUDIOBOOK');

INSERT INTO t_book_format(t_book_id, book_formats) VALUES(3, 'HARDCOVER');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(3, 'E_BOOK');
INSERT INTO t_book_format(t_book_id, book_formats) VALUES(3, 'AUDIOBOOK');

--############## t_book_author ###############--
INSERT INTO t_book_author(t_book_id, t_author_id) VALUES(1, 1);
INSERT INTO t_book_author(t_book_id, t_author_id) VALUES(2, 1);
INSERT INTO t_book_author(t_book_id, t_author_id) VALUES(3, 1);

--############## t_book_publisher ###############--
INSERT INTO t_book_publisher(t_book_id, t_publisher_id) VALUES(1, 1);
INSERT INTO t_book_publisher(t_book_id, t_publisher_id) VALUES(2, 1);
INSERT INTO t_book_publisher(t_book_id, t_publisher_id) VALUES(3, 1);