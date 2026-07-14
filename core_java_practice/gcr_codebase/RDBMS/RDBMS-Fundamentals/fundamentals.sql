-- Create COVID Database Schema (DDL)
create database covid_db;
use covid_db;

create table covid_cases (
	id INT PRIMARY KEY auto_increment,
    date DATE,
    time timestamp,
    state varchar(50),
    confirmed_indian_national INT,
    confirmed_foreign_national INT,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);

-- Insert Initial COVID Data (DML)
INSERT INTO covid_cases
(date, time, state, confirmed_indian_national, confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-15', '2020-03-15 10:00:00', 'Maharashtra', 95, 5, 50, 2, 100);

-- Update Case Information (DML)
UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'Maharashtra'
  AND date = '2020-03-15';
  
-- Delete Incorrect Records (DML)
INSERT INTO covid_cases
(date, time, state, confirmed_indian_national, confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-15', '2020-03-15 10:00:00', 'IN', 95, 5, 50, 2, 120);

DELETE FROM covid_cases
WHERE state = 'IN';

-- Alter Table (DDL)
ALTER TABLE covid_cases
ADD COLUMN vaccination_rate FLOAT;