drop table if exists yellowduck;

create table yellowduck (
  id int primary key auto_increment,
  name varchar(25) not null,
  price float not null,
  birthday varchar(25) not null
);