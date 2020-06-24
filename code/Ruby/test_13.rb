#访问桔梗网
   require "watir"
  include Watir  
  c=Watir::Browser.new :chrome
  dr=c.driver
  first_url = 'http://www.jiegeng.com'
  puts "现在页面是桔梗1 #{first_url}"
  dr.get(first_url)
  sleep 1
  second_url = 'http://www.jiegeng.com/'
  puts "现在页面是桔梗2 #{second_url}"
  dr.get(second_url)
  sleep 1

  dr.quit() 