-- 코드를 입력하세요

SELECT  J.FLAVOR 
FROM (SELECT FLAVOR, SUM(TOTAL_ORDER) AS T FROM JULY GROUP BY FLAVOR) AS J
JOIN FIRST_HALF F
 ON J.FLAVOR = F.FLAVOR
GROUP BY FLAVOR
ORDER BY (J.T +F.TOTAL_ORDER)  DESC
LIMIT 3