create schema annotation;
use annotation;

create user 'user'@'localhost' identified by 'pass123'

grant select, insert, delete, update on annotation.* to user@'localhost';

create table usr_user (
  usr_id bigint unsigned not null auto_increment,
  usr_name varchar(20) not null,
  usr_password varchar (150) not null,
  primary key (usr_id),
  unique key uni_user_name (usr_name)
);
