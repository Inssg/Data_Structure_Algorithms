-- 코드를 입력하세요


select a.ANIMAL_ID , a.NAME
FROM ANIMAL_OUTS a left join ANIMAL_INS b ON a.ANIMAL_ID = b.ANIMAL_ID
where b.ANIMAL_ID is null