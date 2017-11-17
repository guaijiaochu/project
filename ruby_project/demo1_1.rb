# 在浏览器输入框输入京东的网址，打开页面，输入投影仪

require 'selenium-webdriver'
# require 'Keys'

@browser=Selenium::WebDriver.for :ff
@browser.get "http://www.jd.com"
@browser.find_element(:id,"key").click
@browser.find_element(:id,"key").send_key "投影仪"



sleep 1
@browser.find_element(:class,"button").click
# @browser.find_element(:class,"button").send_keys(Keys.ENTER)

sleep 2
@browser.quit


















