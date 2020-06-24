
puts "----******获取查询结果集*********---"
requeir"mysql"
#connect to the MYSQL sevrver
dbh = Msql.real_connect("localhost","root","","db_student")
sql="select*from scores"
res=dbh.query(sql)
puts "id\tsubj\tscor\tname\texpl"
while row=res.fetch_row do
  puts "#{row[0]}\t #{row[1]}\t #{row[2]}\t#{row[3]}\t#{row[4]}\t}"
  
end
res.free
dbh.close

  puts "--***---"
  puts "--***---"
requeir"mysql"
#connect to the MYSQL sevrver
dbh = Msql.real_connect("localhost","root","","db_student")
sql="select*from scores"
res=dbh.query(sql)
puts "id\tsubj\tscor\tname\texpl"
res.each do |row|
  puts "#{row[0]}\t #{row[1]}\t #{row[2]}\t#{row[3]}\t#{row[4]}\t}"
end
res.free
dbh.close
  puts "--***---"
  puts "--***---"
dbh = Msql.real_connect("localhost","root","","db_student")
sql="select count(*)as row_number from scores"
res=dbh.query(sql)
puts "表中的记录个数为#{fetch_hash["row_number"]}"
res.free
dbh.close

  puts "--***---"
  puts "--***---"
dbh = Msql.real_connect("localhost","root","","db_student")
sql="select count(*)as row_number from scores"
res=dbh.query(sql)
puts "表中的记录个数为#{res.fetch_row[0]}"
res.free
dbh.close


















