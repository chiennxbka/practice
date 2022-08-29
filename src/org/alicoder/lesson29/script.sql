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

-- alias, bí danh

SELECT s.id identity_subject, s.name sub_name FROM subject as s;


-- cac phep toan join
-- inner join
select s.name ten_mon_hoc , f.name khoa_vien FROM subject s inner join faculty f on s.faculty_id  = f.id;

-- left join lay ra phan giao cua ca 2 bang va toan bo bang ben trai con lai

SELECT cu .customerNumber , cu.customerName , od.orderNumber from customers cu left join orders od on cu.customerNumber = od.customerNumber;

-- right join lay ra phan giao cua hai bang va toan bo bang ben phai

SELECT
    employeeNumber,
    customerNumber
FROM
    customers
RIGHT JOIN employees
    ON salesRepEmployeeNumber = employeeNumber
ORDER BY
	employeeNumber;

-- update sql table

--  Auto-generated SQL script #202208292059
UPDATE customers c
	SET c.customerName='Atelier graphique update....'
	WHERE c.customerNumber=103;


-- xoa du lieu trong bang co filter data

DELETE FROM subject WHERE id = 5;

-- function trong mysql

-- Ham min (lay ra gia tri nho nhat trong cot cua bang)

SELECT MIN(o.quantityOrdered) FROM orderdetails o -- 6

-- Ham max (lay ra gia tri lon nhat trong cot cua bang)

SELECT MAX(o.quantityOrdered) FROM orderdetails o -- 97

-- tinh tong gia tri cua mot cot

select SUM(o.quantityOrdered) FROM orderdetails o

-- tinh gia tri trung binh cua mot cot

select AVG(o.quantityOrdered) from orderdetails o


-- group by TABLE
SELECT
    status, COUNT(orders.orderNumber)
FROM
    orders
GROUP BY status;


-- sum and group BY

SELECT
    status,
    SUM(quantityOrdered * priceEach) AS amount
FROM
    orders
INNER JOIN orderdetails
    USING (orderNumber)
GROUP BY
    status;


   -- having filter dieu kien tu group BY
   SELECT
    orderNumber,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY
    orderNumber HAVING total < 10000;
