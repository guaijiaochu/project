puts "----*******MYSQL模块执行SQL命令*********---"
require 'mysql2'

client = Mysql2::Client.new(
    :host     => '127.0.0.1', # 主机
    :username => 'root',      # 用户名
    :password => '123456',    # 密码
    :database => 'test',      # 数据库
    :encoding => 'utf8'       # 编码
    )