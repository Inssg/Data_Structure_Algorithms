SELECT MEMBER_NAME,REVIEW_TEXT,DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE M
JOIN REST_REVIEW R
ON  M.MEMBER_ID = R.MEMBER_ID
WHERE M.MEMBER_ID IN (SELECT MEMBER_ID
FROM REST_REVIEW
GROUP BY MEMBER_ID
HAVING COUNT(REVIEW_ID) =(SELECT MAX(CNT)
FROM(
SELECT MEMBER_ID, COUNT(*) AS CNT
FROM REST_REVIEW
GROUP BY MEMBER_ID
)TMP)
)
ORDER BY REVIEW_DATE, REVIEW_TEXT