
puts "----*******MYSQL模块执行SQL命令*********---"
require "dbi"
dbh=Mysql.real_connect("localhost","root","root","test",3306)
sql="select * from EMPLOYEE"
res="dbh.query(sql)"
dbh.close

