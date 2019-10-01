CREATE DATABASE ncds_insights;
\c ncds_insights;


CREATE TABLE comments((id SERIAL PRIMARY KEY,name VARCHAR,email VARCHAR,subject VARCHAR,message VARCHAR);