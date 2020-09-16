'''
如果你从 Python 解释器退出再进入，那么你定义的所有的方法和变量就都消失了。
为此 Python 提供了一个办法，把这些定义存放在文件中，
为一些脚本或者交互式的解释器实例使用，这个文件被称为模块。
模块是一个包含所有你定义的函数和变量的文件，其后缀名是.py。
模块可以被别的程序引入，以使用该模块中的函数等功能。这也是使用 python 标准库的方法。
一个模块只会被导入一次，不管你执行了多少次import。这样可以防止导入模块被一遍又一遍地执行。
'''
import demo13
demo13.print_func("world")


# __name__属性
# 一个模块被另一个程序第一次引入时，其主程序将运行。
# 如果我们想在模块被引入时，模块中的某一程序块不执行，
# 我们可以用__name__属性来使该程序块仅在该模块自身运行时执行。

# Filename: using_name.py
import demo13
if __name__ == '__main__':
   print('程序自身在运行')
else:
   print('我来自另一模块')


# 很多类都倾向于将对象创建为有初始状态的。因此类可能会定义一个名为 __init__() 的特殊方法（构造方法）
class Complex:
    def __init__(self, realpart, imagpart):
        self.r = realpart
        self.i = imagpart
x = Complex(3.0, -4.5)
print(x.r, x.i)   # 输出结果：3.0 -4.5