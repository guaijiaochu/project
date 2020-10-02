# 基本操作
# 3**3是3的3次方
print(2,2*2,3**3)

# 多重赋值
a,b,c=2,3,4
print(a,b,c)

# 字符串拼接
s="i like python"
print(s+" very much")

# while循环
e,f=0,0
while f<100:
    f=f+1
    e=e+f
print(e)

# for循环
g=0
for h in range(101):#求1-100和
    g=g+h
print(g)

# 函数
def add1(x):
    return  x+2
print(add1(3))

def add2(x=0,y=0):
    return [x+2,y+2]#返回列表
print(add2(4,5))

def add3(x,y):
    return x+3,y+3#双重返回
a,b=add3(5,6)
print(a,b)


# lambda：行函数
f=lambda x: x+2  #定义函数f(x)=x+2
g=lambda x,y: x+y#定义函数f(x,y)=x+y
