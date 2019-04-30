create table test_user
(
  user_id int auto_increment,
  user_name varchar(100) not null,
  user_surname varchar(100) not null,
  birth_date timestamp(6) null,
  constraint user_pk
    primary key (user_id)
);
