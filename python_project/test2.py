# 登录敏捷开发云
# 打开网址
open_url(${url})
# 输入用户名
Input(loc='//*[@id="login"]/form/div[1]/div/div[1]/input',l_type="XPATH").input(content='zhaocj',delay=1)
# 输入密码
Input(loc='//*[@id="login"]/form/div[2]/div/div/input',l_type="XPATH").input(content='123456',delay=1)
# 点击登录按钮
Input(loc='//*[@id="login"]/form/button',l_type="XPATH").click(2)



# 搜索测试用例

# 点击云商盟敏捷开发
Element(loc='//*[@id="app"]/div/div[2]/div[5]/div/ul/li/a',l_type="XPATH").click(2)

# 点击用例管理
Element(loc='//*[@id="home"]/div[2]/div[2]/ul/li[6]',l_type="XPATH").click()

# 搜索框输入“时间控件”
Input(loc='//*[@id="home"]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div/input',l_type="XPATH").input(content="时间控件",delay=2)

# 点击搜索
Element(loc='//*[@id="home"]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]',l_type="XPATH").click()

# 点击用例
Element(loc='//*[@id="home"]/div[4]/div[2]/div[2]/div[1]/div/div[3]/table/tbody/tr/td[2]/div/div',l_type="XPATH").click(2)

# 点击返回
Element(loc='//*[@id="smallContentHeight"]/form/div[8]/div/button[1]',l_type="XPATH").click(2)

# 鼠标移动到右上角
Element(loc='//*[@id="home"]/div[1]/div[3]/div[1]',l_type="XPATH").move_to(1)

# 点击退出
Element(loc='//*[@id="home"]/div[1]/div[3]/div[1]/ul/li[2]',l_type="XPATH").click(1)