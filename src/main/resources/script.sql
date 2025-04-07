create table bird(
id INT PRIMARY KEY,
name VARCHAR2,
collor VARCHAR2,
weight VARCHAR2,
height VARCHAR2
);

create table sighting(
id INT PRIMARY KEY,
bird_id INT,
location VARCHAR2,
datetime VARCHAR2

);
insert into bird (id, name, collor, weight, height) values (1, 'pigeon', 'white', 'heavy', 'big');
insert into bird (id, name, collor, weight, height) values (2, 'hawq', 'stripes', 'heavy', 'big');
insert into bird (id, name, collor, weight, height) values (3, 'sparrow', 'stripes', 'light', 'small');


insert into sighting (id, bird_id, location, datetime) values (1, 2, 'city', '20/03/2025');
insert into sighting (id, bird_id, location, datetime) values (2, 2, 'park', '22/03/2025');
insert into sighting (id, bird_id, location, datetime) values (3, 2, 'zoo', '25/03/2025');