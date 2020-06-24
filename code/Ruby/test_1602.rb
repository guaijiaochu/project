#访问石家庄学院教务系统
require "watir"
include Watir  
p=Watir::Browser.new :chrome
#设置浏览器为指定大小
p.driver.manage.window.resize_to(800,700) #将浏览器设置为 600*700
p.goto ('http://www.baidu.com')
p.text_field(:id,'kw').set('石家庄学院')  
p.button(:id,'su').click  
sleep 3
 puts "百度石家庄学院"
p.link(:text,'石家庄学院-石家庄学院').click
 puts "石家庄学院官网"
sleep 3

#p.image(:id=>'/atm/4/20160304115727505.jpg').click
#p.link(:text,'教务系统').click
 puts "石家庄学院教务系统"
 sleep 3