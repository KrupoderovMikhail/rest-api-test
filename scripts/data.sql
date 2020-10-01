insert into users (username, password, enabled)
    values ('user', '$2a$10$qLUOOctMwlTikqv.YmtbjOo4Qz2p1UdG74EUtfAmqku9EKOyWFLv6', true);

insert into users (username, password, enabled)
    values ('admin', '$2a$10$ybHUVPRlXf7SuLifCgHsxeyGstko8D6NDg0421Xxjsb5lC0te945C', true);

insert into authorities (username, authority)
    values ('user', 'ROLE_USER');

insert into authorities (username, authority)
    values ('admin', 'ROLE_ADMIN');