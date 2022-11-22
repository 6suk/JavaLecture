SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS cart;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS sUsers;




/* Create Tables */

CREATE TABLE cart
(
	oid int NOT NULL,
	pid int NOT NULL,
	quantity int,
	UNIQUE (oid, pid)
);


CREATE TABLE orders
(
	oid int NOT NULL AUTO_INCREMENT,
	oDate datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	totalPrice int DEFAULT 0 NOT NULL,
	uid varchar(12) NOT NULL,
	PRIMARY KEY (oid)
);


CREATE TABLE product
(
	pid int NOT NULL AUTO_INCREMENT,
	pname varchar(40) NOT NULL,
	cost int DEFAULT 0 NOT NULL,
	price int DEFAULT 0 NOT NULL,
	PRIMARY KEY (pid)
);


CREATE TABLE sUsers
(
	uid varchar(12) NOT NULL,
	uname varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	addr varchar(80),
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE cart
	ADD FOREIGN KEY (oid)
	REFERENCES orders (oid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cart
	ADD FOREIGN KEY (pid)
	REFERENCES product (pid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orders
	ADD FOREIGN KEY (uid)
	REFERENCES sUsers (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



