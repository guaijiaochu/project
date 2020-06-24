#浏览器前进后退navigate
require "watir"
include Watir  
c=Watir::Browser.new :chrome
dr=c.driver
first_url = 'http://www.baidu.com'
puts "现在页面是百度 #{first_url}"
dr.get(first_url)
sleep 1
second_url = 'http://news.baidu.com/'
puts "现在页面是 百度新闻#{second_url}"
dr.get(second_url)
sleep 1
puts "返回 百度#{first_url}"
dr.navigate.back()
sleep 1
puts "forward to重定向到新闻 #{second_url}"
dr.navigate.forward()
sleep 1
dr.quit()
