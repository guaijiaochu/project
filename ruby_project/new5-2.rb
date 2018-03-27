#coding:utf-8
require "selenium-webdriver"
require "irb"
require 'rubygems'
# require "new5-1"为什么用require不可以？

# 执行测试用例

# 调用另一个文件的内容
load "new5-1.rb"
load "new5-3.rb"


# browser "chrome"
browser "ff"
# browser "ie"
max
website "https://www.taobao.com"
搜索华为手机
点击搜索按钮


# 退出
quit

