puts "----*******MYSQL模块执行SQL命令*********---"
#引入DBI库文件
require "dbi"
  # 连接到 MySQL 服务器
  dbh = DBI.connect("DBI:Mysql:lesson:localhost", "testuse","teat123")
  if dbh
    puts "链接成功"
    dbh.disconnect
    puts "关闭"
  end

