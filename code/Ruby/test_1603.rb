#访问石家庄学院教务系统
require "watir"
include Watir  
p=Watir::Browser.new :chrome
#设置浏览器为指定大小
p.driver.manage.window.resize_to(800,700) #将浏览器设置为 600*700
p.goto ('http://210.31.249.143/')
 puts "石家庄学院教务系统"
 sleep 3
