INSERT INTO USER (USER_ID, USERNAME, PASSWORD) VALUES ('1200', 'fsimon', '$2a$10$6lpFHrNzlaodQDpR6NKv..Bo2fAlK4YPlsUdnnyydoeKatGSJI8M.');
INSERT INTO USER (USER_ID, USERNAME, PASSWORD) VALUES ('1100', 'yo', '$2a$10$n6tyTBmDkOj5LyRjiSkoQ.Soyd6c6HSuhPLJTf67L21X3QuRsaY.S');
INSERT INTO category (description) VALUES ('Developer Class 1');
INSERT INTO category (description) VALUES ('Developer Class 2');
INSERT INTO category (description) VALUES ('Developer Class 3');
INSERT INTO category (description) VALUES ('QA');
INSERT INTO category (description) VALUES ('Service & Admin');
INSERT INTO category (description) VALUES ('MES Support');
INSERT INTO category (description) VALUES ('BSAS, DBAS & PM');
INSERT INTO location (description) VALUES ('Plant A');
INSERT INTO location (description) VALUES ('Plant B');
INSERT INTO location (description) VALUES ('Plant C');
INSERT INTO location (description) VALUES ('Plant D');
INSERT INTO location (description) VALUES ('Plant E');
INSERT INTO location (description) VALUES ('UTEC');
INSERT INTO supervisor (first_name, last_name) VALUES ('Carlos','Zamora');
INSERT INTO supervisor (first_name, last_name) VALUES ('Enrique','Barberi');
INSERT INTO supervisor (first_name, last_name) VALUES ('Mireya','Rodriguez');
INSERT INTO supervisor (first_name, last_name) VALUES ('Lorena','Rodriguez');
INSERT INTO supervisor (first_name, last_name) VALUES ('Ricardo','Mejia');
INSERT INTO supervisor (first_name, last_name) VALUES ('Daniel','Soto');
INSERT INTO supervisor (first_name, last_name) VALUES ('Oscar','Lecea');
INSERT INTO bu (description) VALUES ('IT Shared');
INSERT INTO bu (description) VALUES ('A');
INSERT INTO bu (description) VALUES ('B');
INSERT INTO bu (description) VALUES ('Finance SS');
INSERT INTO bu (description) VALUES ('C');
INSERT INTO bu (description) VALUES ('D');
INSERT INTO bu (description) VALUES ('E');
INSERT INTO bu (description) VALUES ('UTEC');
INSERT INTO employee (first_name, middle_name, last_name, ssn, email,  category_id, location_id, supervisor_id, bu_id)
       VALUES ('Angela', 'Melo', 'Erica', '0569874566', 'angelamelo@utc.com.mx', 1, 1, 1, 1);
INSERT INTO employee (first_name, last_name, middle_name, ssn, email, category_id, location_id, supervisor_id, bu_id)
       VALUES ( 'Ricardo', 'Treviso', 'Roque', '0588874566', 'angrybirds@utc.com.mx', 2, 3, 4, 2);
INSERT INTO employee (first_name, middle_name, last_name, ssn, email,  category_id, location_id, supervisor_id, bu_id)
       VALUES ('Romelo', 'Tata', 'Lukaku', '0588874566', 'alokulo@utc.com.es', 2, 1, 1, 1);
INSERT INTO employee (first_name, last_name, middle_name, ssn, email, category_id, location_id, supervisor_id, bu_id)
       VALUES ( 'Morten', 'Aldo', 'Roque', '0555574566', 'betpbet@latonga.us', 2, 3, 4, 2);
INSERT INTO employee (first_name, middle_name, last_name, ssn, email,  category_id, location_id, supervisor_id, bu_id)
       VALUES ('Roberto', 'M', 'Bergelin', '05644444566', 'angelamelo@utc.com.mx', 3, 1, 1, 1);
INSERT INTO employee (first_name, last_name, middle_name, ssn, email, category_id, location_id, supervisor_id, bu_id)
       VALUES ( 'Valdo', 'T', 'Roque', '0577874566', 'angrybirds@toro.com.ar', 2, 3, 4, 2);