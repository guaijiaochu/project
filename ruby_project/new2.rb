###################################
#百度贴吧
#
###################################
require 'selenium-webdriver'
require 'rubygems'
#打开火狐浏览器
dr=Selenium::WebDriver.for :ff

# 最大化窗口
# dr.manage.window.maximize


# 转到百度主页面
dr.get 'http://www.baidu.com'

# 点击贴吧按钮
dr.find_element(:link_text,"贴吧").click

sleep 1

# 点击登录按钮，弹出登录输入框
dr.find_element(:link_text,"登录").click
sleep 1

# 定位到弹出窗
dr.find_element(:xpath,"//li[@class='u_login']/div/a").click

# 清空账号输入框，输入账号
dr.find_element(:id,"TANGRAM__PSP_10__userName").clear()
dr.find_element(:id,"TANGRAM__PSP_10__userName").send_keys "12456789"

# 清空密码输入框，输入密码
dr.find_element(:id,"TANGRAM__PSP_10__password").clear()
dr.find_element(:id,"TANGRAM__PSP_10__password").send_keys "QWERDF"

# 输入验证码

=begin
# 记录cookie
dr.add_cookie({'name':'Login_UserNumber', 'value':'username'})
dr.add_cookie({'name':'Login_Passwd', 'value':'password'})
=end

#取消下次自动登录
dr.find_element(:id,"TANGRAM__PSP_10__memberPass").click


sleep 3
# 点击登录按钮
dr.find_element(:id,"TANGRAM__PSP_10__submit").click


sleep 1
dr.quit