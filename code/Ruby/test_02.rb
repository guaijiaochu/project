#encoding:utf-8  #指定文件的编码为 utf-8
require 'watir-webdriver' #加载你需要的包或者文件
@browser=Watir::Browser.new:ff 
@browser.goto www.baidu.com #让页面跳转到百度主页
@browser.text_field(:id=>'kw').set"webdriwer" #在搜索框中输入 webdriver
@browser.button(:id=>'百度一下').click  #点击百度一下按钮
sleep 2
if(@browser.text= ~/selenium webdriver/) #判断页面上是否包含所需信息
puts "测试成功"
else
puts "测试失败"
end
