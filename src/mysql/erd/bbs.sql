SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE board
(
	bid int NOT NULL AUTO_INCREMENT,
	btitle varchar(100) NOT NULL,
	bcontent varchar(4096),
	uid varchar(12) NOT NULL,
	modTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	viewCount int DEFAULT 0 NOT NULL,
	replyCount int DEFAULT 0 NOT NULL,
	isDel int DEFAULT 0 NOT NULL,
	PRIMARY KEY (bid)
);


CREATE TABLE reply
(
	rid int NOT NULL AUTO_INCREMENT,
	rcontent varchar(256) NOT NULL,
	regTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	isMine int DEFAULT 0 NOT NULL,
	isDel int DEFAULT 0 NOT NULL,
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(10) NOT NULL,
	email varchar(20),
	regDate date DEFAULT (CURRENT_DATE) NOT NULL,
	isDel int DEFAULT 0 NOT NULL,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bid)
	REFERENCES board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



