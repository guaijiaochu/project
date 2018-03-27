# 百度案例

# coding:utf-8

# 导入webdriver包
from selenium import webdriver

# 导入time函数
import time

# 打开浏览器
dr = webdriver.Firefox()
# dr = webdriver.Chrome()
# dr = webdriver.Ie()

# 转到淘宝主页
dr.get("http://www.baidu.com")
time.sleep(1)
dr.find_element_by_id("kw").send_keys("华为手机")
dr.find_element_by_id("su").click
