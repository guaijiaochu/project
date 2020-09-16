# 淘宝页面
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
dr.get("http://www.taobao.com")
time.sleep(1)

# 输入华为手机，点击搜索
dr.find_element_by_id("q").send_keys("华为手机")
time.sleep(3)
# # 注意此处class_name
dr.find_element_by_class_name("search-button").click
dr.find_element_by_class_name("search-button").click()


# 选择 移动4G/联通4G/电信4G
dr.find_element_by_xpath(".//*[@id='J_NavCommonRowItems_2']/a[1]/span[2]").click()
time.sleep(1)


# 点击运行内存RAM          //*[@id="spulist-nav"]/div/div[2]/div/div[5]/div[2]/div/span
dr.find_element_by_xpath("//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[2]/div/span").click()
# 此处需要等待0.5秒
time.sleep(0.5)
# 点击6G
dr.find_element_by_xpath("//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[3]/div/a[2]").click()

time.sleep(3)

dr.quit()