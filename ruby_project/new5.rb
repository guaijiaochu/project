# 淘宝网执行相关操作
# 导入必要的包
require 'rubygems'
require 'irb'
require 'selenium-webdriver'

# 打开火狐浏览器
dr=Selenium::WebDriver.for :ff

# 打开淘宝网
dr.get "http://www.taobao.com"

dr.find_element(:id,'q').send_key "华为手机"
dr.find_element(:class,'search-button').click

# 退出
sleep 2
dr.quit