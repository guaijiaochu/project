# 2.2.3数据结构
'''
python有4个内建的数据结构：统称为容器
列表元组：列表可以修改元组不可以修改
列表集合：集合元素不重复、无序，集合不支持索引

                                                            调用方式
List列表a=[1,2,3]        a[0]=1       复制列表a  b=a[:]  list('ab')=['a','b']
Tuple元组b=(1,2,3)        b(2)=2                       tuple([1,2])=(1,2)
Dictionary字典e={'你':猪}  e['today']
Set集合s={1,2,2,3}  s=set([1,2,2,3])

'''
# （1）列表
# 列表解析：
a=[1,2,3]
b=[]
for i in a :
    b.append(i+2)
print(b)
# 简化为
c=[1,2,3]
d=[i+2 for i in c ]
print(d)


# （2）字典：相当于列表但是下标从自己定义的键开始
e={'你':'猪','tomorrow':30}
e['ppp']=666
print(e['你'],e['ppp'])
# 通过dict函数创建字典,如下等价
{'today':20,'tomorrow':30}
dict([   ['today',20], ['tomorrow',30]    ])
dict.fromkeys('today', 'tomorrow', 20)

# （3）集合
s={1,2,2,3}  #会自动去重
s=set([1,2,2,3])
# 集合的无序性:
a=t|s#并集
b=t&s#交集
c=t-s#差集（在t中，不在s中）
d=t^s#对称差集（在t或者s中，不同时在两个中）

#（4）函数式编程：lamada()、map()、reduce()、fliter()
# 【1】map()----用于逐一遍历
# a=[1,2,3]给每个元素+2，得到b
b=[i+2 for i in a]
# 用map改写，比for循环效率高：定义一个函数，用map命令逐一应用到map的每个元素，最后返回一个数组
b=map(lambda x:x+2)
b=list(b)  #结果是[3,4,5]  python3中需要此句

# 【2】reduce()----用于递归计算
from fuctools import reduce
reduce(lambda x,y:  x*y ,range(1,n+1))#计算n!

# 用for循环改写
s=1
for i in range(1,n+1):
    s=s*i
# 【3】fliter()----过滤器
b=fliter (lambda x: x>5 and x<8,rang(10))
b=list(b)#返回[6,7]

# 用列表解析
b=[i for i in range(10) if i>5 and i<8]

# 【4】lambda()----行函数
f=lambda x: x+2  #定义函数f(x)=x+2
g=lambda x,y: x+y#定义函数f(x,y)=x+y