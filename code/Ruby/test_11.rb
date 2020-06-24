#打开浏览器
require "watir"
include Watir  
c=Watir::Browser.new :chrome
c.goto('http://www.baidu.com/')  
c.text_field(:id, 'kw').set('webdriwer')  
c.button(:id, 'su').click  
sleep 3
if(c.text=~/selenium webdriver/) #判断页面上是否包含所需信息
 puts "测试成功"
else
 puts "测试失败"
end
