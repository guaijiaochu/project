require 'selenium-webdriver'
require 'irb'
#打开IE浏览器
@driver=Selenium::WebDriver.for :ie

#窗口最大化
@driver.manage.window.maximize

#输入http://lib.sjzc.edu.cn
@driver.get "http://210.31.252.152:8080/opac/openlink.php?keyword=%E8%AE%A1%E7%AE%97%E6%9C%BA&with_ebook=on"



#输入内容“写给大家看的算法书”
#@driver.find_element(:id,"s2_text").send_key("写给大家看的算法书")

#点击在“结果中检索”按钮
#@driver.find_element(:class,"btn btn-primary").click
#@driver.find_element(:xpath,//*[@id="f"]/p/input[2]).click

#点击“写给大家看的算法书”
@driver.find_element(:link_text,'7.写给大家看的算法书').click


#输出索书号和条码号
snum= @driver.find_element(:xpath,"//*[@id='item']/tbody/tr[2]/td[1]").text
puts "索书号： #{snum}"
tnum= @driver.find_element(:xpath,"//*[@id='item']/tbody/tr[2]/td[2]").text
puts "条码号： #{tnum}"

sleep 2

@driver.quit


