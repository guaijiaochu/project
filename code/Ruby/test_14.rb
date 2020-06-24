#设置浏览器大小
   require "watir"
  include Watir  
  c=Watir::Browser.new :chrome
  dr=c.driver
  first_url = 'http://www.baidu.com'
  puts "现在页面是百度 #{first_url}"
  dr.get(first_url)
  sleep 2

#最大化浏览器窗口
c.driver.manage.window.maximize
  sleep 2
#设置浏览器为指定大小
c.driver.manage.window.resize_to(600,700) #将浏览器设置为 600*700

  sleep 2
#那么要最小化，然后我做其他的怎么办呢？
c.driver.manage.window.resize_to(0,0)
sleep 2
puts "33333"

  dr.quit() 