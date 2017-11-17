#进入石家庄学院官网图书馆（http://lib.sjzc.edu.cn/），以“计算机”为关键字，
#查找《写给大家看的算法书》的索书号、条码号等信息并输出。

require 'selenium-webdriver'
require 'irb'

#打开IE浏览器
@driver=Selenium::WebDriver.for :ie 

#打开谷歌浏览器
#@driver=Selenium::WebDriver.for :chrome

#窗口最大化
@driver.manage.window.maximize

#输入http://lib.sjzc.edu.cn
@driver.get "http://lib.sjzc.edu.cn"

#点击选项关键字
@driver.find_element(:id=>'opacSelect').find_elements(:tag_name=>'option')[2].click

#清空输入框
@driver.find_element(:id,"opacTxt").clear

#输入关键字内容“计算机”
@driver.find_element(:id,"opacTxt").send_key("计算机")

#点击搜索按钮
@driver.find_element(:id,"opacButton").click
#@driver.find_element(:class,"searchButton").click
#@driver.find_element(:id,"opacButton",;:class,"searchButton").click
#@driver.find_element(:name,"bbutton").click
#@driver.find_element(:xpath,"//*[@id='opacButton']").click
#@driver.find_element(:id,"nava5").find_element(:id,"opacButton").click
#@driver.find_element(:id,"nava5").find_element(:class,"searchButton").click
#@driver.find_element(:xpath,".//*[@id='front_search']/div[2]/input").click
#@driver.find_element(:xpath,"//*[@id='opacButton']").click

#窗口最大化
@driver.manage.window.maximize

=begin
#输入内容“写给大家看的算法书”
@driver.find_element(:id,"s2_text").send_key("写给大家看的算法书")

#点击在“结果中检索”按钮
@driver.find_element(:class,"btn btn-primary").click
@driver.find_element(:xpath,//*[@id="f"]/p/input[2]).click
=end



=begin
#点击“写给大家看的算法书”
@driver.find_element(:link_text,'7.写给大家看的算法书').click

#输出索书号
snum= @driver.find_element(:xpath,"//*[@id='item']/tbody/tr[2]/td[1]").text
puts "索书号： #{snum}"

#输出条码号
tnum= @driver.find_element(:xpath,"//*[@id='item']/tbody/tr[2]/td[2]").text
puts "条码号： #{tnum}"
=end

sleep 10
@driver.quit

