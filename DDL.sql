drop user if exists 'user'@'localhost';
drop schema if exists annotation;
create schema annotation;

use annotation;

flush privileges;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on annotation.* to user@'localhost';

create table usr_user (
  usr_id bigint unsigned not null auto_increment,
  usr_name varchar(20) not null,
  usr_password varchar(150) not null,
  primary key (usr_id),
  unique key uni_user_name (usr_name)
);
insert into usr_user (usr_name, usr_password)
    values ('admin', '$2a$10$i3.Z8Yv1Fwl0I5SNjdCGkOTRGQjGvHjh/gMZhdc3e7LIovAklqM6C');