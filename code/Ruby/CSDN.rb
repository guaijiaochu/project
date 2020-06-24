# 在浏览器输入框输入京东的网址，打开页面，输入投影仪

require 'selenium-webdriver'
# require 'Keys'

@browser=Selenium::WebDriver.for :ff
@browser.get "https://blog.csdn.net/m0_37690430/article/details/80369153"
# @browser.find_element(:id,"kw").click
# @browser.find_element(:id,"kw").send_key "制作u盘启动CSDN"



# sleep 1
# @browser.find_element(:id,"su").click
sleep 5
@browser.quit