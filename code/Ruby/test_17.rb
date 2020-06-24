#访问淘宝网
require "watir"
include Watir  
p=Watir::Browser.new :chrome
dr=p.driver
#设置浏览器为指定大小
p.driver.manage.window.resize_to(800,700) #将浏览器设置为 600*700
p.goto ('http://www.baidu.com')
p.text_field(:id,'kw').set('淘宝网')  
p.button(:id,'su').click  
 puts "百度淘宝网"
 sleep 3
p.link(:text,'淘宝网 - 淘!我喜欢').click
 puts "淘宝网官网"
sleep 3

dr.quit