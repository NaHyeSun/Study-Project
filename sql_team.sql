use teamStudy;

CREATE TABLE entrance_info (
	entrance_code INT AUTO_INCREMENT PRIMARY KEY COMMENT '입장코드',
    ticket_code INT COMMENT '티켓종류',
    person_name VARCHAR(255) NOT NULL COMMENT '이름',
    person_age INT COMMENT '나이', 
    person_gender VARCHAR(5) COMMENT '성별',
    person_height DOUBLE COMMENT '키',
    CHECK(person_gender IN ('남','여'))
) ENGINE = INNODB;

CREATE TABLE ticket_info (
	ticket_code INT AUTO_INCREMENT PRIMARY KEY COMMENT '티켓코드',
    ticket_sort VARCHAR(255) COMMENT '티켓종류',
    ticket_price INT COMMENT '티켓금액',
    ticket_date DATE COMMENT '티켓날짜'
    );

CREATE TABLE ride_info (
	ride_code INT AUTO_INCREMENT PRIMARY KEY COMMENT '놀이기구코드',
    ride_sort VARCHAR(255) COMMENT '놀이기구종류',
    wating_time VARCHAR(255) COMMENT '대기시간',
    operation_info VARCHAR(5) COMMENT '운영정보',
    entrance_code INT COMMENT '입장코드',
    foreign key (entrance_code) references entrance_info (entrance_code),
    CHECK(operation_info IN ('Y', 'N'))
);


INSERT INTO entrance_info(entrance_code, ticket_code, person_name, person_age, person_gender, person_height) VAlUES 
(1, 21, '김대안', 27, '남',  183),
(2, 22, '나혜수', 36, '여', 162),
(3, 22, '박진양', 40, '남', 171),
(4, 21, '이재한', 33, '남', 177),
(5, 21, '박은빈', 30, '여', 158);

INSERT INTO ticket_info(ticket_code, ticket_sort, ticket_price, ticket_date) VALUES 
(21, '자유이용권', 30000, '2024-03-03'),
(22, '빅3이용권', 10000, '2024-03-03');

INSERT INTO ride_info(ride_code, entrance_code, ride_sort, wating_time, operation_info) VALUES
(31, NULL , '회전목마', '30분', 'Y'),
(32, NULL, '자이로드롭', '60분', 'Y'),
(33, NULL, '바이킹', '60분', 'N');