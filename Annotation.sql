use annotation;

drop table if exists ant_annotation;

create table ant_annotation (
  ant_id bigint unsigned not null auto_increment,
  ant_text varchar(256) not null,
  ant_datetime datetime not null default current_timestamp,
  ant_usr_id bigint unsigned not null,
  primary key (ant_id),
  foreign key ant_usr_fk(ant_usr_id) references usr_user(usr_id)
);

insert into ant_annotation(ant_text, ant_usr_id) values ('Test', 1)