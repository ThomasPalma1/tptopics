use annotation;

drop table if exists add_address;

create table add_address (
   add_id bigint unsigned not null auto_increment,
   public_place varchar(100) not null,
   house_number int(10) not null,
   complement varchar(50) not null,
   neighborhood varchar(50) not null,
   city varchar(50) not null,
   state varchar(2) not null,
   zip_code int(8) not null,
   add_usr_id bigint unsigned not null,
   primary key (add_id),
   foreign key add_usr_fk(add_usr_id) references usr_user(usr_id)
);
