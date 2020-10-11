# 广播机制
from mxnet import nd
A = nd.arange(3).reshape((3, 1))
B = nd.arange(2).reshape((1, 2))
print("\nA输出",A)
print("\nB输出",B)
print("\nA,B输出",A,B)
'''
由于A和B分别是3⾏1列和1⾏2列的矩阵，如果要计算A + B，那么A中第⼀列的3个元素被⼴播
（复制）到了第⼆列，而B中第⼀⾏的2个元素被⼴播（复制）到了第⼆⾏和第三⾏。如此，就可以
对2个3⾏2列的矩阵按元素相加。
'''
print("\nA+B输出",A+B)







