create database dbportfolio;
use dbportfolio;

CREATE TABLE portfolio (
   id_portfolio varchar(36) NOT NULL,
   id_user varchar(36) NOT NULL,
   balance double NOT NULL,
   PRIMARY KEY (id_portfolio)
);

insert into portfolio(id_portfolio, id_user, balance) values (uuid(), uuid(), 100.00);
select * from portfolio;