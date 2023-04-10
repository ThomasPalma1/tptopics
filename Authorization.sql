use annotation;

drop table if exists aut_authorization;
drop table if exists uau_user_authorization;

create table aut_authorization (
  aut_id bigint unsigned not null auto_increment,
  aut_name varchar(20) not null,
  primary key (aut_id),
  unique key uni_aut_name (aut_name)
);

create table uau_user_authorization (
  usr_id bigint unsigned not null,
  aut_id bigint unsigned not null,
  primary key (usr_id, aut_id),
  foreign key aut_user_fk (usr_id) references usr_user (usr_id) on delete restrict on update cascade,
  foreign key aut_authorization_fk (aut_id) references aut_authorization (aut_id) on delete restrict on update cascade
);

insert into aut_authorization (aut_name)
    values ('ROLE_ADMIN');
insert into uau_user_authorization (usr_id, aut_id)
    values (1, 1);