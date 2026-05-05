# Write your MySQL query statement below
Select U.unique_id, E.name 
From Employees E LEFT Join EmployeeUNI U 
On E.id = U.id
