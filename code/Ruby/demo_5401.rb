
puts "----*******MYSQL模块执行SQL命令*********---"
dbh=Mysql.real_connect("localhost","root","","test",3306)
sql="select * from articles"
res=dbh.query(sql)
dbh.close