select first_name Employee,salary "Monthly Salary" from employees where (department_id in(20,50)) AND (salary BETWEEN 5000 AND 12000);