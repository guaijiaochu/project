#设置页面元素的操作
require "watir"
include Watir  
p=Watir::Browser.new :chrome
p.goto ('http://www.baidu.com')
p.text_field(:id,'kw').set('ruby')  
p.button(:id,'su').click  
sleep 3
if(p.text=~/ruby/) #判断页面上是否包含所需信息
 puts "测试成功"
else
 puts "测试失败"
end
