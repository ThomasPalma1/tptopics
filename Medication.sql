use annotation;

create table mdc_medication(
  mdc_id bigint primary key auto_increment,
  mdc_date_and_time datetime not null,
  mdc_temperature float not null,
  mdc_humidity float not null,
  mdc_particles float,
  mdc_status varchar(10),
  mdc_processing_date datetime
);

insert into mdc_medication(mdc_date_and_time, mdc_temperature, mdc_humidity, mdc_particles)
  values (current_timestamp(), 28.7, 0.4, 0.3),
         (current_timestamp(), 28.7, 0.4, null);