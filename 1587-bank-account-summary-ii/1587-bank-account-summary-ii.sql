# Write your MySQL query statement below
SELECT u.name as "name",sum(t.amount) as "balance" from users u
join Transactions t on u.account = t.account
group by u.account ,t.account
Having  sum(t.amount) >10000;