##########################################################
#
#   데이터 조작 언어(DML: Data Manipulation Language)
#
##########################################################

 /* 
  * 1. Select
  */
USE world;     # 사용할 데이터베이스 선택
SHOW TABLES;	# 현 데이터베이스에 있는 테이블 조회
DESC city;		# city 테이블의 구조 보기

/*
SELECT 필드명 
    FROM 테이블명
    JOIN 테이블명
    ON 조인 조건
    WHERE 조건
    GROUP BY 필드명
    HAVING 그룹 조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city;     # city 테이블에 있는 내용을 전부 가져오기
SELECT `Name`, Population FROM city;
SELECT NOW();

/* 
 * 1.1 조회 조건
 */
SELECT * FROM city WHERE countrycode='KOR';     # 국내의 도시 조회
SELECT `Name`, District, Population FROM city WHERE countrycode='KOR';
SELECT `Name`, District, Population FROM city 
	WHERE Countrycode='KOR' AND Population > 1000000;

SELECT DISTINCT District FROM city 		# distinct - 고유한
	WHERE Countrycode='KOR';			# 국내 광역시도명

# 수도권(서울, 인천, 경기) 도시
SELECT * FROM city
	WHERE District='Seoul' 
	OR District='Inchon' OR District='Kyonggi';

# 국내의 인구수 100만 이상인 도시중 인구수가 홀수인 도시
SELECT * FROM city
	WHERE countrycode='KOR' 
	AND population >= 1000000 AND population % 2 = 1;

# 국내의 인구수 50만 ~ 100만 도시
SELECT * FROM city
	WHERE countrycode='KOR' 
	AND population >= 500000 AND population <= 1000000;
SELECT * FROM city
	WHERE countrycode='KOR' 
	AND population between 500000 AND 1000000;

# 충청남북도의 도시
SELECT * FROM city
	WHERE countrycode='KOR' 
	AND District LIKE 'Chungchong%';

/* 
 * 1.2 순서 
 */
# 전 세계에서 인구가 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE Population >= 8000000 
	ORDER BY Population DESC;		# Descending

# 국내에서 100만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE Population >= 1000000 AND Countrycode = 'KOR'
	ORDER BY Population DESC;		# Descending

# 국내에서 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순으로 조회
SELECT * FROM city
	WHERE Population >= 500000 AND Countrycode = 'KOR'
	ORDER BY District, Population DESC;		# ASC(Ascending은 생략 가능)

/* 
 * 1.3 갯수 
 */
# 전세계 인구수 Top 10
SELECT * FROM city
	ORDER BY Population DESC
	LIMIT 10;

# 국내 인구수 Top 5 도시
SELECT * FROM city
	WHERE CountryCode = 'KOR'
	ORDER BY Population DESC
	LIMIT 5;

# 국내 인구수 11 ~ 20위 도시 
SELECT * FROM city
	WHERE CountryCode = 'KOR'
	ORDER BY Population DESC
	LIMIT 10 OFFSET 10;         // 앞에서 10개를 건너 뛰고, 10개를 선택

/* 
 * 1.4 함수 
 */
# 국내 도시의 갯수
SELECT COUNT(*) FROM city
	WHERE CountryCode = 'KOR';

# 국내 도시의 평균 인구수
SELECT ROUND(AVG(Population)) FROM city
	WHERE CountryCode = 'KOR';

SELECT ROUND(AVG(Population)) AS avgPopulation FROM city	# Aliasing(AS)
	WHERE CountryCode = 'KOR';

# 국내 도시의 최대/최소 인구수
SELECT MAX(Population), MIN(Population) FROM city
	WHERE CountryCode = 'KOR';

/* 
 * 1.5 그룹 
 */
# 경기도의 도시 이름
SELECT GROUP_CONCAT(`Name`) FROM city
	WHERE District = 'Kyonggi';

# 국내 광역시도 이름
SELECT GROUP_CONCAT(District) FROM city
	WHERE CountryCode = 'KOR';

# 국내 광역시도의 인구수 합계를 내림차순으로 정렬
SELECT District, SUM(Population) FROM city
	WHERE CountryCode = 'KOR'
	GROUP BY District
	ORDER BY SUM(Population) DESC;

# 도시의 갯수가 많은 나라 Top 10
SELECT CountryCode, COUNT(*) FROM city
	GROUP BY CountryCode
	ORDER BY COUNT(*) DESC
	LIMIT 10;

/* 
 * 1.6 그룹의 조건 
 */
# 국내 도시의 갯수가 5개 이상인 도의 인구수 평균
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city
	WHERE CountryCode = 'KOR'
	GROUP BY District
	HAVING COUNT(*) >= 5;

# 국내 도시의 갯수가 5개 이상인 도의 인구수 평균을 인구수 평균의 내림차순으로 정렬
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city
	WHERE CountryCode = 'KOR'
	GROUP BY District
	HAVING COUNT(*) >= 5
	ORDER BY AVG(Population) DESC;

# 도시의 갯수가 100개 이상인 국가의 인구수 평균을 인구수 평균의 내림차순으로 정렬
SELECT CountryCode, ROUND(AVG(Population)), COUNT(*) FROM city
	GROUP BY CountryCode
	HAVING COUNT(*) >= 100
	ORDER BY AVG(Population) DESC;

# 대륙별 면적, 평균 GNP, 국가의 숫자를 면적 내림차순으로 정렬
SELECT Continent, SUM(SurfaceArea), ROUND(AVG(GNP)), COUNT(`Name`)
	FROM country
	GROUP BY Continent
	ORDER BY SUM(SurfaceArea) DESC;

/* 
 * 1.7 Join 
 */
# 도시의 갯수가 많은 나라 Top 10
SELECT country.Name, city.CountryCode, COUNT(city.Name) FROM city
	JOIN country
	ON city.CountryCode = country.Code
	GROUP BY city.CountryCode
	ORDER BY COUNT(city.Name) DESC
	LIMIT 10;

# 인구가 많은 도시 Top 10의 국가명, 도시명, 인구수
SELECT r.Name AS Country, l.Name AS City, l.Population FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	ORDER BY l.Population DESC 
	LIMIT 10;
    
# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
#		(대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent, r.Name AS `Country`, l.Name AS `City`, l.Population
	FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	WHERE r.Continent = 'Asia'
	ORDER BY l.Population DESC 
	LIMIT 10;

# 우리나라의 공식언어
SELECT `Language`, CountryCode FROM countrylanguage
	WHERE CountryCode = 'KOR'
	AND IsOfficial = TRUE;

# 아시아 국가의 국가명과 공식언어
SELECT l.Name AS `Country`, r.`Language` FROM country AS l
	JOIN countrylanguage AS r
	ON l.Code = r.CountryCode
	WHERE l.Continent = 'Asia'
	AND r.IsOfficial = TRUE;