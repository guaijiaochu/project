#设置页面元素的定位

   require "watir"
  include Watir  
  c=Watir::Browser.new :chrome

  #设置浏览器为指定大小
c.driver.manage.window.resize_to(700,600) #将浏览器设置为 600*700
  dr=c.driver
  first_url = 'http://www.baidu.com'
  puts "现在页面是百度 #{first_url}"
  dr.get(first_url)
  sleep 1
  
#使用id定位
      #watir-webdriver 方式
      # browser.text_field(:id=>'kw').clear
      browser.text_field(:id=>'kw').set"watir-webdriver"
    

#使用name定位
      #browser.text_field(:name=>'wd').clear
      browser.text_field(:name=>'wd').set "watir-webdriver"
    
#使用class定位
      #watir-webdriver 方式
      browser.button (:class=>'s_btn').click
#使用text/link_text定位
      #watir-webdriver 方式
      browser.link(:text=>'知 道').click
#多种方式定位
      browser.button(:id=>'su',:class=>'bg s_btn').click
      #这样它就会找到同时满足 id=su 和 class=bg s_btn 的 button 了
#元素的层级定位
    browser.div(:id=>'body').span(:index=>0).click
      #找到 id=body 的 div 下面的第 1 个 span。:index 即为按索引定位。
#frame/iframe之间的定位
      browser.frame(:id=>"my_frame").div(:id=>"body").span(:index=>0).click



