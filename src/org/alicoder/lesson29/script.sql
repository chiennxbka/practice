SELECT * FROM subject s; -- lay ra tat ca cac cot trong bang

SELECT id , name from subject; -- lay ra mot vai cot trong db

-- cau lenh where -> filter theo dieu kien cua cac COT (giong nhu filter)
SELECT * FROM subject WHERE faculty_id = 3;

-- cau lenh filter nhieu dieu kien

SELECT * FROM subject WHERE faculty_id = 3 OR faculty_id = 1;
SELECT * FROM subject WHERE faculty_id IN (1, 3);

-- toan tu like lay ra theo dieu kien co chua gia tri
SELECT * FROM subject WHERE name LIKE 'VÄƒn%';

-- toan tu and  lay ra cac ban ghi thoa man tat ca dieu kien and co trong cau try van

SELECT * from subject s WHERE s.lesson_quantity = 45 and s.faculty_id =1 and name LIKE '%CÆ¡%';



SELECT s.name FROM subject s;

-- truy van trong nhieu bang
SELECT
	s.id,
	s.name,
	s.lesson_quantity,
	f.name as khoa_vien
from
	subject as s
inner join faculty f on
	s.faculty_id = f.id
order by s.lesson_quantity, s.name DESC;

-- SELECT  DISTINCT , loa bo phan tu trung lap, chi giu nhung phan tu dai dien

SELECT DISTINCT(s.lesson_quantity) FROM subject s;

-- limit
SELECT s.id , s.name , s.faculty_id FROM subject s limit 3; -- lay ra 3 phan tu dau tien trong danh sach

SELECT * FROM subject s limit 3, 3; -- lay ra max 3 phan tu ke tu phan tu thu 4
