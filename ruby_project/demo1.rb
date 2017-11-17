# 在浏览器输入框输入京东的网址，打开页面，输入投影仪
require 'watir-webdriver'
require 'irb'
@browser=Watir::Browser.new :ie
@browser.goto "www.jd.com"
@browser.text_field(:id,"key").click
@browser.text_field(:id,"key").set("投影仪")
@browser.button(:class,"button").click
sleep 2
@browser.quit


















